/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appletname;
import java.applet.Applet;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;


public class AppletName extends Applet {

    String [] fonts;
    
    @Override
   public void init()
   {
        fonts = Toolkit.getDefaultToolkit().getFontList();
   }
  
    @Override
   public void paint(Graphics g)
   {
       System.out.print("ssss");
        for (int i = 0 ; i<fonts.length ; i++) 
        {
           Font f = new Font(fonts[i] , Font.BOLD, 16);
            g.setFont(f);
            g.drawString("w" , 0 , i );
            g.drawString(fonts[i] , 10 , i );

            
        }
   }
           
           
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
