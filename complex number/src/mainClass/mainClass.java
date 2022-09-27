/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainClass;
import complex.number.*;
public class MainClass {
    public static void main (String[] args)
    {
        
        ComplexNumber c1 = new ComplexNumber(2);
        ComplexNumber c2 = new ComplexNumber(4,5);
        
        c1.printComplex();
        c2.printComplex();
        
        ComplexNumber c3 = new ComplexNumber();
        c3.setrealimg(6, -3);
        c3.printComplex();
        
        System.out.println("print real and img using getter :" + c3.getreal()+":"+ c3.getimg());
        
        ComplexNumber.add(c1,c2);
        ComplexNumber.subt(c3,c2);
        
        
           
    
    }
}
