/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx1.events;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author novem
 */
public class FontDemo1 extends Application{

    @Override // Override the start method in the application class
    public void start(Stage primaryStage) {
        
        //>Create a pane to hold the circle and Label
    Pane pane = new StackPane();
    //>Create a scene and place it on the stage
    Scene scene = new Scene(pane);
    //>Add the scene to the stage
    primaryStage.setScene(scene);
    primaryStage.setTitle("FontDemo1");// set the stage title
    
    //VCreate node Circle and add to pane
    Circle circle = new Circle();
    circle.setRadius(300);
    circle.setStroke(Color.BLACK);
    circle.setFill(new Color(0.9, 0.1, 0.1, 0.1));
    pane.getChildren().add(circle); //add circle to the pane
    
    //>Create Node Label and add to Pane
    Label label = new Label("JavaFX");
    //>>Font created via static method font() and
    //set the font into the label
    label.setFont(Font.font("Comic sans MS", FontWeight.BOLD, FontPosture.ITALIC, 96));
    label.setTextFill(Color.RED);
    pane.getChildren().add(label);
    primaryStage.show();
    
    
    }
        public static void main(String[] args) {
        launch(args);
    }
}
