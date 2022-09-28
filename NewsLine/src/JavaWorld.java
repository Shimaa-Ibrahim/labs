/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;


public class JavaWorld extends Applet implements Runnable {

   Thread th;
   int x = 0;
   String str = "JAVA WORLD";
   String[] arr = str.split("");

   @Override
    public void init() {
        th = new Thread(this);
        th.start();
    }

   @Override
    public void paint(Graphics g)
    {
        for (int i=0 ; i < arr.length ; i++)
        {
            g.drawString(arr[i], (x + (i*10))%this.getWidth() , 100);
        }
    }

    @Override
    public void run() {
        while( x < this.getWidth())
        {

            try {
                
                x+=5;    
                repaint();                         
                Thread.sleep(50);
                if (x == this.getWidth()) {x=0;}
            } catch (InterruptedException ex) {
                Logger.getLogger(JavaWorld.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

          
        }
}
