/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.calculadora.controller;

/**
 *
 * @author steph
 */
public class Operaciones {
    int res;

    public Operaciones() {
        this.res = 1;
        
    }
    public int suma(int numeroUno, int numeroDos) {
        return numeroUno + numeroDos;
    }

    public int resta(int numeroUno, int numeroDos) {
        return numeroUno - numeroDos;
    }
    public int factorial(int numero) {
        if(numero == 1){
            return 1;
        }
        return numero * factorial(numero-1);
    }
}
