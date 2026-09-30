import java.util.Scanner;

public class Ejercicio56 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int dividendo;
        int divisor;
        int cociente = 0;
        int residuo;

        System.out.print("Dividendo: ");
        dividendo = entrada.nextInt();

        System.out.print("Divisor: ");
        divisor = entrada.nextInt();

        residuo = dividendo;

        while (residuo >= divisor) {
            residuo -= divisor;
            cociente++;
        }

        System.out.println("Cociente: " + cociente);
        System.out.println("Residuo: " + residuo);

        entrada.close();
    }
}