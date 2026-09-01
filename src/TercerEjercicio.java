import java.util.Scanner;

public class TercerEjercicio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double F = 28;
        double C, K, R;

        System.out.println("Fahrenheit\tCelsius\tKelvin\tRankine");

        do {

            C = 5 * (F - 32) / 9;
            R = F + 459.67;
            K = C + 273.15;

            System.out.println(
                    F + "\t\t" +
                            C + "\t" +
                            K + "\t" +
                            R
            );

            F++;

        } while (F <= 54);

        sc.close();
    }
}
