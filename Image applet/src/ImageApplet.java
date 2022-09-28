/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

/**
 *
 * @author Dell
 */
public class ImageApplet extends Applet {

    Image img;

    @Override
    public void init() {
        img = getImage(getDocumentBase(),"1.jpg");
        System.out.println(getDocumentBase());
    }
    
    
    @Override
   public void paint(Graphics g)
   { 
       g.drawLine(1, 1, 100, 100);
       g.drawImage(img , 0 , 0 , getWidth(),getHeight(),this);
       
   }
}
