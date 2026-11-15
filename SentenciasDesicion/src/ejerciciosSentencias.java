import java.util.Scanner;

public class ejerciciosSentencias {
    public static void main(String[] args) {
        //System.out.println("EJERICIO: Validador de Voltaje para ESP32");

        //var consola = new Scanner(System.in);

        //System.out.print("Ingresa el voltaje medido en la fuente: ");
        //var voltajeMedido = Double.parseDouble(consola.nextLine());

        //if (voltajeMedido < 3){
            //System.out.print("Subvoltaje: El microcontrolador no encenderá");
        //}
        //else if (voltajeMedido >= 3 && voltajeMedido <= 3.6){
            //System.out.print("Voltaje óptimo. Iniciando sistema..");
        //}
        //else {
            //System.out.print("Sobrevvoltaje: Riesgo de quemar la placa");
        //}

        System.out.println("EJERICIO 2: Pieles Curtidos Rodríguez: Control de Calidad");

        System.out.println("Ejercicio Curtidor de cuero");

        var consola = new Scanner(System.in);

        System.out.println("Ingrese el grosor de la piel (mm): ");
        var grosorPiel = Double.parseDouble(consola.nextLine());

        System.out.println("Presenta rayones o imperfecciones en la flor? (true/false): ");
        var tieneDefectos = Boolean.parseBoolean(consola.nextLine());


        var categoria ="";
        var precioPiel = 0.0;

        if (tieneDefectos){
            categoria = "Clasificacion de Segunda";
            precioPiel = 90.00;
        }
        else if (grosorPiel >= 1.2) {
            categoria = "Calidad premium";
            precioPiel = 250.00;
        }
        else {
            categoria = "Calidad Estándar";
            precioPiel = 180.0;
            }

        System.out.printf("""
                %n--- Ticket de Clasificación ---
                Grosor medido: %.2f mm
                Presenta defectos: %b
                Categoría asignada: %s
                Precio por pie: $%.2f%n
                """, grosorPiel, tieneDefectos, categoria, precioPiel);
    }
}
