import java.util.Scanner;

public class sistemaBancario {
    public static void main(String[] args) {
        System.out.println("Sistema Bancario");

        var consola = new Scanner(System.in);

        System.out.print("Deseas salir del sistema(true/false)? ");
        var salirSistema = Boolean.parseBoolean(consola.nextLine());

        //Verificamos con una logica inversa

        if (!salirSistema){
            System.out.println("Continuamos dentro del sistema....");
        }
        else{
            System.out.println("Saliendo del sistema...");
        }

        System.out.println("*** Mecatrónica y Fluidos: Controlador de Fulón ***");
        var consola = new Scanner(System.in);

        System.out.print("Ingrese el nivel de agua en el fulón (0 - 100%): ");
        var nivelAgua = Double.parseDouble(consola.nextLine());

        System.out.print("Ingrese la temperatura del baño (°C): ");
        var temperatura = Double.parseDouble(consola.nextLine());

        System.out.print("¿La válvula de drenaje está abierta? (true/false): ");
        var valvulaDrenajeAbierta = Boolean.parseBoolean(consola.nextLine());

        var estadoSistema = "";

        // 0. Validación de rango físico del sensor de nivel
        if (nivelAgua < 0.0 || nivelAgua > 100.0) {
            estadoSistema = "FALLA DE SENSOR: Lectura de nivel fuera de rango (0% - 100%).";
        }
        // 1. Prioridad máxima (Interlock de seguridad): riesgo térmico en seco
        else if (nivelAgua < 15.0 && temperatura > 40.0) {
            estadoSistema = "ALERTA CRÍTICA: Sobrecalentamiento por falta de fluido. Apagando motores.";
        }
        // 2. Segunda prioridad: pérdida de baño durante la operación
        else if (valvulaDrenajeAbierta) {
            estadoSistema = "ERROR: Válvula de drenaje abierta durante el ciclo.";
        }
        // 3. Ventana de operación nominal (setpoint de nivel y temperatura)
        else if ((nivelAgua >= 60.0 && nivelAgua <= 80.0) && (temperatura >= 30.0 && temperatura <= 35.0)) {
            estadoSistema = "Parámetros óptimos. Iniciando rotación del fulón.";
        }
        // 4. Estados transitorios seguros (llenando o calentando)
        else {
            estadoSistema = "Ajustando parámetros...";
        }

        System.out.printf("""
                %n--- Telemetría del Fulón ---
                Nivel de fluido:     %.1f%%
                Temperatura actual:  %.1f °C
                Válvula de drenaje:  %b
                Estado de control:   %s%n
                """, nivelAgua, temperatura, valvulaDrenajeAbierta, estadoSistema);
    }
}
