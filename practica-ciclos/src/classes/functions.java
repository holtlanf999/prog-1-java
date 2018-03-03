/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
/**
 *
 * @author Lanford
 */
public class functions {
    
    menu menuList = new menu();
    
    public void printInitial(int limit){
        String buffer;
        buffer = "*";
        System.out.println("Imprimiendo Inicial de " + limit + " líneas\n");
        for(int cont = 1; cont < limit; cont++) {
            System.out.println('*');
            buffer = buffer.concat("*");
        }
        System.out.println(buffer + "\n");
        menuList.mainMenu();
    }
    
    public void printPyramid(int limit){
        StringBuilder buffer;
        buffer = new StringBuilder(""); 
        buffer.setLength(limit);
        int center;
        center = limit/2;
        
        for(int cont = 0; cont < limit; cont++){
            buffer.setCharAt(cont, ' ');
        }
        for(int cont = 0; cont < limit; cont++){
            if(center + cont < limit && center - cont >= 0){
                buffer.setCharAt(center - cont, '*');
                buffer.setCharAt(center + cont, '*');
                center = center--;
                System.out.println(buffer);
            }
        }
        menuList.mainMenu();
    }
    
    public void printInvertedPyramid(int limit){
        StringBuilder buffer = new StringBuilder("");
        for(int cont = 0; cont < limit; cont++){
            buffer.append('*');
        }
        System.out.println(buffer);
        for(int cont = 0; cont < limit; limit--) {
            buffer.setCharAt(cont, ' ');
            buffer.setCharAt(limit - 1, ' ');
            cont++;
            System.out.println(buffer);
        }
        menuList.mainMenu();
    }
    
    public void print90DegreePyramid(int limit){
        String buffer;
        buffer = "";
        for(int cont = 0; cont < limit; cont++) {
            buffer = buffer.concat("*");
            System.out.println(buffer);
        }
        menuList.mainMenu();
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
        menuList.mainMenu();
    }  
}
