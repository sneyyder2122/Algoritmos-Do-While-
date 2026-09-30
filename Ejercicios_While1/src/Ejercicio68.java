import java.util.Scanner;

public class Ejercicio68 {
    public static void main(String[] args) {

        int numero = 2;
        int encontrados = 0;

        while (encontrados < 3) {

            int divisor = 1;
            int suma = 0;

            while (divisor < numero) {

                if (numero % divisor == 0) {
                    suma += divisor;
                }

                divisor++;
            }

            if (suma == numero) {
                System.out.println(numero);
                encontrados++;
            }

            numero++;
        }
    }
}