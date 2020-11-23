/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anim;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.property.DoubleProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.util.Duration;

/**
 *
 * @author novem
 */
public class BouncingBall extends Pane{

    Integer scoreComputer = 0;
    Text text1 = new Text(10, 40, "Score Computer: " + scoreComputer);
    Integer scoreHuman = 0;
    Text text2 = new Text(350, 40, "Score Human: " + scoreHuman);
    public final double width = 70.0;
    public final double height = 20.0;
    Rectangle racket;
    public final double radius = 20;
    private double x = radius, y = radius;
    private double dx = 1, dy = 1;
    private Circle circle = new Circle(x, y, radius);
    private Timeline animation;
    
    public BouncingBall()
    {
    text1.setFont(Font.font("Impact", FontWeight.BOLD, FontPosture.ITALIC, 36));    
    getChildren().add(text1);
    text2.setFont(Font.font("Impact", FontWeight.BOLD, FontPosture.ITALIC, 36));    
    getChildren().add(text2);    
        racket = new Rectangle(width, height);
        racket.setX(400);
        racket.setY(580);  
        racket.setFill(Color.GREEN);

        getChildren().add(racket);
        circle.setFill(Color.BROWN);
        getChildren().add(circle);
        
        animation = new Timeline(
        new KeyFrame(Duration.millis(50), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                {
                    moveBall();
                }    
            }
        }));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();
    }
    
    public void moveRacketRight()
    {
        double z = racket.getX() + 10;
        racket.setX(z);
    }
    
    public void moveRacketLeft()
    {
        double z = racket.getX() - 10;
        racket.setX(z);
    }
    
    private void moveBall()
    {
        if (x < radius || x >getWidth() - radius)
        {
            dx *= -1;
        }
        if (y < radius )
        {
            dy *= -1;
        }
        if (circle.intersects(racket.getBoundsInParent()) )
        {
            dy *= -1;
            scoreHuman = scoreHuman + 1;
            text2.setText("Score Human: " + scoreHuman);
        }
        if (y > getHeight() - radius)
        {
            dy *= -1;
            scoreComputer = scoreComputer + 1;
            text1.setText("Score Computer: " + scoreComputer);
        }
        
        x+= dx;
        y += dy;
        circle.setCenterX(x);
        circle.setCenterY(y);
    }
    
    public void play()
    {
        animation.play();
    }
    
    public void pause()
    {
        animation.pause();
    }
    
    public void increaseSpeed()
    {
        animation.setRate(animation.getRate() * 1.5);
    }
    
    public void decreaseSpeed()
    {
        animation.setRate(
        animation.getRate() * 1.5 > 0 ? animation.getRate() / 1.5 : 0);
    }
    
    public DoubleProperty rateProperty()
    {
        return animation.rateProperty();
    }
}

