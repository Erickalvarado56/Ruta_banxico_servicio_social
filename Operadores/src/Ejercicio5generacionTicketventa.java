import java.util.Scanner;

public class Ejercicio5generacionTicketventa {
    public static void main(String[] args) {
        //Ejercicio 5: Supongamos que compramos varios articulos en el supermercado
        //y queremos obtener el ticket de venta total incluyendo impuestos.
        //El sistema solicitará el precio de cada producto a comprar y el usuario
        //deberá indicar su precio (valor de tipo con punto decimal)
        //El sistema debe realizar la suma de cada producto, imprimir el total
        //de la compra
        System.out.println("Generación ticket de venta");
        var consola = new Scanner(System.in);

        System.out.print("Precio del producto leche: ");
        var precioLeche = Double.parseDouble(consola.nextLine());
        System.out.println("Precio del pan: ");
        var precioPan = Double.parseDouble(consola.nextLine());
        System.out.println("Precio lechuga: ");
        var precioLechuga = Double.parseDouble(consola.nextLine());
        System.out.println("Precio platanos: ");
        var precioPlatanos = Double.parseDouble(consola.nextLine());

        //Calculo subtotoal sin impuestos
        var subtotal = precioLeche + precioLechuga + precioPan + precioPlatanos;
        System.out.println("Pago antes de impuestos: " + subtotal);
        //Calculo total despues de impuestos
        var impuesto = subtotal*0.16;
        var costoTotal = subtotal + impuesto;
        System.out.printf("""
                Subtotal: $%.2f
                Impuesto (16%%): $%.2f
                Costo total de la compra: $%.2f
                """, subtotal, impuesto, costoTotal );
    }
}
