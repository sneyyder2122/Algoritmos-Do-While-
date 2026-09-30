import java.util.Scanner;

public class Ejercicio70 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double maxima;
        double minima;
        int dias = 0;
        int errores = 0;
        double sumaMaximas = 0;
        double sumaMinimas = 0;

        System.out.print("Temperatura maxima: ");
        maxima = entrada.nextDouble();

        System.out.print("Temperatura minima: ");
        minima = entrada.nextDouble();

        while (maxima != 0 || minima != 0) {

            dias++;

            sumaMaximas += maxima;
            sumaMinimas += minima;

            if (maxima < 14 || maxima > 30 ||
                    minima < 14 || minima > 30) {
                errores++;
            }

            System.out.print("Temperatura maxima: ");
            maxima = entrada.nextDouble();

            System.out.print("Temperatura minima: ");
            minima = entrada.nextDouble();
        }

        System.out.println("Dias proporcionados: " + dias);
        System.out.println("Media maxima: " + sumaMaximas / dias);
        System.out.println("Media minima: " + sumaMinimas / dias);
        System.out.println("Errores: " + errores);
        System.out.println("Porcentaje de errores: "
                + errores * 100.0 / dias + "%");

        entrada.close();
    }
}