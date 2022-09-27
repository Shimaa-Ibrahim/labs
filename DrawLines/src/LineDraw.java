/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class LineDraw extends Applet {

    int x1; 
    int y1;
    int x2;
    int y2;
    @Override
    public void init() {
        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                

            }

            @Override
            public void mousePressed(MouseEvent me) {
                x1 = me.getX();
              //  x2 = me.getX();
                y1 = me.getY();
             //   y2 = me.getY();
                //repaint();
                 
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent me) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        this.addMouseMotionListener(new MouseMotionListener(){
            @Override
            public void mouseDragged(MouseEvent me) {
                 x2 = me.getX();
                 y2 = me.getY();
                 repaint();            }

            @Override
            public void mouseMoved(MouseEvent me) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        }
            
        );
       
    }

    public void paint(Graphics g){
        g.drawLine(x1, y1, x2, y2);
    }
    // TODO overwrite start(), stop() and destroy() methods
}
