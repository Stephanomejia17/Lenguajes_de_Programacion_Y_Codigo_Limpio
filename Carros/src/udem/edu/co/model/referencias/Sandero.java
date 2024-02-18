/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.model.referencias;

import udem.edu.co.model.referencias.abstractos.Renault;
import udem.edu.co.model.referencias.abstractos.interfaces.Vehiculos;

/**
 *
 * @author steph
 */

/**extends sirve para heredar**/

public class Sandero extends Renault implements Vehiculos{
    private int llantas;

    private String color;

    public Sandero(int llantas, String color) {
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

    @Override
    public void desplazar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
    
}
