package fx1;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Checkerboard extends Application {
    //standard pane, not scalable
    Pane root = new Pane();
    private int size = 8;

    @Override
    public void start(Stage primaryStage) {
        
    Rectangle[][] arr1 = new Rectangle[8][8];
    Scene scene = new Scene(root, 800, 800);
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                Rectangle square = new Rectangle();
                Color color;
                Integer int1 = row;
                Integer int2 = col;
                square.widthProperty().bind(root.widthProperty().divide(10));
                square.heightProperty().bind(root.heightProperty().divide(10));
                square.xProperty().bind((square.widthProperty().multiply(int1)));
                square.yProperty().bind((square.heightProperty().multiply(int2)));               
                if ((row + col) % 2 == 0) color = Color.YELLOW;
                else color = Color.BLUE;
                square.setFill(color);  
                arr1[row][col]= square;
            }
        }
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                root.getChildren().add(arr1[col][row]);
            }
            }
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}