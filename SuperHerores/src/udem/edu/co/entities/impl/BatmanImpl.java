package udem.edu.co.entities.impl;

import udem.edu.co.entities.Poderes;
import udem.edu.co.entities.SinPoderes;
import udem.edu.co.entities.SuperHeroe;

public class BatmanImpl extends SinPoderes implements SuperHeroe {
    private  String nombre;
    private  String traje;
    private int edad;
    private Poderes poder;
    private final static String DESCRIPCION = "Soy Batman, un super heroe sin poderes, mis habilidades excentrico, " +
            "millonario, playboy";

    public BatmanImpl(String nombre, String traje, int edad, Poderes poder) {
        this.nombre = nombre;
        this.traje = traje;
        this.edad = edad;
        this.poder = poder;
    }
    public BatmanImpl() {
    }

    @Override
    public String toString(){
        return "Batman(" + "traje = " + traje + ", nombre = " + nombre + ", edad = " + edad + ", poder = "+poder+")";
    }

    @Override
    public void setPoder(Poderes poder) {
        this.poder = poder;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTraje() {
        return traje;
    }

    public void setTraje(String traje) {
        this.traje = traje;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Poderes getPoder() {
        return poder;
    }
}
