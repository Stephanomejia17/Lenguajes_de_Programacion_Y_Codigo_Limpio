/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package udem.edu.co.vista;

import java.util.ArrayList;
import java.util.List;
import udem.edu.co.controller.Impl.FacturaUseCaseImpl;
import udem.edu.co.controller.Impl.MailUseCaseImpl;
import udem.edu.co.controller.Impl.OrdenCompraUseCaseImpl;
import udem.edu.co.controller.Impl.VentasUseCaseImpl;
import udem.edu.co.entities.Producto;
import udem.edu.co.entities.impl.ProductoImpl;

/**
 *
 * @author AxcelSoft
 */
public class FacturaPpal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VentasUseCaseImpl vendedor=new VentasUseCaseImpl(new OrdenCompraUseCaseImpl(), new FacturaUseCaseImpl(), new MailUseCaseImpl());
        
        String nombreCliente= "Alexander";
        List<Producto> productos = new ArrayList<>();
        productos.add(new ProductoImpl(4,"Portatil"));
        productos.add(new ProductoImpl(4,"Mouse"));
        productos.add(new ProductoImpl(4,"teclado"));
        
        vendedor.realizarVenta(productos,nombreCliente);
    }
    
}
