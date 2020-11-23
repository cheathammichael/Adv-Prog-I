/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx1.events;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 *
 * @author novem
 */
public class Line0 extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
    Pane pane = new Pane();
    Scene scene = new Scene(pane);
    primaryStage.setTitle("ShowLine");
    primaryStage.setScene(scene);
    
    Line line = new Line();
    line.setStartX(0.0f);
    line.setStartY(0.0f);
    line.setEndX(100.0f);
    line.setEndY(100.0f);
    
    pane.getChildren().add(line);
    primaryStage.show();
        
    }
    
    public static void main(String[] args) {
        
        launch(args);
        
    }
    
}
