/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.model.entities;

import udem.edu.co.model.abstracta.Audi;

import udem.edu.co.model.interfaz.Vehiculo;

/**
 *
 * @author steph
 */
public class AudiA9 extends Audi implements Vehiculo {
    private String color;
    private int cilindraje;

    public AudiA9() {
    }

    
    public AudiA9(String color, int cilindraje) {
        this.color = color;
        this.cilindraje = cilindraje;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }
    
    
}
