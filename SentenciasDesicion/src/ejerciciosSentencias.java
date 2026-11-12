import java.util.Scanner;

public class ejerciciosSentencias {
    public static void main(String[] args) {
        System.out.println("EJERICIO: Validador de Voltaje para ESP32");

        var consola = new Scanner(System.in);

        System.out.print("Ingresa el voltaje medido en la fuente: ");
        var voltajeMedido = Double.parseDouble(consola.nextLine());

        if (voltajeMedido < 3){
            System.out.print("Subvoltaje: El microcontrolador no encenderá");
        }
        else if (voltajeMedido >= 3 && voltajeMedido <= 3.6){
            System.out.print("Voltaje óptimo. Iniciando sistema..");
        }
        else {
            System.out.print("Sobrevvoltaje: Riesgo de quemar la placa");
        }
    }
}
