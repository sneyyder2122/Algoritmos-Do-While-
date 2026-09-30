import java.util.Scanner;

public class Ejercicio75 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int persona = 1;
        int pesaje;
        double pesoAnterior;
        double peso;
        double suma;
        double promedio;
        double diferencia;

        while (persona <= 5) {

            System.out.print("Peso anterior de la persona "
                    + persona + ": ");
            pesoAnterior = entrada.nextDouble();

            suma = 0;
            pesaje = 1;

            while (pesaje <= 10) {

                System.out.print("Pesaje " + pesaje + ": ");
                peso = entrada.nextDouble();

                suma += peso;

                pesaje++;
            }

            promedio = suma / 10;
            diferencia = promedio - pesoAnterior;

            if (diferencia > 0) {
                System.out.println("SUBIO " + diferencia + " kilos");
            }

            if (diferencia < 0) {
                System.out.println("BAJO " + Math.abs(diferencia) + " kilos");
            }

            if (diferencia == 0) {
                System.out.println("MANTUVO EL MISMO PESO");
            }

            persona++;
        }

        entrada.close();
    }
 }


