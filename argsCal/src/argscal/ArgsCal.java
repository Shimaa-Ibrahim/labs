/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package argscal;

public class ArgsCal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         int x = Integer.parseInt(args[0]);
        for (int i=0; i<args.length ; i++)
        {

         if (i%2 != 0)
        {
          
            switch(args[i])
            {
                case "+":
                x += Integer.parseInt(args[i+1]);
                break;
                
                case "-":
                x -= Integer.parseInt(args[i+1]);

                break;
                
                case "x":
                x *= Integer.parseInt(args[i+1]);
                break;
                
                case "/":
                x /= Integer.parseInt(args[i+1]);
                break;
                
            }
            
        }

    }
                     System.out.println(x);

    }

}
        

   
        
    
    

