package udem.edu.co.controller.impl;

public class ConsoleUseCaseImpl implements udem.edu.co.controller.ConsoleUseCase {
    private String resultado;

    public ConsoleUseCaseImpl() {
    }

    public String menuPrincipal(){
        this.resultado = "----BIENVENIDO----\nSeleccione un SuperHeroe:\na. BatMan\nb. IronMan\nc.SuperMan\n" +
                "d. Visualizaar super heroes registrados";
        return resultado;
    }

    public String selectPoder(){
        this.resultado = "Seleccione un super poder:\na. Rayos en los ojos\nb. Fuerza bruta\nc. Invisibilidad";
        return resultado;
    }

}
