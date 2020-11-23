/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx1.events;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

/**
 *
 * @author novem
 */
public class ShowEllipse1 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        Scene scene = new Scene(new My32Ellipses(), 800, 600);
        primaryStage.setTitle("Show 32 Ellipses ");
        primaryStage.setScene(scene);
        primaryStage.show();
    
    }
    public static void main(String[] args) {
        launch(args);
    }
}
class My32Ellipses extends Pane
{
    private void paint32Ellipses()
    {
        getChildren().clear();
        for (int i = 0; i < 32; i++)
        {
            Ellipse e1 = new Ellipse(
            getWidth()/2, getHeight()/2, 
            getWidth()/2 - 120, getHeight()/2 - 120);
            
            e1.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
            
            e1.setFill(Color.WHITE);
            e1.setRotate(i * 180 /32);
            getChildren().add(e1);
        }

    }
            @Override public void setWidth(double width)
        {
         super.setWidth(width); paint32Ellipses();   
        }
            @Override public void setHeight(double height)
            {
                super.setHeight(height);
                paint32Ellipses();
            }
}