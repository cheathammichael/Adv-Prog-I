/* 
* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx1.events;

import javafx.geometry.Insets;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ImageArray1 extends Application {

    @Override
    public void start(Stage primaryStage) {

        ImageView[] images = new ImageView[]
        {
            new ImageView("images/us.gif"),
            new ImageView("images/ca.gif"),
            new ImageView("images/dn.gif"),
            new ImageView("images/uk.gif"),
            new ImageView("images/fr.gif"),
            new ImageView("images/dl.gif"),
            new ImageView("images/ch.gif"),
        };

        Pane hb = new HBox(10);
        hb.setPadding(new Insets(5, 5, 5, 5));

        for (int i = 0; i < 7; ++i) {
            images[i].setFitWidth(150);
            images[i].setFitHeight(100);
            hb.getChildren().add(images[i]);
        }

        Scene scene = new Scene(hb);
        primaryStage.setTitle("Flags");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
