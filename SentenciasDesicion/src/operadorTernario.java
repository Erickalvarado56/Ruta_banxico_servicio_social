public class operadorTernario {
    public static void main(String[] args) {
        System.out.println("Operador ternario");

        //Sintaxis
        //condicion ? exp1 : exp2

        //Determinar si un numero es par o no
        var numero = 9;
        var resultado = (numero % 2 == 0) ? "par" : "impar";
        System.out.println("El numero:  " + numero + " es " + resultado);

        // Calcular si es mayor de edad
        var edad = 55;
        var mensaje = (edad >= 18) ? "eres mayor de edad" : "eres menor de edad";
        System.out.println("Tienes " + edad + " , " + mensaje);

        // Valor positivo, valor negativo, o cero
        numero = -96;
        resultado = (numero >0) ? "Positivo" : (numero < 0) ? "Negativo" : "Cero";
        System.out.println("\nEl numero " + numero + " es " + resultado);
    }
}
