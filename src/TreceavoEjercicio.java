import java.util.Scanner;
public class TreceavoEjercicio {
    public static void main (String[] args) {
        double capital;
        double tasaInteres;
        int semanas;
        double capitalAcumulado;
        int diasTotales;
        int dia = 1;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Capital a depositar: $");
         capital = entrada.nextDouble();

        System.out.print("Tasa de interés anual (%): ");
         tasaInteres = entrada.nextDouble();

        System.out.print("Duración del depósito (semanas): ");
         semanas = entrada.nextInt();

         capitalAcumulado = capital;
         diasTotales = semanas * 7;

        do {
            // Calculamos el interés diario
            double interesDiario = (tasaInteres / 100) * capitalAcumulado / 365;
            capitalAcumulado = capitalAcumulado + interesDiario;

            System.out.println("Día " + dia + ": $" +
                    String.format("%.4f", capitalAcumulado));

            dia = dia + 1;
        } while (dia <= diasTotales);

        System.out.println("\nCapital total acumulado después de " + semanas +
                " semanas: $" + String.format("%.2f", capitalAcumulado));

        entrada.close();
    }
}
