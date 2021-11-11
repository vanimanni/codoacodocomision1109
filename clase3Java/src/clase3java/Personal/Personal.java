/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase3java.personal;

/**
 *
 * @author Iacca
 */
public class Personal {

    public String nombre, apellido, email;
    public int edad;
    private double sueldo; // similar al float, a todos lso datos podemos ver la cantidad de bit q tiene cada uno. y doble tiene un poco mas que float

    public Personal(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = 33;

    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo() {
        double nuevoSueldo = 0;
        this.sueldo = nuevoSueldo;
    }

    void setSueldo(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
