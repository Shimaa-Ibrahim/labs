/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starprint;

public class StarPrint {

    public static void printStar1(int n)
    {
        for (int i = 0 ; i<n ; i++)
        {
            for (int j = 0 ; j<=i ; j++)
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
    
    
    public static void printStar2(int n)
    {
        
        for (int i = 0 ; i<n ; i++)
        {
            for (int j =n-i ; j>0 ; j--)
            {
              System.out.print(" ");

            }
            
            for (int j =0 ; j<=i ; j++)
            {
              System.out.print("* ");

            }
            System.out.println();

         }
             
    }

    
    public static void main(String[] args) {
        StarPrint.printStar1(5);
        
         System.out.println();

        StarPrint.printStar2(5);

    }
    
}
