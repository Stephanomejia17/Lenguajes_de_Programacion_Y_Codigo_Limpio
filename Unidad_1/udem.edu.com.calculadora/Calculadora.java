public class Calculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int suma = calculadora.suma(56, 58);
        System.out.println("la suma es: " + suma);
    }
    
    public int suma(int numeroUno, int numeroDos) {
        return numeroUno + numeroDos;
    }

    public int resta(int numeroUno, int numeroDos) {
        return numeroUno - numeroDos;
    }

    public int multiplicacion(int numeroUno, int numeroDos) {
        return numeroUno * numeroDos;
    }

    public float division(int numeroUno, int numeroDos) {
        if (numeroDos != 0){
            return numeroUno / numeroDos;
        }
        else{
            if (numeroUno != 0) {
                return numeroDos / numeroUno;
            }
        }
        return 0; 
    }
}
