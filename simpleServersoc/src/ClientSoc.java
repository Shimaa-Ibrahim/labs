
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class ClientSoc {
    Socket mySocket;
    DataInputStream dis ;
    PrintStream ps;
    
    public ClientSoc()
    {
        try
        {
            mySocket = new Socket("127.0.0.1", 5005);
            dis = new DataInputStream(mySocket.getInputStream());
            ps= new PrintStream(mySocket.getOutputStream());
            ps.println("Test Test");
            String replyMsg= dis.readLine();
            System.out.println(replyMsg);
            }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
        try
        {
            ps.close();
            dis.close();
            mySocket.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        } 
}
    public static void main(String[] args){
            new ClientSoc();
}
    
}
