/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.model.entities.impl;

import udem.edu.co.model.entities.Factura;
import udem.edu.co.model.entities.OrdenDeCompra;

/**
 *
 * @author steph
 */
public class FacturaImpl implements Factura{
    private String cliente;
    private OrdenDeCompra ordenCompra;

    public FacturaImpl() {
    }
    
    public Factura crearFactura(OrdenDeCompra ordenDeCompra) {
        return new FacturaImpl();
    }

    public FacturaImpl(OrdenDeCompra ordenCompra) {
        this.ordenCompra = ordenCompra;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public OrdenDeCompra getOrdenCompra() {
        return ordenCompra;
    }

    public void setOrdenCompra(OrdenDeCompra ordenCompra) {
        this.ordenCompra = ordenCompra;
    }

    @Override
    public void crearFactura(OrdenDeCompraImpl ordenDeCompraImpl) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
