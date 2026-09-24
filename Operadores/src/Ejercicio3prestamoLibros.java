import java.util.Scanner;

public class Ejercicio3prestamoLibros {
    public static void main(String[] args) {
        System.out.println("Prestamo de libros");
        final var distancia_permitida_km = 3;
        var consola = new Scanner(System.in);

        System.out.print("Cuentas con credencial de estudiante?(true/false):");
        var tienesCredencial = Boolean.parseBoolean(consola.nextLine());

        System.out.print("A cuantos Km vives de la biblioteca?:");
        var distanciaBiblioteca = Integer.parseInt(consola.nextLine());

        var eselegiblePrestamo = tienesCredencial || distanciaBiblioteca < distancia_permitida_km;
        System.out.println("Eres elegible para prestamo de libros?: " + eselegiblePrestamo);

    }
}
