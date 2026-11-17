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

        //System.out.println("EJERICIO 2: Pieles Curtidos Rodríguez: Control de Calidad");

        //System.out.println("Ejercicio Curtidor de cuero");

        //var consola = new Scanner(System.in);

        //System.out.println("Ingrese el grosor de la piel (mm): ");
        //var grosorPiel = Double.parseDouble(consola.nextLine());

        //System.out.println("Presenta rayones o imperfecciones en la flor? (true/false): ");
        //var tieneDefectos = Boolean.parseBoolean(consola.nextLine());


        //var categoria ="";
        //var precioPiel = 0.0;

        //if (tieneDefectos){
            //categoria = "Clasificacion de Segunda";
            //precioPiel = 90.00;
        //}
        //else if (grosorPiel >= 1.2) {
            //categoria = "Calidad premium";
            //precioPiel = 250.00;
        //}
        //else {
            //categoria = "Calidad Estándar";
            //precioPiel = 180.0;
            //}

        //System.out.printf("""
                //%n--- Ticket de Clasificación ---
                //Grosor medido: %.2f mm
                //Presenta defectos: %b
                //Categoría asignada: %s
                //Precio por pie: $%.2f%n
                //""", grosorPiel, tieneDefectos, categoria, precioPiel);
        System.out.println("*** Negocios y Economía: Análisis de Rentabilidad ***");
        var consola = new Scanner(System.in);

        System.out.print("Ingrese los ingresos proyectados ($): ");
        var ingresos = Double.parseDouble(consola.nextLine());

        System.out.print("Ingrese los costos operativos ($): ");
        var costos = Double.parseDouble(consola.nextLine());

        if (ingresos <= 0) {
            System.out.println("\nError: Los ingresos proyectados deben ser mayores a $0.00 para calcular un margen válido.");
        } else {
            var utilidadNeta = ingresos - costos;
            var margenPorcentual = (utilidadNeta / ingresos) * 100;
            var diagnostico = "";

            if (margenPorcentual >= 30.0) {
                diagnostico = "Proyecto Altamente Rentable";
            } else if (margenPorcentual >= 15.0) {
                diagnostico = "Rentabilidad Aceptable";
            } else if (margenPorcentual > 0.0) {
                diagnostico = "Riesgo financiero: Margen demasiado bajo";
            } else {
                diagnostico = "Proyecto en Pérdidas o sin margen (<= 0%). Rechazar.";
            }

            System.out.printf("""
                    %n--- Reporte Financiero del Proyecto ---
                    Ingresos Proyectados: $%.2f
                    Costos Operativos:    $%.2f
                    Utilidad Neta:        $%.2f
                    Margen de Ganancia:   %.2f%%
                    Dictamen:             %s%n
                    """, ingresos, costos, utilidadNeta, margenPorcentual, diagnostico);
        }
    }
}
