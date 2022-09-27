/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starsprint;

/**
 *
 * @author Dell
 */
public class StarsPrint {

    /**
     * @param args the command line arguments
     */
    
    public static void printStars1 (int n)
    {
        for (int i=0; i<n ; i++)
        {
            for (int j=0 ; j<=i ; j++)
            {
               System.out.print("*");
            }
            for (int j=i ; j>0 ; j--)
            {
                System.out.print(" ");
            }
            System.out.println();

    }
    }
    
     public static void printStars2 (int n)
    {
        for (int i=0; i<n ; i++)
        {
            
            for (int j=1 ; j<n-i ; j--)
            {
                System.out.print(" ");
            }
            
            for (int j=0 ; j<i ; j++)
            {
               System.out.print("*");
            }
            
            System.out.println();

    }
    }
     
     
    public static void main(String[] args) {
        
        StarsPrint.printStars1(5);
        StarsPrint.printStars2(5);

    }
    
}
