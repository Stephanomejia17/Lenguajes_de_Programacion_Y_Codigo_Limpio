package udem.edu.co.entities.impl;

import udem.edu.co.entities.Poderes;
import udem.edu.co.entities.SuperHeroe;
import udem.edu.co.entities.Volador;

public class SuperManImpl extends Volador implements SuperHeroe {
    private String traje;
    private String nombre;
    private int edad;
    private Poderes poder;

    public SuperManImpl(String traje, String nombre, int edad, Poderes poder) {
        this.traje = traje;
        this.nombre = nombre;
        this.edad = edad;
        this.poder = poder;
    }

    public SuperManImpl() {
    }

    public Poderes getPoder() {
        return poder;
    }
    public String getTraje() {
        return traje;
    }

    public void setTraje(String traje) {
        this.traje = traje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "SuperMan(" + "traje = " + traje + ", nombre = " + nombre + ", edad = " + edad + ", poder = "+poder+")";
    }

    @Override
    public void setPoder(Poderes poder) {
        this.poder = poder;
    }
}
