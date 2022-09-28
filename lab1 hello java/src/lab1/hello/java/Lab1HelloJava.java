/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.hello.java;

/**
 *
 * @author Dell
 */
public class Lab1HelloJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello, JAVA from ");
        
        for (int i = 0 ; i<args.length ; i++)
        {
             System.out.println(args[i]+ " ");
        }
        
    }
    
}
