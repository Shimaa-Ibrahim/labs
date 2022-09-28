/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Lamp extends Applet implements Runnable{
     
    Thread th;
    Color [] colors = {Color.RED ,Color.YELLOW , Color.green , Color.BLUE};
    int i = 0 ;
    @Override
    public void init() {
        th = new Thread(this);
        th.start();
    }
    @Override
    public void paint(Graphics g){
        
        g.setColor(colors[i]); 
        g.fillOval(55, 10 , 160, 30);
        g.fillOval(40,100 , 40, 55);
        g.fillOval(185,100 , 40, 55);
        g.fillOval(100,90 , 70, 80);
                
        g.setColor(Color.black); 
        g.drawLine(55,25, 20, 180);
        g.drawLine(215,25, 250, 180);
        g.drawArc(20,130,230,100,0,-180);
        
        g.drawOval(55, 10 , 160, 30);
        g.drawOval(40,100 , 40, 55);
        g.drawOval(185,100 , 40, 55);
        g.drawOval(100,90 , 70, 80);
        
        g.drawLine(125,230,105, 330);
        g.drawLine(150,230, 170, 330);
        
        g.drawRect(50, 330, 180, 30);
        
        
        //second lamp
         g.setColor(colors[i]); 
        g.fillOval(355, 10 , 160, 30);
        g.fillOval(340,100 , 40, 55);
        g.fillOval(485,100 , 40, 55);
        g.fillOval(400,90 , 70, 80);
                
        g.setColor(Color.black); 
        g.drawLine(355,25, 320, 180);
        g.drawLine(515,25, 550, 180);
        g.drawArc(320,130,230,100,0,-180);
        
        g.drawOval(355, 10 , 160, 30);
        g.drawOval(340,100 , 40, 55);
        g.drawOval(485,100 , 40, 55);
        g.drawOval(400,90 , 70, 80);
        
        g.drawLine(425,230,405, 330);
        g.drawLine(450,230, 470, 330);
        
        g.drawRect(350, 330, 180, 30);
         
    }

    @Override
    public void run() {
        while(true){
      
            try {
                 repaint();
                Thread.sleep(1000);
                 i++;

//                 if (i==4) {i=0;}
                 i %= colors.length;

            } catch (InterruptedException ex) {
                Logger.getLogger(Lamp.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    }
}
