/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.entities.impl;

import java.util.List;
import udem.edu.co.entities.OrdenCompra;
import udem.edu.co.entities.Producto;

/**
 *
 * @author AxcelSoft
 */
public class OrdenCompraImpl implements OrdenCompra {
    
    private List<Producto> productos;
    private String nombreComprador;
    
    public OrdenCompraImpl() {
    }

    public OrdenCompraImpl(List<Producto> productos, String nombreComprador) {
        this.productos = productos;
        this.nombreComprador = nombreComprador;
    }    

    @Override
    public String toString() {
        return "OrdenCompraImpl{" + "productos=" + productos + ", nombreComprador=" + nombreComprador + '}';
    }
    
    //getters and setters

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public String getNombreComprador() {
        return nombreComprador;
    }

    public void setNombreComprador(String nombreComprador) {
        this.nombreComprador = nombreComprador;
    }

    public OrdenCompraImpl(List<Producto> productos) {
        this.productos=productos;
    }   
    
}
