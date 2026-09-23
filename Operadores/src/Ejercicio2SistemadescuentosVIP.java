import java.util.Scanner;

public class Ejercicio2SistemadescuentosVIP {
    public static void main(String[] args) {
        System.out.println("Sistema de Descuentos para VIP");
        final var numeroProductos = 10;
        var consola = new Scanner(System.in);
        System.out.print("Cuantos productos compraste hoy?: ");
        var cantidadProductos = Integer.parseInt(consola.nextLine());
        System.out.print("Tienes la membresia de la tienda?(true/false): ");
        var tienesMembresia = Boolean.parseBoolean(consola.nextLine());
        var eselegibleDescuentoVIP = cantidadProductos >= numeroProductos && tienesMembresia;
        System.out.println("Tienes acceso al descuento VIP?: "+eselegibleDescuentoVIP);
    }
}
