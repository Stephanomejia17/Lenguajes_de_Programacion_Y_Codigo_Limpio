/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.model.controller;

import udem.edu.co.model.entities.Factura;
import udem.edu.co.model.entities.OrdenDeCompra;
import udem.edu.co.model.entities.Producto;
import udem.edu.co.model.entities.impl.FacturaImpl;
import udem.edu.co.model.entities.impl.OrdenDeCompraImpl;

/**
 *
 * @author steph
 */
public class Ventas {

    public static void realizarVenta(Factura factura) {
        factura.crearFactura(new OrdenDeCompraImpl());

    }
    
}
