import java.util.Scanner;

public class Ejercicio4fueraDeRango {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.print("Proporciona un dato entero: ");
        var dato = Integer.parseInt(consola.nextLine());

        //Revisamos si esta dentro del rango (entre 1 y 10)
        var estaDentroRango = dato >= 1 && dato <= 10;
        System.out.print("Variable dentro de rango entre 1 y 10?" + estaDentroRango);
        //Revisar la logica inversa, si esta fuera de rango
        var estaFueraRango = !(dato >= 1 && dato <= 10);
        System.out.println("Variable fuera de rango entre 1 y 10? " + estaFueraRango);

    }
}
