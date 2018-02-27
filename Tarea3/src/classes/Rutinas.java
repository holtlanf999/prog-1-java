/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author lanford
 */
public class Rutinas {
    
    public void tipoHora(int time){
        if(time % 100 < 60){
            if(time >= 1 && time <= 559) {
                System.out.println("Madrugada");
            } else if(time >= 600 && time <= 1559) {
                System.out.println("Mañana");
            } else if(time == 1200) {
                System.out.println("Medio Día");
            } else if(time > 1200 && time <= 1759) {
                System.out.println("Tarde");
            } else if (time >= 1800 && time <= 2359) {
                System.out.println("Noche");
            } else if (time == 2400) {
                System.out.println("Media Noche");
            }
        } else {
            System.out.println("Formato inválido");
        }
    }
}
