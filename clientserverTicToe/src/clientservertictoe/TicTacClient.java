/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientservertictoe;


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
public class TicTacClient extends Application {

    int row = 0;
    int column = 0;
    GridPane boardPane = new GridPane();
    TextArea[] textAreaBoard;

    @Override
    public void init() {
        textAreaBoard = new TextArea[3 * 3];
    }

    @Override
    public void start(Stage primaryStage) {

        for (int i = 0; i < textAreaBoard.length; i++) {
            textAreaBoard[i] = new TextArea();
            textAreaBoard[i].setPrefSize(90, 90);
            textAreaBoard[i].setFocusTraversable(false);
            GridPane.setMargin(textAreaBoard[i], new Insets(1));
            textAreaBoard[i].setFont(Font.font("Arial", FontWeight.BOLD, 40));
            boardPane.add(textAreaBoard[i], column, row);
            /*textAreaBoard[i].addEventHandler(ActionEvent.ACTION, e -> {
                actionPerformed(e);
            });*/

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
