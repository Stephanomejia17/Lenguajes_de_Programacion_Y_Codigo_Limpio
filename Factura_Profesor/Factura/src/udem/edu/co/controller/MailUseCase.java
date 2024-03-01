/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package udem.edu.co.controller;

import udem.edu.co.entities.Factura;
import udem.edu.co.entities.Mail;

/**
 *
 * @author AxcelSoft
 */
public interface MailUseCase {
    
    public Mail enviarMail(Factura factura); 
}
