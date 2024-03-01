/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.controller.Impl;

import udem.edu.co.controller.MailUseCase;
import udem.edu.co.entities.Factura;
import udem.edu.co.entities.Mail;
import udem.edu.co.entities.impl.MailImpl;

/**
 *
 * @author AxcelSoft
 */
public class MailUseCaseImpl implements MailUseCase{

    
    
    @Override
    public Mail enviarMail(Factura factura){
        return new MailImpl("mail enviado", "pepito@gmail.com", factura); 
    }


    
}

