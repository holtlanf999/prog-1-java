package classes;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lanford
 */
public class main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        listNumbers listNum = new listNumbers();
        
        int listType; 
        listType = Integer.valueOf(JOptionPane.showInputDialog("Ingrese una opción:\n"
            + "1. Listar Pares.\n"
            + "2. Listar Impares."
        ));
        int listOrder;
        listOrder = Integer.valueOf(JOptionPane.showInputDialog("Ingrese una opción:\n"
            + "1. Ascendente.\n" 
            + "2. Descendente."
        ));        
        int limit;
        limit = Integer.valueOf(JOptionPane.showInputDialog("Digite el número limite para la lista:"));
        
        listNum.listN(listType, listOrder, limit);
    }
    
}
