import java.util.Scanner;
public class OnceavoEjercicio {
    public static void main (String[] args){
        int dividendo;
        int divisor;
        int cociente = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el dividendo: ");
        dividendo = entrada.nextInt();
        System.out.print("Ingrese el divisor: ");
         divisor = entrada.nextInt();

        if (divisor == 0) {
            System.out.println("Error: No se puede dividir entre cero");
            return;
        }
        int resto = dividendo;
        System.out.println("\nProceso de división:");

        do {
            if (resto < divisor) {
                break;
            }

            resto = resto - divisor;
            cociente = cociente + 1;
            System.out.println("Restamos " + divisor + ": queda " + resto);
        } while (resto >= divisor);

        System.out.println("\nResultado:");
        System.out.println("Cociente: " + cociente);
        System.out.println("Resto: " + resto);

        entrada.close();

    }
}
