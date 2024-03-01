/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.model.entities.impl;

import udem.edu.co.model.entities.OrdenDeCompra;
import udem.edu.co.model.entities.Producto;

/**
 *
 * @author steph
 */
public class OrdenDeCompraImpl implements OrdenDeCompra{
    private Producto producto;

    public OrdenDeCompraImpl(Producto producto) {
        this.producto = producto;
    }

    public OrdenDeCompraImpl() {
    }
    

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    public OrdenDeCompraImpl CrearOrdenCompra(Producto producto) {
        return new OrdenDeCompraImpl(producto);
    }
}
