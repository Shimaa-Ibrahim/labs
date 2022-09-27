/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sun.corba.se.impl.orbutil.graph.Graph;
import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Xbutton extends Applet {

    int x; 
    Button b1;
    Button b2;
  
    public void init() {
        b1 = new Button("++");
        b2 = new Button("--");
        b1.addActionListener( new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (x<10)
                {
                    x++;
                    repaint();
                }
            }
            
        }
        
        );
        
        b2.addActionListener( new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (x>0)
                {
                    x--;
                    repaint();
                }
            }
            
        }
        
        );
        add(b1);
        add(b2);
    }
    
    @Override
    public void paint(Graphics g){
    g.drawString("X = " + x , 150 , 100);
}
}
