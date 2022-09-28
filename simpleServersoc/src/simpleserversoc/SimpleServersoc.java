/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleserversoc;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;


public class SimpleServersoc {
    ServerSocket myServerSocket;
    Socket s;
    DataInputStream dis ;
    PrintStream ps;

    public SimpleServersoc()
    {
        try
        {
            myServerSocket= new ServerSocket(5005);
            s = myServerSocket.accept();
            dis = new DataInputStream(s.getInputStream());
            ps= new PrintStream(s.getOutputStream());
            String msg= dis.readLine();
            System.out.println(msg);
            ps.println("Data Received");
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
        try
        {
            ps.close();
            dis.close();
            s.close();
            myServerSocket.close();
        }
        catch(Exception ex)
        {
        ex.printStackTrace();
        }
    }



    public static void main(String[] args) {
        new SimpleServersoc();
    }
    
}
