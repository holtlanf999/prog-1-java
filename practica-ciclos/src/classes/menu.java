/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
import javax.swing.JOptionPane;

/**
 *
 * @author Lanford
 */
public class menu {
    public void mainMenu(){
        int option;
        option = Integer.valueOf(JOptionPane.showInputDialog(
            "Por favor ingrese una opción: \n"
            + "1. Imprimir Inicial del nombre\n"
            + "2. Imprimir pirámide\n"
            + "3. Imprimir pirámide invertida\n"
            + "4. Imprimir pirámide recta\n"
            + "5. Imprimir pirámide recta invertida\n"
            + "6. Salir"
        ));
        
        int limit;
        
        functions printer = new functions();
        switch (option){
            case 1 :{
                limit = Integer.valueOf(JOptionPane.showInputDialog(
                    "Ingrese el número para la cantidad de lineas (El mínimo es 3):"
                ));
                printer.printInitial(limit);
                break;
            }
            case 2 :{
                limit = Integer.valueOf(JOptionPane.showInputDialog(
                    "Ingrese el número para la cantidad de lineas (El mínimo es 3):"
                ));                
                printer.printPyramid(limit);
                break;
            }
            case 3 :{
                limit = Integer.valueOf(JOptionPane.showInputDialog(
                    "Ingrese el número para la cantidad de lineas (El mínimo es 3):"
                ));                
                printer.printInvertedPyramid(limit);
                break;
            }
            case 4 :{
                limit = Integer.valueOf(JOptionPane.showInputDialog(
                    "Ingrese el número para la cantidad de lineas (El mínimo es 3):"
                ));                
                printer.print90DegreePyramid(limit);
                break;
            }
            case 5 :{
                limit = Integer.valueOf(JOptionPane.showInputDialog(
                    "Ingrese el número para la cantidad de lineas (El mínimo es 3):"
                ));            
                printer.printInverted90DegreePyramid(limit);
                break;
            }
            case 6 :{
                System.exit(0);
            }
            default :{
                JOptionPane.showMessageDialog(null, "Ingrese una opción válida");
                mainMenu();
            }
        }
    }
}
