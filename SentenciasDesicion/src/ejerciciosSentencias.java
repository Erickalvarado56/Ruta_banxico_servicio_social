//import java.util.Scanner;

//public class ejerciciosSentencias {
   // public static void main(String[] args) {
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
        //System.out.println("*** Negocios y Economía: Análisis de Rentabilidad ***");
        //var consola = new Scanner(System.in);

        //System.out.print("Ingrese los ingresos proyectados ($): ");
        //var ingresos = Double.parseDouble(consola.nextLine());

        //System.out.print("Ingrese los costos operativos ($): ");
        //var costos = Double.parseDouble(consola.nextLine());

        //if (ingresos <= 0) {
            //System.out.println("\nError: Los ingresos proyectados deben ser mayores a $0.00 para calcular un margen válido.");
        //} else {
            //var utilidadNeta = ingresos - costos;
            //var margenPorcentual = (utilidadNeta / ingresos) * 100;
            //var diagnostico = "";

            //if (margenPorcentual >= 30.0) {
                //diagnostico = "Proyecto Altamente Rentable";
            //} else if (margenPorcentual >= 15.0) {
                //diagnostico = "Rentabilidad Aceptable";
            //} else if (margenPorcentual > 0.0) {
                //diagnostico = "Riesgo financiero: Margen demasiado bajo";
            //} else {
                //diagnostico = "Proyecto en Pérdidas o sin margen (<= 0%). Rechazar.";
            //}

            //System.out.printf("""
                 //   %n--- Reporte Financiero del Proyecto ---
                 //   Ingresos Proyectados: $%.2f
                 //   Costos Operativos:    $%.2f
                 //   Utilidad Neta:        $%.2f
                 //   Margen de Ganancia:   %.2f%%
                 //   Dictamen:             %s%n
                 //   """, ingresos, costos, utilidadNeta, margenPorcentual, diagnostico);
            //}

            //System.out.println("*** Sistemas Banxico: Filtro de Seguridad SPEI ***");
            //final var LIMITE_NOCTURNO = 500_000.0;
           // var consola = new Scanner(System.in);

            //System.out.print("Ingrese el saldo disponible en la cuenta ($ MXN): ");
            //var saldoCuenta = Double.parseDouble(consola.nextLine());


            //System.out.print("Ingrese el monto a transferir ($ MXN): ");
            //var montoTransferencia = Double.parseDouble(consola.nextLine());

            //System.out.print("¿La operación se realiza en horario hábil? (true/false): ");
            //var esHorarioHabil = Boolean.parseBoolean(consola.nextLine());

            // Validación defensiva de montos físicos/financieros
            //if (saldoCuenta < 0 || montoTransferencia <= 0) {
                //System.out.println("\nOperación inválida: El saldo no puede ser negativo y el monto debe ser mayor a $0.00.");
            //}
            // Regla 1: Verificación de liquidez inmediata
            //else if (montoTransferencia > saldoCuenta) {
                //System.out.printf("""
                    //    %n--- Operación Declinada ---
                    //    Motivo: Fondos insuficientes.
                    //    Saldo disponible: $%.2f MXN
                    //    Monto solicitado: $%.2f MXN%n
                    //    """, saldoCuenta, montoTransferencia);
            //}
            // Regla 2: Filtro de prevención de fraude fuera de horario
            //else if (montoTransferencia > LIMITE_NOCTURNO && !esHorarioHabil) {
               // System.out.println("""
                  //      %n--- Alerta de Seguridad SPEI ---
                  //      Operación retenida: Transferencias mayores a $500,000.00 MXN solo se procesan en horario hábil.""");
            //}
            // Regla 3: Transacción aprobada
            //else {
              //  var saldoRestante = saldoCuenta - montoTransferencia;
              //  var folioAprobacion = "SPEI-" + (int) (Math.random() * 900_000 + 100_000);

                //System.out.printf("""
                   //     %n--- Comprobante de Transferencia SPEI ---
                   //     Estado:              APROBADA
                   //     Folio de Aprobación: %s
                   //     Monto Transferido:   $%.2f MXN
                   //     Saldo Anterior:      $%.2f MXN
                   //     Saldo Restante:      $%.2f MXN%n
                   //     """, folioAprobacion, montoTransferencia, saldoCuenta, saldoRestante);

            //}
            //System.out.println("*** Mecatrónica y Fluidos: Controlador de Fulón ***");
            //var consola = new Scanner(System.in);

            //System.out.print("Ingrese el nivel de agua en el fulón (0 - 100%): ");
            //var nivelAgua = Double.parseDouble(consola.nextLine());

            //System.out.print("Ingrese la temperatura del baño (°C): ");
            //var temperatura = Double.parseDouble(consola.nextLine());

            //System.out.print("¿La válvula de drenaje está abierta? (true/false): ");
            //var valvulaDrenajeAbierta = Boolean.parseBoolean(consola.nextLine());

            //var estadoSistema = "";

            // 0. Validación de rango físico del sensor de nivel
            //if (nivelAgua < 0.0 || nivelAgua > 100.0) {
               // estadoSistema = "FALLA DE SENSOR: Lectura de nivel fuera de rango (0% - 100%).";
            //}
            // 1. Prioridad máxima (Interlock de seguridad): riesgo térmico en seco
            //else if (nivelAgua < 15.0 && temperatura > 40.0) {
              //  estadoSistema = "ALERTA CRÍTICA: Sobrecalentamiento por falta de fluido. Apagando motores.";
            //}
            // 2. Segunda prioridad: pérdida de baño durante la operación
            //else if (valvulaDrenajeAbierta) {
              //  estadoSistema = "ERROR: Válvula de drenaje abierta durante el ciclo.";
            //}
            // 3. Ventana de operación nominal (setpoint de nivel y temperatura)
            //else if ((nivelAgua >= 60.0 && nivelAgua <= 80.0) && (temperatura >= 30.0 && temperatura <= 35.0)) {
              //  estadoSistema = "Parámetros óptimos. Iniciando rotación del fulón.";
            //}
            // 4. Estados transitorios seguros (llenando o calentando)
            //else {
              //  estadoSistema = "Ajustando parámetros...";
            //}

            //System.out.printf("""
               //     %n--- Telemetría del Fulón ---
               //     Nivel de fluido:     %.1f%%
               //     Temperatura actual:  %.1f °C
               //     Válvula de drenaje:  %b
               //     Estado de control:   %s%n
               //     """, nivelAgua, temperatura, valvulaDrenajeAbierta, estadoSistema);
        //}
    //}
//}