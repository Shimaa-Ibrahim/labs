
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author Dell
 */
public class Testing extends Application implements Runnable {

    private int row = 0;
    private int column = 0;
    private GridPane boardPane = new GridPane();
    private Button[] buttonBoard;
    private Socket mySocket;
    private DataInputStream dis;
    private PrintStream ps;
    private String myXOsign;
    private boolean playerTurn;
    private int location;
    private int i;

    @Override
    public void init() {
        buttonBoard = new Button[9];
        try {
            mySocket = new Socket("127.0.0.1", 5005);
            dis = new DataInputStream(mySocket.getInputStream());
            ps = new PrintStream(mySocket.getOutputStream());
        } catch (IOException ex) {
            Logger.getLogger(Testing.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    

private void actionPerform()
    {
        for (i = 0; i < buttonBoard.length; i++){
            ps.print(i);
        }
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
            buttonBoard[i].setOnAction(new EventHandler() {
                @Override
                public void handle(Event event) { 
                   
                        actionPerform();
      
                }

            });
            column++;
            if (column == 3) {
                row++;
                column = 0;
            }
        }
        
       

        boardPane.setPrefSize(300, 300);
        Scene scene = new Scene(boardPane, 300, 300);
        primaryStage.setTitle("Tic Tac Toe!");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void run() {
     
        while (true){
            try {
                int buttonNumber = dis.read();
                for (int j = 0; j <buttonBoard.length;j++){
                    buttonBoard[buttonNumber].setText("*");
                }
            } catch (IOException ex) {
                Logger.getLogger(Testing.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }

    }

}
