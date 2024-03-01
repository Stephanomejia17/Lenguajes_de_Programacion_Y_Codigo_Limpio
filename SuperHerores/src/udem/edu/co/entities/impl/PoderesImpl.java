/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.entities.impl;

/**
 *
 * @author steph
 */
public class PoderesImpl implements udem.edu.co.entities.Poderes {
    private String tipo;
    private int danho;

    public PoderesImpl(String tipo, int danho) {
        this.tipo = tipo;
        this.danho = danho;
    }

    public PoderesImpl() {
    }

    public String toString(){
        return "Tipo: " + tipo + " y danho " + danho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDanho() {
        return danho;
    }

    public void setDanho(int danho) {
        this.danho = danho;
    }
    
    
}
