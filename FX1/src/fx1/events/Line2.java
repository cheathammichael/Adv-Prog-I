/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx1.events;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 *
 * @author novem
 */
public class Line2 extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
       
    Scene scene = new Scene(new LinePane2(), 200, 200);
    primaryStage.setTitle("ShowLine");
    primaryStage.setScene(scene);
    primaryStage.show();
        
    }
    public static void main(String[] args) {
        launch(args);
    }
}

class LinePane2 extends Pane
{
    public LinePane2()
    {
        Line line1 = new Line(10, 10, 11, 11);
        line1.endXProperty().bind(widthProperty().subtract(10));
        line1.endYProperty().bind(heightProperty().subtract(10));
        line1.setStrokeWidth(5);
        line1.setStroke(Color.GREEN);
        this.getChildren().add(line1);
        
        Line line2 = new Line(10, 10, 11, 11);
        line2.startXProperty().bind(widthProperty().subtract(10));
        line2.endYProperty().bind(heightProperty().subtract(10));
        line2.setStrokeWidth(5);
        line2.setStroke(Color.GREEN);
        this.getChildren().add(line2);
        
        Line line3 = new Line(10, 10, 11, 11);
        line3.startXProperty().bind(widthProperty().divide(2));
        line3.endXProperty().bind(widthProperty().divide(2));
        line3.endYProperty().bind(heightProperty().subtract(10));
        line3.setStrokeWidth(10);
        line3.setStroke(Color.RED);
        this.getChildren().add(line3);
    }
}
