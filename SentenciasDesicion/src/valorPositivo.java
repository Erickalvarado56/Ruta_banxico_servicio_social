import java.util.Scanner;

public class valorPositivo {
    public static void main(String[] args) {
        System.out.println("Vlor positivo");

        var consola = new Scanner(System.in);
        System.out.print("Proporciona un numero: ");
        var numero = Integer.parseInt(consola.nextLine());

        if (numero > 0 ){
            System.out.println("Tu numero es positivo: " + numero);
        }
        else if (numero < 0){
            System.out.println("Tu numero es negativo:  " + numero);
        }
        else {
            System.out.println("Tu numero es cero: " + numero);
        }
    }
}
