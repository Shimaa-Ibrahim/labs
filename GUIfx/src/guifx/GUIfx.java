/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guifx;

import javafx.scene.shape.Rectangle;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.effect.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
//import javafx.scene.effect.Reflection;




/**
 *
 * @author Dell
 */
public class GUIfx extends Application {

    @Override
    public void start(Stage primaryStage) {
        Rectangle rec = new Rectangle(300,300);
        Stop [] stops = new Stop []{new Stop(0,Color.BLACK), new Stop(1,Color.WHITE)};
        LinearGradient g = new LinearGradient(1,0,1,1,true,CycleMethod.REFLECT,stops);
        rec.setFill(g);
        StackPane roo = new StackPane();
        Text hello = new Text("Hello World");
        hello.setFill(Color.BISQUE);
        //Reflection  reflection = new Reflection(); 
        
        //hello.setEffect(r);
        roo.getChildren().addAll(rec,hello);
        Scene scene1 = new Scene(roo, 300, 250);
        primaryStage.setScene(scene1);
        primaryStage.show();

        
        //Scene scene2 = new Scene(ro, 300, 250);

        primaryStage.setTitle("Hello World!");

       // primaryStage.setScene(scene2);
        //primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
