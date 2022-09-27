
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClientChat extends JFrame {

    String str;
    Socket mySocket;
    DataInputStream dis;
    PrintStream ps;
    String msg;

    public ClientChat() throws IOException {
        mySocket = new Socket("127.0.0.1", 5005);
        dis = new DataInputStream(mySocket.getInputStream());
        ps = new PrintStream(mySocket.getOutputStream());

        this.setLayout(new FlowLayout());
        JTextArea ta = new JTextArea(20, 30);
        ta.disable();
        JScrollPane scroll = new JScrollPane(ta);
        scroll.setViewportView(ta);
        JTextField tf = new JTextField(30);
        JButton okButton = new JButton("Send");

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                str = tf.getText();
                ps.println(str);
                tf.setText("");
                System.out.println(str);
            }
            });
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            while (true) {
                                
                                msg = dis.readLine();
                                if (msg !="")
                                {ta.append(msg+"\n");
                                }
                                
                            }
                        } catch (IOException ex) {}
                    }
                    
                }).start();

            

        

        add(scroll);
        add(tf);
        add(okButton);

    }

    public static void main(String args[]) throws IOException {
        ClientChat ui = new ClientChat();
        ui.setSize(400, 500);
        ui.setVisible(true);

    }
}
