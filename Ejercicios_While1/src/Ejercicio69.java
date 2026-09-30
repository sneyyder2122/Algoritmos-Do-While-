import java.util.Scanner;

public class Ejercicio69 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int cantidad;

        System.out.print("Cantidad de pares amigos a buscar: ");
        cantidad = entrada.nextInt();

        int encontrados = 0;
        int a = 2;

        while (encontrados < cantidad) {

            int divisor = 1;
            int sumaA = 0;

            while (divisor < a) {

                if (a % divisor == 0) {
                    sumaA += divisor;
                }

                divisor++;
            }

            int b = sumaA;

            if (b > a) {

                divisor = 1;
                int sumaB = 0;

                while (divisor < b) {

                    if (b % divisor == 0) {
                        sumaB += divisor;
                    }

                    divisor++;
                }

                if (sumaB == a) {
                    System.out.println(a + " y " + b);
                    encontrados++;
                }
            }

            a++;
        }

        entrada.close();
    }
}