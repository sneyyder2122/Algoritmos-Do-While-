import java.util.Scanner;
public class TreintavoEjercicio {
    public static void main(String[] args) {
        int miembro = 1;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Control de peso de 5 miembros\n");

        do {
            System.out.println("=== MIEMBRO #" + miembro + " ===");
            System.out.print("Nombre: ");
            String nombre = entrada.next();

            System.out.print("Peso de la última reunión (kg): ");
            double pesoAnterior = entrada.nextDouble();
            double sumaPesos = 0;
            int bascula = 1;

            do {
                System.out.print("Peso en báscula " + bascula + " (kg): ");
                double pesoBascula = entrada.nextDouble();
                sumaPesos = sumaPesos + pesoBascula;
                bascula = bascula + 1;
            } while (bascula <= 10);

            double pesoPromedio = sumaPesos / 10;


            double diferencia = pesoPromedio - pesoAnterior;


            System.out.println("Miembro: " + nombre);
            System.out.println("Peso anterior: " + pesoAnterior + " kg");
            System.out.println("Peso promedio actual: " + pesoPromedio + " kg");

            if (diferencia > 0) {
                System.out.println("SUBIO " + diferencia + " kg");
            } else if (diferencia < 0) {
                System.out.println("BAJO " + Math.abs(diferencia) + " kg");
            } else {
                System.out.println("MANTUVO su peso");
            }

            System.out.println();
            miembro = miembro + 1;

        } while (miembro <= 5);

        entrada.close();
    }
}