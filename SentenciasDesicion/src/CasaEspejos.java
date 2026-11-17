import java.util.Scanner;

public class CasaEspejos {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la casa de los espejos");

        var consola = new Scanner(System.in);

        System.out.print("Cual es tu edad?: ");
        var edad = Integer.parseInt(consola.nextLine());

        System.out.print("Tienes miedo a la escuridad(true/false)? ");
        var miedoOscuridad = Boolean.parseBoolean(consola.nextLine());

         if(!miedoOscuridad && edad >=10){
             System.out.println("Puedes entrar y no tendras miedo");
         }
         else{
             System.out.println("Puede darte miedo a la casa de los espejos");
         }

    }
}
