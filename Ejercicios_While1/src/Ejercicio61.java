import java.util.Scanner;

public class Ejercicio61 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int multiplicador;
        int multiplicando;
        int resultado = 0;

        System.out.print("Multiplicador: ");
        multiplicador = entrada.nextInt();

        System.out.print("Multiplicando: ");
        multiplicando = entrada.nextInt();

        while (multiplicador >= 1) {

            if (multiplicador % 2 != 0) {
                resultado += multiplicando;
            }

            multiplicador /= 2;
            multiplicando *= 2;
        }

        System.out.println("Resultado: " + resultado);

        entrada.close();
    }
}