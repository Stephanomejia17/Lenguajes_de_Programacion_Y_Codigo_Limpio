/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package udem.edu.co.controller;

import java.util.List;
import udem.edu.co.entities.OrdenCompra;
import udem.edu.co.entities.Producto;

/**
 *
 * @author AxcelSoft
 */
public interface OrdenCompraUseCase {
     public OrdenCompra realizarOrdenCompra(List<Producto> productos, String nombreCliente);
}
