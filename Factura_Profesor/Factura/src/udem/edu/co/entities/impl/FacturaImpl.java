/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.entities.impl;

import udem.edu.co.entities.Factura;
import udem.edu.co.entities.OrdenCompra;

/**
 *
 * @author AxcelSoft
 */
public class FacturaImpl  implements Factura{
    private static final String NIT="901467830-1";
    private int iva;
    private OrdenCompra ordenCompra;
    
    public FacturaImpl() {
        iva=19;
    }

    public FacturaImpl(OrdenCompra ordenCompra) {
        this.ordenCompra = ordenCompra;
    }

    @Override
    public String toString() {
        return "FacturaImpl{" + "iva=" + iva + ", ordenCompra=" + ordenCompra + '}';
    }
    
    
    //getters and setters

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public OrdenCompra getOrdenCompra() {
        return ordenCompra;
    }

    public void setOrdenCompra(OrdenCompra ordenCompra) {
        this.ordenCompra = ordenCompra;
    }
    
}

