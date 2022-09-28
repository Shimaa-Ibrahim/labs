/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author Dell
 */
public class TicToeServer extends Application {

    int row = 0;
    int column = 0;
    GridPane boardPane = new GridPane();
    Button[] buttonsBoard;
    ServerSocket serverSocket;
    Socket s;
    DataInputStream dis;
    PrintStream ps;

    @Override
    public void init() {
         buttonsBoard = new Button[3 * 3];

        try {
            serverSocket = new ServerSocket(5005);
            s = serverSocket.accept();
            dis = new DataInputStream(s.getInputStream());
            ps = new PrintStream(s.getOutputStream());
        } catch (IOException ex) {
            Logger.getLogger(TicToeServer.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void start(Stage primaryStage) {

        for (int i = 0; i < buttonsBoard.length; i++) {
            buttonsBoard[i] = new Button();
            buttonsBoard[i].setPrefSize(90, 90);
            buttonsBoard[i].setFocusTraversable(false);
            GridPane.setMargin(buttonsBoard[i], new Insets(0));
            buttonsBoard[i].setFont(Font.font("Arial", FontWeight.BOLD, 40));
            boardPane.add(buttonsBoard[i], column, row);
            buttonsBoard[i].setOnAction(new EventHandler<ActionEvent>(){
                @Override
                public void handle(ActionEvent event) {
                    
                }
                
            });
            column++;
            if (column == 3) {
                row++;
                column = 0;
            }
        }
        boardPane.setPrefSize(300, 300);
        Scene scene = new Scene(boardPane, 400, 400);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
