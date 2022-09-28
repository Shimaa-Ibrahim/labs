/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;

/**
 *
 * @author Dell
 */
public class NewAppletAll extends Applet {

    String [] fonts;

    @Override
    public void init() {
      fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

    }
    @Override
 public void paint(Graphics g)
   {
        g.setColor(Color.pink); 
        for (int i = 0 ; i<fonts.length ; i++) 
        {
           Font f = new Font(fonts[i] , Font.BOLD, 16);
            g.setFont(f);
            g.drawString("w" , 10 , i*20 +20 );
            g.drawString(fonts[i] , 100 , i*20+20);

            
        }
   }
    // TODO overwrite start(), stop() and destroy() methods
}
