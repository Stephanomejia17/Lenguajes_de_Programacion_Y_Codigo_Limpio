/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.automoviles.controller;

import java.util.Map;

/**
 *
 * @author steph
 */
public class Funciones {
    public Funciones(){
        
    }
    public void menu(){
        System.out.println("-----------------\n");
        System.out.println("Seleccione una opción");
        System.out.println("-----------------\n");
        System.out.println("a. Agregar elementos");
        System.out.println("b. Consultar marca por modelo de auto");
        System.out.println("c. Exit");
        
    }
    public Map<String, String> agregar_elementos(Map<String, String> Diccionario,String Modelo, String Marca){
        Diccionario.put(Modelo, Marca);
        
        return Diccionario;
    }
    
    public String consultar_marca_por_modelo(Map<String, String> Diccionario,String Modelo){
        return Diccionario.get(Modelo);
    }
    
}
