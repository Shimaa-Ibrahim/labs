/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author Dell
 */
public class TicTacToeClient extends Application {

    private int row = 0;
    private int column = 0;
    private GridPane boardPane = new GridPane();
    private Button[] buttonBoard;
    private Socket mySocket;
    private DataInputStream dis;
    private PrintStream ps;
    private String myXOsign;
    public int sourceNo;
    private int i;
    Button test = new Button();
    BorderPane bigPane = new BorderPane();
    private int receivedbuttonNumber;
    private String receivedXO;
    private int counter = 0;

    @Override
    public void init() {
        buttonBoard = new Button[9];
        try {
            mySocket = new Socket("127.0.0.1", 5005);
            dis = new DataInputStream(mySocket.getInputStream());
            ps = new PrintStream(mySocket.getOutputStream());
        } catch (IOException ex) {
            Logger.getLogger(TicTacToeClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    myXOsign = dis.readLine();
                    test.setText(myXOsign);

                } catch (IOException ex) {
                    Logger.getLogger(TicTacToeClient.class.getName()).log(Level.SEVERE, null, ex);
                }

                while (true) {
                    try {
                        receivedbuttonNumber = Integer.parseInt(dis.readLine());
                        System.out.println(receivedbuttonNumber);
                        //rececivedXO = dis.readLine();
                        //System.out.println(rececivedXO);
                        setButtonText(receivedbuttonNumber);
                    } catch (IOException ex) {
                        Logger.getLogger(TicTacToeClient.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            }

        }).start();

    }

    @Override
    public void start(Stage primaryStage) {

        for (i = 0; i < buttonBoard.length; i++) {
            buttonBoard[i] = new Button();
            buttonBoard[i].setPrefSize(100, 100);
            buttonBoard[i].setFocusTraversable(false);
            GridPane.setMargin(buttonBoard[i], new Insets(0.5));
            buttonBoard[i].setFont(Font.font("Arial", FontWeight.BOLD, 40));
            boardPane.add(buttonBoard[i], column, row);
            buttonBoard[i].setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    sendMessage(event);
                }

            });
            column++;
            if (column == 3) {
                row++;
                column = 0;
            }
        }

        boardPane.setPrefSize(300, 300);
        bigPane.setTop(boardPane);
        bigPane.setCenter(test);
        Scene scene = new Scene(bigPane, 300, 400);
        primaryStage.setTitle("Tic Tac Toe!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void sendMessage(ActionEvent e) {
        Button clickedButton = (Button) e.getSource();
        for (int i = 0; i < buttonBoard.length; i++) {
            if (clickedButton == buttonBoard[i]) {
                sourceNo = i;
            }
        }
        if (sourceNo > -1) {
            ps.println(Integer.toString(sourceNo));
        }
        System.out.println(sourceNo);
    }

    public void setButtonText(int x) {
        counter++;
        receivedXO = (counter == 1 ? "X" : "O");
        buttonBoard[x].setText(receivedXO);
        if (counter>2){counter = 1 ;}

    }

    public static void main(String[] args) {
        launch(args);
    }

}
