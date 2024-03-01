/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.model.entities.impl;

import udem.edu.co.model.entities.Factura;
import udem.edu.co.model.entities.Mail;

/**
 *
 * @author steph
 */

public class MailImpl implements Mail{
    private String mensaje;
    private String url;
    private Factura factura;

    public MailImpl(String mensaje, String url, Factura factura) {
        this.mensaje = mensaje;
        this.url = url;
        this.factura = factura;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }
    
    
}
