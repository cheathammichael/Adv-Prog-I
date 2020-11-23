/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx1;

import javafx.scene.paint.Color;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author novem
 */
public class ShowRectangleProportional extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Rectangle c = new Rectangle(30, 30, 88 , 44);
        c.widthProperty().bind( pane.widthProperty().divide(2) );
        c.heightProperty().bind( pane.heightProperty().divide(2) );
        pane.getChildren().add(c);
        Scene scene = new Scene(pane, 300, 200);
        c.setStroke(Color.BLUE);
        c.setFill(Color.GREEN);
        c.setX(50);
        c.setY(50);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    
    public static void main(String[] args) {
        launch(args);
    }
}
