public class operadoresaritmeticos {
    public static void main(String[] args) {
        System.out.println("Operadores aritmeticos");
        double a = 5, b = 3, resultado = 0;
        // Suma +
        resultado = a+ b;
        System.out.println(" resultado de suma = " + resultado);
        // Resta -
        resultado = a - b;
        System.out.println("resultado de resta = " + resultado);
        // multiplicacion *
        resultado = a * b;
        System.out.println("resultado de multiplicacion = " + resultado);
        // Division /
        resultado = a / b;
        System.out.println("resultado de la division = " + resultado);
        // Modulo (residuo division %)
        resultado = a % b;
        System.out.println("resultado del modulo = "+ resultado );

        //Ejercicios propuestos por gemini
        // 1.- Declara dos variables enteras x y y. Imprime el resultado de sumarlas.
        //SOLUCIÓN
        var x = 56;
        var y = 25;
        resultado = x;
        resultado = y;
        System.out.println("X = "+x);
        System.out.println("Y = "+y);

        // 2.- Declara tres variables tipo double. Réstale a la primera las otras dos e imprime el resultado.
        double t = 6, s = 25, p = 4;
        resultado = t - s - p;
        System.out.println("Resultado: "+resultado);

        //Multiplica dos números decimales directamente dentro de un System.out.println
        var v = 0.23, z = 2.36;
        System.out.println("", v*z);
    }
}
