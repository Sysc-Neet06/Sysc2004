/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9a;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Neethan Sri
 */
public class Lab9a extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Pane root = new VBox();
        Pane branch1 = new HBox();
        Pane branch2 = new HBox();
        Scene scene = new Scene(root, 300, 250);
        TextField tf = new TextField();
        tf.setEditable(false);
        lab9b lab9 = new lab9b(tf);
        Button bu[] = new Button[10];
        for(int i = 0; i < 10; i++){
            bu[i] = new Button("" + i);
            bu[i].setOnAction((ActionEvent event) -> {
                lab9.handle(event);
            });
            branch1.getChildren().add(bu[i]);
        }
        
        Button reset = new Button("reset");
        reset.setOnAction((ActionEvent event) -> {
            lab9.handle(event);
        });
        
        
        root.getChildren().add(branch1);
        branch2.getChildren().add(tf);
        branch2.getChildren().add(reset);
        root.getChildren().add(branch2);
        
        primaryStage.setTitle("Lab8");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

class lab9b implements EventHandler<ActionEvent>{
    
     private TextField numberField;
     
     public lab9b( TextField numberField){
         this.numberField = numberField;
         
     }
     @Override
     public void handle (ActionEvent event) {
            
        Button pressed = (Button)event.getSource();
        if(pressed.getText() != null){
            numberField.setText( numberField.getText() + pressed.getText());
        }else{
            numberField.clear();
            }

}
}
