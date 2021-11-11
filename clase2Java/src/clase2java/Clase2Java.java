/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase2java;

import java.util.Scanner;


public class Clase2Java {

    public static void main(String[] args) {
        Scanner  scanner =  new Scanner(System.in);
        System.out.println("Ingrese Su Nombre de Usuario");  
       String nombre = scanner.nextLine();
       System.out.println("Ingrese la contraseña");  
       String pass = scanner.nextLine();
       Ingreso ing = new Ingreso ();
       ing.setUsuario(nombre);
       ing.setPass(pass);
        System.out.println(ing.Validar() );
        if(!"Luis".equals(nombre)) {
             System.out.println("El usuario esped incorrecto");
        } else {
         System.out.println("Bienbenid@ " + nombre); 
        }
         if(!"Luis".equals(pass)) {
             System.out.println("El usuario esped incorrecto");
        } else {
         System.out.println("Bienbenid@ " + pass); 
        }
         
    }
    
}
