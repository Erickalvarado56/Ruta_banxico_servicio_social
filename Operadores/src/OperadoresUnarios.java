public class OperadoresUnarios {
    public static void main(String[] args) {
        System.out.println("Operadores Unarios");
        int a = 3, b = -2, resultado;
        var c = true;
        //Operador Unario +
        resultado = +a;
        System.out.println("Resultado +a: " + resultado);

        //Operador unario negativo
        resultado = -a;
        System.out.println("Resultado -a: " + resultado);

        //Operador unario de incremento y decremento
        // Pre-incremento
        a = 3;
        resultado = ++a;  //pre-incremento
        System.out.println("preincremento: " + resultado);
        System.out.println("a ya se incrementó: " + a);
        //Post incremento
        a = 3;
        resultado = a++; //1ro el valor, despues incrementa
        System.out.println("Post incremento: "+ resultado);
        System.out.println("a en este momento se incrementa= " + a);

        //Pre decremento
        b = -2;
        resultado = --b; // primero de incrementa y despues se usa el valor de la variable
        System.out.println("Resultado --b: "+resultado);
        System.out.println("b ya se decrementó = "+b);
        //Post decremento
        b=-2;
        resultado = b--; //primero el valor, despues se decrementa
        System.out.println("Resultado b--: "+resultado);
        System.out.println("b ya se decrementó: "+b);

    }
}
