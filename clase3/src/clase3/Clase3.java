/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase3;

import clase3.pesona.Departamento;
import clase3.pesona.Personal;

/**
 *
 * @author Iacca
 */
public class Clase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Personal persona = new Personal("Vanina", "Gutierrez", 32);
       persona.setSueldo(600000);
        Personal administrativo = new Personal("Juan","Perez",38);
        administrativo.setSueldo(80000);
        Personal mantenimiento = new Personal("Roberto","Gomez",36);
        mantenimiento.setSueldo(60000);
        System.out.println("El sueldo para el personal administativo es: " 
                + administrativo.getSueldo());
        System.out.println("El sueldo para el personal de mantenimiento es: " 
                + mantenimiento.getSueldo());
        Departamento it = new Departamento("Veronica","Furlan",
                32,"Desarrollo");
        it.setSueldo(500000);
        System.out.println(it.nombre +" esta ganando "+it.getSueldo());
        it.setDepto("Gerencia General");
        System.out.println(it.MostrarDatos()); 
    }
}
