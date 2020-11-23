/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx1.events;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author novem
 */
public class ShowGridPane1 extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
    
        GridPane pane = new GridPane();
       pane.setAlignment(Pos.CENTER);
       pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
       pane.setHgap(5.5);
       pane.setVgap(5.5);
       
       pane.add(new Label("First Name:"), 0, 0);
       pane.add(new TextField(), 1, 0);
       pane.add(new Label("MI:"), 0, 1);
       pane.add(new TextField(), 1, 1);
       pane.add(new Label("Last Name:"), 0, 2);
       pane.add(new TextField(), 1, 2);
       Button button = new Button("Add Name");
       pane.add(button, 1, 3);
       GridPane.setHalignment(button, HPos.RIGHT);
       
       Scene scene = new Scene(pane);
       primaryStage.setTitle("ShowGridPane");
       primaryStage.setScene(scene);
       primaryStage.show();
    
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
