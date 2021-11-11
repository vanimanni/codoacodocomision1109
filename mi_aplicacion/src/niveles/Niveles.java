/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package niveles;

/**
 *
 * @author Iacca
 */
public class Niveles {
    private String dificultad;

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }
    public String experiencia;
    public String checkPoint;
    public Niveles(String dificultad,String experiencia,String checkPoint){
        this.dificultad=dificultad; 
        this.experiencia=experiencia;
        this.checkPoint=checkPoint;
    }
    public String reiniciar(){
            return this.checkPoint;
        }
    
}
