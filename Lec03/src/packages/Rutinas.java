/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packages;

/**
 *
 * @author lanford
 */
public class Rutinas {
    public void ejemplo5(int d){
        if (d == 1) {
            System.out.println("Domingo");
        } else if (d == 2) {
            System.out.println("Lunes");
        } else if (d == 3) {
            System.out.println("Martes");
        } else if (d == 4) {
            System.out.println("Miércoles");
        } else if (d == 5) {
            System.out.println("Jueves");
        } else if (d == 6) {
            System.out.println("Viernes");
        } else if (d == 7) {
            System.out.println("Sábado");
        } else {
            System.out.println("Día Inválido");
        }
    }

    public void ejemplo6(int a, int b, int c){
        if (a > b && a > c) {
            System.out.println("A es el mayor y vale " + a);
        } else if (b > a && b > c) {
            System.out.println("B es el mayor y vale " + b);
        } else if (c > a && c > b) {
            System.out.println("C es el mayor y vale " + c);
        }
    }
}
