/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.controller.Impl;

import java.util.List;
import udem.edu.co.controller.OrdenCompraUseCase;
import udem.edu.co.entities.OrdenCompra;
import udem.edu.co.entities.Producto;
import udem.edu.co.entities.impl.OrdenCompraImpl;

/**
 *
 * @author AxcelSoft
 */
public class OrdenCompraUseCaseImpl implements OrdenCompraUseCase {
    
    @Override
    public OrdenCompra realizarOrdenCompra(List<Producto> productos, String nombreCliente) {
        return new OrdenCompraImpl(productos,nombreCliente);
    }
}
