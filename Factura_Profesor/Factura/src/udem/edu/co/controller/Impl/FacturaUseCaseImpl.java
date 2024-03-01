/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.controller.Impl;

import udem.edu.co.controller.FacturaUseCase;
import udem.edu.co.entities.Factura;
import udem.edu.co.entities.OrdenCompra;
import udem.edu.co.entities.impl.FacturaImpl;

/**
 *
 * @author AxcelSoft
 */
public class FacturaUseCaseImpl  implements FacturaUseCase  {
    
    @Override
    public Factura crearFactura(OrdenCompra ordenCompra) {
        return new FacturaImpl(ordenCompra);
    }
}
