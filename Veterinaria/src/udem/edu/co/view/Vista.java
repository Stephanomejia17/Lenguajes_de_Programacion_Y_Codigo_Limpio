/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import udem.edu.co.model.entities.Persa;
import udem.edu.co.model.entities.Pomeranian;
import udem.edu.co.model.entities.Siames;
import udem.edu.co.model.entities.YorkShire_Terrier;
import udem.edu.co.model.interfaz.Animal;

/**
 *
 * @author steph
 */
public class Vista {
    private List<Animal> animales;
    
    public Vista() {
        animales = new ArrayList();
    }
    
    public void ingreso_de_Datos() {
        Scanner lectura = new Scanner (System.in);
        System.out.println("Selecciona una opción: \n1) Persa\n2)Siames \n3)YorkShire Terrier\n4)Pomeranian\n5)Visualizar Animales Registrados\n6)Salir");
        int opcion = lectura.nextInt();
        switch (opcion) {
            case 1:
                ingresarPersa();
                break;
            case 2:
                ingresarSiames();
                break;
            case 3:
                ingresarYorkShireTerrier();
                break;
            case 4:
                ingresarPomeranian();
                break;
            case 5:
                visualizar();
                break;
            case 6:
                return;
            default:
                System.out.println("Ingresó una opción inválida, vuelva a intentarlo...");
                ingreso_de_Datos();
                throw new AssertionError();
        }
        
    }
    
    private void ingresarPersa() {
        Scanner lectura = new Scanner (System.in);
        Persa persa = new Persa();
        System.out.println("Ingrese el nombre: ");
        persa.setNombre(lectura.next());
        System.out.println("Ingrese el color: ");
        persa.setColor(lectura.next());
        System.out.println("Ingrese la edad: ");
        persa.setEdad(lectura.nextInt());
        
        animales.add(persa);
        ingreso_de_Datos();
    }
    
    private void ingresarSiames() {
        Scanner lectura = new Scanner (System.in);
        Siames siames = new Siames();
        System.out.println("Ingrese el nombre: ");
        siames.setNombre(lectura.next());
        System.out.println("Ingrese el color: ");
        siames.setColor(lectura.next());
        System.out.println("Ingrese la edad: ");
        siames.setEdad(lectura.nextInt());
        
        animales.add(siames);
        ingreso_de_Datos();
    }
    
    private void ingresarYorkShireTerrier() {
        Scanner lectura = new Scanner (System.in);
        YorkShire_Terrier yorkshireterrier = new YorkShire_Terrier();
        System.out.println("Ingrese el nombre: ");
        yorkshireterrier.setNombre(lectura.next());
        System.out.println("Ingrese el color: ");
        yorkshireterrier.setColor(lectura.next());
        System.out.println("Ingrese la edad: ");
        yorkshireterrier.setEdad(lectura.nextInt());
        
        animales.add(yorkshireterrier);
        ingreso_de_Datos();
    }
    
    private void ingresarPomeranian() {
        Scanner lectura = new Scanner (System.in);
        Pomeranian pomeranian = new Pomeranian();
        System.out.println("Ingrese el nombre: ");
        pomeranian.setNombre(lectura.next());
        System.out.println("Ingrese el color: ");
        pomeranian.setColor(lectura.next());
        System.out.println("Ingrese la edad: ");
        pomeranian.setEdad(lectura.nextInt());
        
        animales.add(pomeranian);
        ingreso_de_Datos();
    }
    
    public void visualizar() {
        
        for (int i = 0; i<animales.size(); i++){
            Animal animal = animales.get(i);
            String nombre_animal = animal.getNombre();
            String raza = animal.getRaza();
            String color = animal.getColor();
            int edad = animal.getEdad();
            System.out.println("Raza: " + raza + " Nombre: " + nombre_animal + " Color: " + color + " Edad: " + edad);
        }
    }
}
