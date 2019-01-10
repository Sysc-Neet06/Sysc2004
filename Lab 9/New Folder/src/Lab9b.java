import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Lab9b extends Application {
    
    public static final int NUM_BUTTONS = 10;
     
    @Override
    public void start(Stage primaryStage) {     
        Pane root =  new VBox();  
        Pane digitPane = new HBox();
        Pane bottomPane = new HBox();
        
        Scene scene = new Scene(root, 250, 50);
        root.getChildren().addAll(digitPane, bottomPane);
        
        TextField numberField = new TextField();
        EventHandler<ActionEvent> sharedHandler = new Lab9bHandler(numberField);
        
        Button digits[] = new Button[NUM_BUTTONS];
        for (int i=0; i<NUM_BUTTONS; i++) {
            digits[i] = new Button ("" + i);
            digits[i].setOnAction( sharedHandler );
            digitPane.getChildren().add( digits[i] );
        }
        
        numberField.setEditable(false);
        Button resetButton = new Button("Reset");
        resetButton.setOnAction( sharedHandler );
        bottomPane.getChildren().addAll( numberField, resetButton);
       
        primaryStage.setTitle("Lab9b");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}

class Lab9bHandler implements EventHandler<ActionEvent> {

    private TextField numberField;
    
    public Lab9bHandler (TextField numberField) {
        this.numberField = numberField;
    }
    @Override
    public void handle(ActionEvent event) {
        
        Object source = event.getSource();
        Button clickedButton = (Button)source;
        String button = clickedButton.getText();
        if (button.equals("Reset")) {
            numberField.clear();
        } else {
            String number = numberField.getText();
            numberField.setText(number+button);
        }
    }
    
}
