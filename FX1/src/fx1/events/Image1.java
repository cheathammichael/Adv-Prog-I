/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx1.events;


import javafx.geometry.Insets;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author novem
 */
public class Image1 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
    
        Pane pane = new HBox(10);
        pane.setPadding(new Insets(5, 5, 5, 5));
        Image image = new Image("images/us.gif");
        pane.getChildren().add(new ImageView(image));
        
        ImageView imageView1 = new ImageView(image);
        imageView1.setFitHeight(100);
        imageView1.setFitWidth(100);
        pane.getChildren().add(imageView1);
        
        ImageView imageView2 = new ImageView(image);
        imageView2.setRotate(90);
        pane.getChildren().add(imageView2);
        
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Flags");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
