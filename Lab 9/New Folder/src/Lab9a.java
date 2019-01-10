import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Lab9a extends Application {
    
    public static final int NUM_BUTTONS = 10;
    
    @Override
    public void start(Stage primaryStage) {     
        Pane root =  new HBox();             
        
        Scene scene = new Scene(root, 250, 50);
        
        Button digits[] = new Button[NUM_BUTTONS];
        for (int i=0; i<NUM_BUTTONS; i++) {
            digits[i] = new Button ("" + i);
            digits[i].setOnAction( new Lab9aHandler());
            root.getChildren().add( digits[i] );
        }
        
        primaryStage.setTitle("Lab9a");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}

class Lab9aHandler implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent event) {
        System.out.println("ActionEvent " + event.getSource() );
    }
    
}
