/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import udem.edu.co.model.entities.AudiA9;
import udem.edu.co.model.entities.Duster;
import udem.edu.co.model.interfaz.Vehiculo;

/**
 *
 * @author steph
 */
public class Vista {
    private List<Vehiculo> cars;
    
    public Vista() {
        cars = new ArrayList();
    }
    
    public void ingresoDatos() {
        Scanner lectura = new Scanner (System.in);
        System.out.println("Selecciona el vehiculo a ingresar 1) Audi A9 2) Duster O 3) Para finalizar: ");
        int car = lectura.nextInt();
        switch (car) {
            case 1:
                ingresarAudi();
                break;
            case 2:
                ingresarDuster();
                break;
            case 3:
                return;
            default:
                System.out.println("opcion invalida selecciona un vehiculo nuevamente ");
                ingresoDatos();
                throw new AssertionError();
                
        }
    }
    
    private void ingresarAudi() {
        Scanner lectura = new Scanner (System.in);
        AudiA9 audi = new AudiA9();
        System.out.println("Ingresa el color del Audi: ");
        audi.setColor(lectura.next());
        System.out.println("Ingresa el cilindraje del Audi: ");
        audi.setCilindraje(lectura.nextInt());
        
        cars.add(audi);
        ingresoDatos();
    }
    
    private void ingresarDuster() {
        Scanner lectura = new Scanner (System.in);
        Duster duster = new Duster();
        System.out.println("Ingresa el color del Duster: ");
        duster.setColor(lectura.next());
        System.out.println("Ingresa el cilindraje del Duster: ");
        duster.setCilindraje(lectura.nextInt());
        
        cars.add(duster);
        ingresoDatos();
    }
    
    public void visualizar() {
        System.out.println("Tus carros son:" + cars);
    }
}
