import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import java.util.Random;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/*
By NEethan Sri
*/
public class MonopolyGame extends Application implements Observer
{
    /**
     * The game board.
     */
    private Board board;
    
    /**
     * The dice shared by all players.
     */
    private Random dice;
        
    /**
     * The list of players.
     */
    private ArrayList<Player> players;
    private HashMap<String,TextField> playerTextFieldMap;
    
    /**
     * Number of rounds to play.
     */
    private int rounds;
 
    /**
     * Constructs a new MonopolyGame that plays the specified number of 
     * rounds.
     */
    
    public MonopolyGame()
    {
        this.rounds = 10;      
        this.board = new Board();
        this.dice = new Random();
        this.players = new ArrayList(); 
        this.playerTextFieldMap = new HashMap();
        
        addPlayer("Purple");
        addPlayer("Red");
    }
    
 
    /**
     * Adds a player to the game.
     * 
     * @param name The player's name.
     */
    public void addPlayer(String name)
    {
        players.add(new Player(name, board.startingSquare()));
    }
    
    /**
     * Plays 1 or more rounds of the game.
     */
    public void playGame()
    {
        for (int i = 0; i < rounds; i++) {
            playRound();
        }
    }
    
    /**
     * Plays one round of the game, requesting each player to take one turn.
     */
    private void playRound()
    {
        if (--rounds == 0) {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Monopoly Game");
            alert.setHeaderText("Game Over");
            alert.setContentText("Player " + getWinner() + " wins!");
            alert.showAndWait();
            System.exit(0);
        }
        for (Player player: players) {
            int roll = dice.nextInt(11) + 1;  // Want 1 to 12, not 0 to 11
            Square dest = board.getNextSquare(player.getLocation(), roll);
            System.out.println("Player " + player.getName() + " " + dest);
            try {
                dest.landOn(player);                
            } catch (BankruptException e) { 
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Monopoly Game");
                alert.setHeaderText("Player Out");
                alert.setContentText("Player " + player.getName() + " is out of money" + "Player " + getWinner() + " wins!");
                alert.showAndWait();
                System.exit(0);
            } catch (Exception e) { 
                // TBD
            }    
        }
    }
    
    private String getWinner() {
        
        Player winner = null;
        for (Player player: players) {
            if (winner == null) winner = player;
            else {
                if (player.compareTo(winner)>0) {
                    winner = player;
                }
            }
        }
        return winner.getName();
    }
    
    @Override
    public void start(Stage primaryStage) {
           
       
        Button btn = new Button();
        btn.setText("Roll");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                playRound();
            }
        });
        
        VBox root = new VBox();
        root.getChildren().add(btn);
        
        for (Player p: players) {
            HBox entry = new HBox();
            root.getChildren().add(entry);
            Label l = new Label(p.getName());
            TextField tf = new TextField(p.getLocation().getName() + " : $" + p.netWorth());
            tf.setPrefColumnCount(15);
            //TextField tf = new TextField(p.toString());
            entry.getChildren().addAll(l,tf);
            playerTextFieldMap.put(p.getName(), tf);
            p.addObserver(this);
            
        }

        
        
        Scene scene = new Scene(root, 350, 100);
        
        primaryStage.setTitle("Monopoly");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // MonopolyGame game = new MonopolyGame(10);
       // game.addPlayer("Purple");
       // game.addPlayer("Red");
        launch(args);
    }

    @Override
    public void update(Observable o, Object arg) {
        Player p = (Player)o;
        String pName = p.getName();
        String pLocation = p.getLocation().getName();
        TextField tf = playerTextFieldMap.get(pName);
        tf.setText(p.getLocation().getName() + " : $" + p.netWorth());
        
    }

}

        
    