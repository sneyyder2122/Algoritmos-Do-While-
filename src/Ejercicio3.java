import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double F, C, K, R;
        double inicio, fin, incremento;

        System.out.print("Ingrese la temperatura inicial en Fahrenheit: ");
        inicio = entrada.nextDouble();

        System.out.print("Ingrese la temperatura final en Fahrenheit: ");
        fin = entrada.nextDouble();

        System.out.print("Ingrese el intervalo: ");
        incremento = entrada.nextDouble();

        F = inicio;

        System.out.println("\nFahrenheit\tCelsius\t\tKelvin\t\tRankine");

        do {

            C = 5 * (F - 32) / 9;
            R = F + 459.67;
            K = C + 273.15;

            System.out.printf("%.2f\t\t%.2f\t\t%.2f\t\t%.2f%n",
                    F, C, K, R);

            F = F + incremento;

        } while (F <= fin);

        entrada.close();
    }
}
