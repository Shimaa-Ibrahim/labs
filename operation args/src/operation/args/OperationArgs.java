/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operation.args;

/**
 *
 * @author Dell
 */
public class OperationArgs {

    /**
     * @param args the command line arguments
     */
    /*public int changeSt (String a)
    {
        int x;
        return x = Integer.parseInt(a);
    }
   */
    public static void main(String[] args) {
        for (int i=0; i<args.length ; i++)
        {
             int x ;
             
        if (i%2 != 0)
        {
          
            switch(args[i])
            {
                case "+":
                x =Integer.parseInt(args[i-1])+ Integer.parseInt(args[i+1]);
                break;
                
                case "-":
                x =Integer.parseInt(args[i-1])- Integer.parseInt(args[i+1]);
                break;
                
                case "*":
                x =Integer.parseInt(args[i-1])* Integer.parseInt(args[i+1]);
                break;
                
                case "/":
                x =Integer.parseInt(args[i-1])/ Integer.parseInt(args[i+1]);
                break;
                
            }
            System.out.println();
        }
    }
   }
    
}
