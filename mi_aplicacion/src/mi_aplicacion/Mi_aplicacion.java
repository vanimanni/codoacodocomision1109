/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mi_aplicacion;

import niveles.*;

/**
 *
 * @author Iacca
 */
public class Mi_aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Juego jugador = new Juego(99, 3, "ak45", "juan", "nerbeans");
        Juego jugador1 = new Juego(0, 3, "ak45", "Pedro", "nerbeans");
        System.out.println(jugador.personaje);
        System.out.println(jugador1.personaje); 
        System.out.println(jugador1.mostrar_vidas());
        System.out.println(jugador.getPuntos());
        jugador.setPuntos(jugador.getPuntos() + 30);
        System.out.println(jugador.getPuntos());
        Juego juegador2 = new Juego();
        Niveles niveles = new Niveles("media","dos");
        System.out.println(niveles.getDificultad());
        jugador.vidas=0;
        System.out.println(jugador.vidas);
        if (jugador.vidas == 0 ){
            niveles.reiniciar();
        }
    }
    
}
