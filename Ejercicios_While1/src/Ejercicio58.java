
import java.util.Scanner;

public class Ejercicio58 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double capital;
        double capitalInicial;
        double tasa;
        double interes;

        int semanas;
        int dias = 1;

        System.out.print("Capital: ");
        capital = entrada.nextDouble();

        System.out.print("Tasa de interes (%): ");
        tasa = entrada.nextDouble();

        System.out.print("Duracion en semanas: ");
        semanas = entrada.nextInt();

        capitalInicial = capital;
        tasa = tasa / 100;

        while (dias <= semanas * 7) {

            interes = capitalInicial * tasa / 365;
            capital += interes;

            dias++;
        }

        System.out.println("Capital acumulado: " + capital);

        entrada.close();
    }
}