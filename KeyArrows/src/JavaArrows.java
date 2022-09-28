/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class JavaArrows extends Applet {

   int x = 0;
   int y = 100;
   String str = "JAVA WORLD";
   String[] arr = str.split("");

   @Override
    public void init() {
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent ke) {
         
           
                 if (ke.getKeyCode() == KeyEvent.VK_RIGHT){
                    x+=5;
                    repaint();
                    
                }
                else if (ke.getKeyCode()== KeyEvent.VK_LEFT){
                     x-=5;
                    repaint();
                    
                }
                else if (ke.getKeyCode()== KeyEvent.VK_DOWN){
                     y+=5;
                    repaint();
                    
                }
                else if (ke.getKeyCode()== KeyEvent.VK_UP){
                     y-=5;
                    repaint();
                    
                }
    

            }

            @Override
            public void keyReleased(KeyEvent ke) {}
        }
        );
    }
   @Override
   public void paint(Graphics g){
        for (int i=0 ; i < arr.length ; i++)
        {
            g.drawString(arr[i], ( x + (i*10))%this.getWidth() , y%this.getHeight());
        }

}


}
