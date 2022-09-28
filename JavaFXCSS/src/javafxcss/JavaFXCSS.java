/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxcss;

import java.io.File;
import java.net.URL;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Dell
 */
public class JavaFXCSS extends Application {

    @Override
    public void start(Stage primaryStage) {
        Rectangle rec = new Rectangle(300, 300);
        rec.setId("gradient");
        StackPane roo = new StackPane();
        Text hello = new Text("Hello World");
        hello.setFill(Color.RED);
        hello.setFont(Font.font(null, FontWeight.BOLD, 32));
        Reflection r = new Reflection();
        r.setFraction(0.9);
        hello.setEffect(r);
        roo.getChildren().addAll(rec, hello);
        Scene scene = new Scene(roo, 300, 250);
        File f = new File("src/s.css");
        scene.getStylesheets().add("file:///" + f.getAbsolutePath().replace("\\", "/"));

        //scene.getStylesheets().add(getClass().getResource("s.css").toString());
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
