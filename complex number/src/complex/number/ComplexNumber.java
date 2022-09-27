/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complex.number;
/**
 *
 * @author Dell
 */
public class ComplexNumber {

    int real;
    int img;
    //constuctor
   public ComplexNumber()
    {
        real = img = 0;  
    }
    
    public ComplexNumber(int x)
    {
        real = img = x;  
    }
    
    public ComplexNumber(int x , int y )
    {
        real = x;
        img  = y;  
    }
    
    public void setrealimg (int x)
    {
        real=img= x;
    }
    
     public void setrealimg (int x , int y)
    {
        real= x;
        img=y;
        
    }
    
    public int getreal ()
    {
        return real;
    }
    
    public int getimg ()
    {
        return img;
    }
    
    public void printComplex()
    {
        if (img < 0){
        System.out.println(real + img + "i");
    
        }
        else 
        {
            System.out.println(real + "-" + img +"i" );
        }
        }

    public static void add (ComplexNumber c1 , ComplexNumber c2)
    {
        System.out.println((c1.getreal()+c2.getreal()) +"+"+ (c1.getimg()+c2.getimg())+"i" );
        
    }
    
    public static void subt(ComplexNumber c1 , ComplexNumber c2)
    {
        System.out.println((c1.getreal()-c2.getreal()) +"+"+ Math.abs(c1.getimg()-c2.getimg())+"i" );
        
    }
    
    
    }// class end
    
    


