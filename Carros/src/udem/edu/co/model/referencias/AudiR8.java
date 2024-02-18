/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.model.referencias;

import udem.edu.co.model.referencias.abstractos.Audi;

/**
 *
 * @author steph
 */
public class AudiR8 extends Audi{
    private int llantas;

    private String color;

    public AudiR8(int llantas, String color) {
        this.llantas = llantas;
        this.color = color;
    }

    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
    
}
