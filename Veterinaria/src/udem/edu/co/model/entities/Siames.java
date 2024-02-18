/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.model.entities;

import udem.edu.co.model.abstracta.Gato;

import udem.edu.co.model.interfaz.Animal;

/**
 *
 * @author steph
 */
public class Siames extends Gato implements Animal {
    
    private String Nombre;
    private String color;
    private int edad;
    
    public Siames() {
    }

    public Siames(String Nombre, String color, int edad) {
        this.Nombre = Nombre;
        this.color = color;
        this.edad = edad;
    }

    @Override
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String getRaza() {
        return "Siames";
    }
    
}
