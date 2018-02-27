/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;

//import javax.swing.JOptionPane;

import javax.swing.JOptionPane;


/**
 *
 * @author lanford
 */
public class listNumbers {
    public void listN(int listType, int listOrder, int limit){
        String even;
        even = "";
        String uneven;
        uneven = "";
        
        switch (listOrder){
            case 1:
                JOptionPane.showMessageDialog(null, "De 0 a " + limit);
                for(int cont = 0; cont <= limit; cont++) {
                    if (cont%2 == 0) {
                        even = even + " " + cont + "\n";
                    } else {
                        uneven = uneven + " " + cont + "\n";
                    }
                }
                if(listType == 1){
                    JOptionPane.showMessageDialog(null, "Pares: " + even);
                } else if(listType == 2){
                    JOptionPane.showMessageDialog(null, "Impares: " + uneven);
                }
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "De " + limit + " a 0");
                for(int cont = 0; cont <= limit; limit-- ) {
                    if (limit%2 == 0) {
                        even = even + " " + limit + "\n";
                    } else {
                        uneven = uneven + " " + limit + "\n";
                    }
                }
                if(listType == 1){
                    JOptionPane.showMessageDialog(null, "Pares: " + even);
                } else if(listType == 2){
                    JOptionPane.showMessageDialog(null, "Impares: " + uneven);
                }
                break;
        }   
    }
}
