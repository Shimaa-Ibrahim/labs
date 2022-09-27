/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.effect.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

/**
 *
 * @author Dell
 */
public class JavaFXApplication2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Rectangle rec = new Rectangle(300,300);
        Stop [] stops = new Stop []{new Stop(0,Color.BLACK), new Stop(0.5,Color.WHITE),new Stop(1,Color.BLACK)};
        LinearGradient g = new LinearGradient(0,1,0,0,true,CycleMethod.REFLECT,stops);
        rec.setFill(g);
        StackPane roo = new StackPane();
        Text hello = new Text("Hello World");
        hello.setFill(Color.RED);
        hello.setFont(Font.font(null,FontWeight.BOLD , 32));
        Reflection r = new Reflection();
        r.setFraction(0.9);
        hello.setEffect(r);
        rec.setEffect(r);
        roo.getChildren().addAll(rec,hello);
        Scene scene1 = new Scene(roo, 300, 250);
        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
