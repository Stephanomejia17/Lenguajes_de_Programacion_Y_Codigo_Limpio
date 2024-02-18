/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package udem.edu.co.automoviles;

import udem.edu.co.automoviles.controller.Funciones;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author steph
 */
public class Automoviles {
    public Automoviles(){
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Funciones funcion = new Funciones();
        
        Map<String, String> diccionario_autos = new HashMap<>();
        boolean bool = true;
        
        while(bool){
            funcion.menu();
            System.out.print("Ingresa la opción: ");
            String decision = scanner.nextLine();
            if(decision.equals("a")) {
                System.out.println("Ingrese la marca: ");
                String marca = scanner.nextLine();
                System.out.println("Ingrese el modelo: ");
                String modelo = scanner.nextLine();
                funcion.agregar_elementos(diccionario_autos, modelo, marca);
            }
            if(decision.equals("b")) {
                System.out.println("Ingrese el modelo: ");
                String modelo = scanner.nextLine();
                System.out.println(funcion.consultar_marca_por_modelo(diccionario_autos, modelo));
            }
            
            if(decision.equals("c")){
                bool = false;
            }
            
        }
        
        scanner.close();
        
        
    }
    
}
