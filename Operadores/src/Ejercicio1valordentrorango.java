import java.util.Scanner;

public class Ejercicio1valordentrorango {
    public static void main(String[] args) {
        //Ejercicio 1: Pedirle al usuario ingresar un numero
        //y ver si se encuentra dentro del rango requerido
        System.out.println("Valor dentro de rango");
        //Definimos los limites2
        final var MINIMO = 0;
        final var MAXIMO = 5;
        //Solicitar un valor entre 0 y 5
        System.out.print("Proporciona un dato entre 0 y 5: ");
        var dato = Integer.parseInt(new Scanner(System.in).nextLine());
        // Verificar si el dato esta dentro del rango
        var estaDentroRango = dato >= MINIMO && dato <= MAXIMO;
        System.out.println("estaDentro de Rango? = "+estaDentroRango);
    }
}
