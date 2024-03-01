package udem.edu.co.view;

import udem.edu.co.controller.impl.ConsoleUseCaseImpl;
import udem.edu.co.entities.SuperHeroe;
import udem.edu.co.entities.impl.BatmanImpl;
import udem.edu.co.entities.impl.IronManImpl;
import udem.edu.co.entities.impl.PoderesImpl;
import udem.edu.co.entities.impl.SuperManImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class View {
    List<SuperHeroe> superHeroes = new ArrayList<>();
    ConsoleUseCaseImpl consoleUseCase = new ConsoleUseCaseImpl();

    public void menu(){
        Scanner lectura = new Scanner(System.in);
        System.out.println(this.consoleUseCase.menuPrincipal());
        switch (lectura.next()){
            case "a":
                ingresarBatman();
                break;
            case "b":
                ingresarIronMan();
                break;
            case "c":
                ingresarSuperMan();
                break;
            case "d":
                getSuperHeroes();
                break;
        }
    }

    public void getSuperHeroes() {
        System.out.println(this.superHeroes);
    }

    public void setSuperHeroes(List<SuperHeroe> superHeroes) {
        this.superHeroes = superHeroes;
    }

    private void ingresarBatman(){
        BatmanImpl batman = new BatmanImpl();
        this.superHeroes.add(batman);
        ingresarData(batman);
    }
    private void ingresarIronMan(){
        IronManImpl ironMan = new IronManImpl();
        this.superHeroes.add(ironMan);
        ingresarData(ironMan);
    }

    private void ingresarSuperMan(){
        SuperManImpl superMan = new SuperManImpl();
        this.superHeroes.add(superMan);
        ingresarData(superMan);
    }

    private void ingresarData(SuperHeroe superHeroe){
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        superHeroe.setNombre(lectura.next());
        System.out.println("Ingrese la edad: ");
        superHeroe.setEdad(lectura.nextInt());
        System.out.println("Ingrese el traje: ");
        superHeroe.setTraje(lectura.next());
        ingresarPoder(superHeroe);
    }

    private void ingresarPoder(SuperHeroe superHeroe){
        System.out.println(consoleUseCase.selectPoder());
        Scanner lectura = new Scanner(System.in);
        PoderesImpl poder = new PoderesImpl();
        switch (lectura.next()){
            case "a":
                poder.setTipo("Fuego");
                poder.setDanho(70);
                superHeroe.setPoder(poder);
                menu();
                break;
            case "b":
                poder.setTipo("Fuerza");
                poder.setDanho(50);
                superHeroe.setPoder(poder);
                menu();
                break;
            case "c":
                poder.setTipo("Desconocido");
                poder.setDanho(999);
                superHeroe.setPoder(poder);
                menu();
                break;
        }
    }
}
