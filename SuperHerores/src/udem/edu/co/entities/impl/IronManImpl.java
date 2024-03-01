package udem.edu.co.entities.impl;

import udem.edu.co.entities.Poderes;
import udem.edu.co.entities.SinPoderes;
import udem.edu.co.entities.SuperHeroe;

public class IronManImpl extends SinPoderes implements SuperHeroe {

    private int edad;
    private String traje;
    private String nombre;
    private Poderes poder;

    public IronManImpl(int edad, String traje, String nombre, Poderes poder) {
        this.edad = edad;
        this.traje = traje;
        this.nombre = nombre;
        this.poder = poder;
    }

    public IronManImpl() {
    }

    public Poderes getPoder() {
        return poder;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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

    @Override
    public String toString() {
        return "IronMan(" + "traje = " + traje + ", nombre = " + nombre + ", edad = " + edad + ", poder = "+poder+")";
    }

    @Override
    public void setPoder(Poderes poder) {
        this.poder = poder;
    }

}
