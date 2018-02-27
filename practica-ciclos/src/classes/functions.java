/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
//sximport javax.swing.JOptionPane;

import java.lang.reflect.Array;
import java.util.Arrays;


//import java.util.Arrays;

/**
 *
 * @author Lanford
 */
public class functions {
    public void printInitial(int limit){
        String buffer;
        buffer = "*";
        System.out.println("Imprimiendo Inicial de " + limit + " líneas\n");
        for(int cont = 1; cont < limit; cont++) {
            System.out.println('*');
            buffer = buffer.concat("*");
        }
        System.out.println(buffer + "\n");
    }
    
    public void printPyramid(int limit){}
    
    public void printInvertedPyramid(int limit){
        String buffer = "";
        
        
        for(int cont = 0; cont < limit; cont++){
            buffer = buffer.concat("*");
            if(buffer.length() == limit) {
                System.out.println(buffer);
                for(int cont2 = 0; cont2 > limit; limit--) {
                    System.out.println("cont2: " + cont2 + "\n" + " limit:" + limit);
                }
            }
        }
    }
    
    public void print90DegreePyramid(int limit){
        String buffer;
        buffer = "";
        for(int cont = 0; cont < limit; cont++) {
            buffer = buffer.concat("*");
            System.out.println(buffer);
        }
    }
    
    public void printInverted90DegreePyramid(int limit){
        String buffer;
        buffer = "";
        for(int cont = 0; cont < limit; cont++) {
            buffer = buffer.concat("*");
        }
        
        System.out.println(buffer);
        
        for (int cont = limit; cont >= limit; limit--) {
            if(buffer.length() != 0) {
                buffer = buffer.substring(0, buffer.length() - 1);
                System.out.println(buffer);
            }
        }
    }  
}
