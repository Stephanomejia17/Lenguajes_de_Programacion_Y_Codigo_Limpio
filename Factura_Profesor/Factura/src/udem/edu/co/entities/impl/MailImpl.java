/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.entities.impl;

import udem.edu.co.entities.Factura;
import udem.edu.co.entities.Mail;

/**
 *
 * @author AxcelSoft
 */
public class MailImpl implements Mail{
    
    private String Mensaje;
    private String url;
    private Factura adjunto;

    public MailImpl(String Mensaje, String url, Factura adjunto) {
        this.Mensaje = Mensaje;
        this.url = url;
        this.adjunto = adjunto;
    }

    @Override
    public String toString() {
        return "MailImpl{" + "Mensaje=" + Mensaje + ", url=" + url + ", adjunto=" + adjunto + '}';
    }
    
    //GETTERS AND SETTERS

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String Mensaje) {
        this.Mensaje = Mensaje;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Factura getAdjunto() {
        return adjunto;
    }

    public void setAdjunto(Factura adjunto) {
        this.adjunto = adjunto;
    }

    
    
}
