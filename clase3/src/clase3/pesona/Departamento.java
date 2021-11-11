/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase3.pesona;

/**
 *
 * @author Iacca
 */
public class Departamento extends Personal {

    private String depto;

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public Departamento(String nombre, String apellido, int edad, String depto) {
        super(nombre, apellido, edad);
        this.depto = depto;
    }
    public String MostrarDatos(){
    return  "Nombre: "+ nombre  +  "Apellido: "+ apellido + 
            "Edad: " + edad + "Sueldo: " + this.getSueldo() + " Pertenece al depto: "+ depto;
    }
}
