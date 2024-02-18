/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package udem.edu.co.calculadora;

import udem.edu.co.calculadora.controller.Operaciones;

/**
 *
 * @author steph
 */
public class Calculadora {

    public Calculadora() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operaciones operacion = new Operaciones();
        int suma = operacion.suma(54, 245);
        int factorial = operacion.factorial(5);
        int[] lista = {1,2,3,4,5};
        int i = 0;
        while(i<lista.length){
            
            i++;
        }
        for(int a=0; a<lista.length; a++){
            
        }

        System.out.println("el factorial es: " + factorial);
 

        
    }
    
}
