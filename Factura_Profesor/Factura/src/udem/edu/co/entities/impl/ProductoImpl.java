/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.entities.impl;

import udem.edu.co.entities.Producto;

/**
 *
 * @author AxcelSoft
 */
public class ProductoImpl implements Producto{
    
    private int cantidad;

    private String nombre;

    public ProductoImpl() {
    }
    
    public ProductoImpl(int cantidad, String nombre) {
        this.cantidad = cantidad;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "ProductoImpl{" + "cantidad=" + cantidad + ", nombre=" + nombre + '}';
    }

    //getters and setters
    
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
