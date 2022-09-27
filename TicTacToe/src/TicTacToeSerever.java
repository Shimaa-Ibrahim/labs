
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TicTacToeSerever {

    private ServerSocket serverSocket;
    private int currentPlayer;
    public Player players[];

    public TicTacToeSerever() {
        players = new Player[2];
        try {
            serverSocket = new ServerSocket(5005);
        } catch (IOException ex) {
            Logger.getLogger(TicTacToeSerever.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (int i = 0; i < players.length; i++) {
            try {
                Player play = new Player(serverSocket.accept(), i, this);
                players[i] = play;

            } catch (IOException ex) {
                Logger.getLogger(TicTacToeSerever.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        /*synchronized (players[0]) {
            players[0].threadSuspended = false;
            players[0].notify();

        }*/

    }

   

    public static void main(String args[]) {
        new TicTacToeSerever();
    }
}

class Player extends Thread {

    private DataInputStream dis;
    private PrintStream ps;
    private TicTacToeSerever server;
    private int playerNumber;
    private String XOsign;
    public boolean threadSuspended = true;
    int num;
     private int currentPlayer = 0;

    public String gameBoard[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i"};

    public Player(Socket cs, int num, TicTacToeSerever s) {
         for (int i = 0 ; i < 9 ; i ++) { System.out.println(gameBoard[i]);}
        XOsign = (num == 0 ? "X" : "O");
        try {
            dis = new DataInputStream(cs.getInputStream());
            ps = new PrintStream(cs.getOutputStream());
        } catch (IOException ex) {
            Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
        }
        server = s;
        playerNumber = num;
        start();

    }

    @Override
    public void run() {
        ps.println(XOsign);
        System.out.println(XOsign);

        //play game 
        boolean gameOver = false;
        try {
            String str = dis.readLine();
            System.out.println(str);
        } catch (Exception e) {
        }

        while (!gameOver) {
            try {
                num = Integer.parseInt(dis.readLine());
                System.out.println(num);
                playerTurn(num, playerNumber);
                sendMessageToAll(num);
                for (int i = 0 ; i < 9 ; i ++) { System.out.print(gameBoard[i]);}

            } catch (IOException ex) {
                Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (gameOver()) {
                gameOver = true;
            }
        }
    }

    void sendMessageToAll(int number) {
        for (Player p : server.players) {
            for (int i = 0; i <gameBoard.length; i++) {
                if (i == number) {
                    p.ps.println(Integer.toString(number));
                   // p.ps.println(gameBoard[number]);

                }
            }

        }
    }
         public synchronized boolean playerTurn(int location, int player) {

        while (player != currentPlayer) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (gameBoard[location] == "X" || gameBoard[location] == "O") {
            return false;
            } else {
            gameBoard[location] = (currentPlayer == 0 ? "X" : "O");
            System.out.println(gameBoard[location]);
            currentPlayer = (currentPlayer + 1) % 2;
            notify();
            return true;

        
        }
    }

    public boolean gameOver() {
        int flag = 0;
        if (gameBoard[0] == gameBoard[1] && gameBoard[0] == gameBoard[2]) {
            flag = 1;
            System.out.println(gameBoard[0] + "won");
        } else if (gameBoard[3] == gameBoard[4] && gameBoard[3] == gameBoard[5]) {
            flag = 1;
            System.out.println(gameBoard[3] + "won");

        } else if (gameBoard[6] == gameBoard[7] && gameBoard[6] == gameBoard[8]) {
            flag = 1;
            System.out.println(gameBoard[6] + "won");

        } else if (gameBoard[0] == gameBoard[3] && gameBoard[0] == gameBoard[6]) {
            flag = 1;
            System.out.println(gameBoard[0] + "won");

        } else if (gameBoard[1] == gameBoard[4] && gameBoard[1] == gameBoard[7]) {
            flag = 1;
            System.out.println(gameBoard[1] + "won");

        } else if (gameBoard[2] == gameBoard[5] && gameBoard[2] == gameBoard[8]) {
            flag = 1;
            System.out.println(gameBoard[2] + "won");

        } else if (gameBoard[0] == gameBoard[4] && gameBoard[0] == gameBoard[8]) {
            flag = 1;
            System.out.println(gameBoard[0] + "won");

        } else if (gameBoard[2] == gameBoard[4] && gameBoard[2] == gameBoard[6]) {
            flag = 1;
            System.out.println(gameBoard[2] + "won");

        }

        if (flag == 1) {
            return true;
        } else {
            return false;
        }

    }
    }

