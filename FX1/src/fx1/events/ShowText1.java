/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx1.events;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author novem
 */
public class ShowText1 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
    
        Pane pane = new Pane();
        pane.setPadding(new Insets(5, 5, 5, 5));
        Text text1 = new Text(40, 40, "Java Programming is bold and beautiful!");
        
        text1.setFont(Font.font("Impact", FontWeight.BOLD, FontPosture.ITALIC, 36));
        pane.getChildren().add(text1);
        
        Text text2 = new Text(60, 60, "Java Programming is fun\nChallenging!");
        pane.getChildren().add(text2);
        
        Text text3 = new Text(10, 100, "C# Programming is not as beautiful"
        + " as Java programming!\nTry it");
        text3.setFill(Color.RED);
        text3.setUnderline(true);
        text3.setStrikethrough(true);
        text3.rotateProperty().add(90);
        pane.getChildren().add(text3);
        
        Scene scene = new Scene(pane);
        primaryStage.setTitle("ShowText");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
