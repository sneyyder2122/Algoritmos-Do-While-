
public class Ejercicio48 {
    public static void main(String[] args) {

        double F, C, K, R;

        System.out.println("Tabla de 28 a 54");
        System.out.println("Fahrenheit\tCelsius\tKelvin\tRankine");

        F = 28;

        while (F <= 54) {

            C = 5 * (F - 32) / 9;
            R = F + 459.67;
            K = C + 273.15;

            System.out.printf("%.2f\t\t%.2f\t%.2f\t%.2f%n", F, C, K, R);

            F = F + 1;
        }

        System.out.println();
        System.out.println("Tabla de 450 a 950");
        System.out.println("Fahrenheit\tCelsius\tKelvin\tRankine");

        F = 450;

        while (F <= 950) {

            C = 5 * (F - 32) / 9;
            R = F + 459.67;
            K = C + 273.15;

            System.out.printf("%.2f\t\t%.2f\t%.2f\t%.2f%n", F, C, K, R);

            F = F + 50;
        }

        System.out.println();
        System.out.println("Tabla de -50 a 250");
        System.out.println("Fahrenheit\tCelsius\tKelvin\tRankine");

        F = -50;

        while (F <= 250) {

            C = 5 * (F - 32) / 9;
            R = F + 459.67;
            K = C + 273.15;

            System.out.printf("%.2f\t\t%.2f\t%.2f\t%.2f%n", F, C, K, R);

            F = F + 10;
        }
    }
}