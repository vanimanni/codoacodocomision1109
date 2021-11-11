/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mi_aplicacion;

/**
 *
 * @author Iacca
 */
public class Juego {

    public int puntos;
            
    public int vidas;
    /* declaramos las propieddades*/
    public String personaje, enemigo, armas;
    
    Juego(){}

    Juego(int puntos, int vidas, String armas, String personaje, String enemigo) {
        this.puntos = puntos;
        this.vidas = vidas;
        this.armas = armas;
        this.personaje = personaje;
        this.enemigo = enemigo;

    }

    public String mostrar_vidas() {
        return "Soy " + this.personaje + " y tengo " + this.vidas + " Vidas";

    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    public String getEnemigo() {
        return enemigo;
    }

    public void setEnemigo(String enemigo) {
        this.enemigo = enemigo;
    }

    public String getArmas() {
        return armas;
    }

    public void setArmas(String armas) {
        this.armas = armas;
    }

}








