/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipcutter;
import java.util.*; 


public class IPcutter {

    public static void main(String[] args) {
        
        for (int i=0; i<args.length; i++)
        {
          StringTokenizer st=new StringTokenizer(args[i],".");
          while (st.hasMoreTokens()) 
          {
              System.out.println(st.nextToken());
          }
        }
    }
}//class end
