/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx1.events;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import style.ButtonStyle;

/**
 *
 * @author novem
 */
public class HandleClickAnonymous 
extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button buttonOK = new Button("OK");
        buttonOK.setStyle(ButtonStyle.getStyle());
        Button buttonCancel = new Button("Cancel");
        buttonCancel.setStyle(ButtonStyle.getStyle());

        
        buttonOK.setOnAction( new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Clicked from inside an Anonymous class");
            }
        });
         
        buttonCancel.setOnAction( new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Clicked cancel from inside an Anonymous class");
            }
        });
        BorderPane pane = new BorderPane();
        pane.setTop(buttonOK);
        pane.setBottom(buttonCancel);
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}




