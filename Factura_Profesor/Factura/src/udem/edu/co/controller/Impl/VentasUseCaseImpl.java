/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.controller.Impl;

import udem.edu.co.controller.Impl.OrdenCompraUseCaseImpl;
import udem.edu.co.controller.Impl.MailUseCaseImpl;
import udem.edu.co.controller.Impl.FacturaUseCaseImpl;
import java.util.List;
import udem.edu.co.controller.VentasUseCase;
import udem.edu.co.entities.Factura;
import udem.edu.co.entities.Mail;
import udem.edu.co.entities.OrdenCompra;
import udem.edu.co.entities.Producto;
import udem.edu.co.entities.impl.OrdenCompraImpl;

/**
 *
 * @author AxcelSoft
 */
public class VentasUseCaseImpl implements VentasUseCase {
    
    private OrdenCompraUseCaseImpl ordenCompraUC;
    private FacturaUseCaseImpl facturaUseCase;
    private MailUseCaseImpl mailUseCase;
    
    
    public VentasUseCaseImpl(OrdenCompraUseCaseImpl ordenCompraUC, FacturaUseCaseImpl facturaUseCase, MailUseCaseImpl mailUseCase) {
        this.ordenCompraUC=ordenCompraUC;
        this.facturaUseCase=facturaUseCase;
        this.mailUseCase = mailUseCase; 
                
    }
    
    @Override
    public void realizarVenta(List<Producto> productos, String nombreCliente) {
        OrdenCompra ordenCompra = this.ordenCompraUC.realizarOrdenCompra(productos, nombreCliente);
        Factura factura = this.facturaUseCase.crearFactura(ordenCompra);
        Mail mail = this.mailUseCase.enviarMail(factura); 
    }

    
}
