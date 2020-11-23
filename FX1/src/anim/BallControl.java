/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anim;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author novem
 */
public class BallControl extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
    
        StackPane rootPane = new StackPane();
        Scene scene = new Scene(rootPane, 800, 600);
        BouncingBall bouncingBall = new BouncingBall();
        rootPane.getChildren().addAll(bouncingBall);
        primaryStage.setTitle("Bouncing Ball Control");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        bouncingBall.requestFocus();
        
        bouncingBall.setOnMousePressed( new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                
            
                bouncingBall.pause();
                
            }
        });
        
        bouncingBall.setOnMouseReleased( e->
        {
            bouncingBall.play();

        });
        
        
        
              bouncingBall.setOnKeyPressed( new EventHandler<KeyEvent>() {

            @Override
            public void handle(KeyEvent event) {
                if (event.getEventType() != KeyEvent.KEY_PRESSED)
                {
                    return;
                }
                KeyCode code = event.getCode();
                if (code == KeyCode.UP)
                {
                    bouncingBall.increaseSpeed();
                }
                if (code == KeyCode.DOWN)
                {
                    bouncingBall.decreaseSpeed();
                }
                if (code == KeyCode.LEFT)
                {
                    bouncingBall.moveRacketLeft();
                }
                 if (code == KeyCode.RIGHT)
                {
                    bouncingBall.moveRacketRight();
                }
            }
        });
         
        ///////////////////////////////////////////
           
      
         
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
