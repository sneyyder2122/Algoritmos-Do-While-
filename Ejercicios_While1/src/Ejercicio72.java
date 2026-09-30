import java.util.Scanner;

public class Ejercicio72 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        final double G = 6.67259e-11;
        final double M = 5.97e24;
        int cantidad;
        int contador = 1;
        double masa;
        double altura;
        double fuerza;
        double mayorFuerza = 0;
        double menorFuerza = 0;
        double sumaFuerza = 0;
        double mayorMasa = 0;
        double sumaMasa = 0;
        double mayorAltura = 0;
        double menorAltura = 0;

        System.out.print("Cantidad de satelites: ");
        cantidad = entrada.nextInt();

        while (contador <= cantidad) {

            System.out.print("Masa del satelite: ");
            masa = entrada.nextDouble();

            System.out.print("Altura/distancia: ");
            altura = entrada.nextDouble();

            fuerza = G * masa * M / (altura * altura);

            System.out.println("Fuerza: " + fuerza);

            if (contador == 1) {
                mayorFuerza = fuerza;
                menorFuerza = fuerza;
                mayorAltura = altura;
                menorAltura = altura;
            }

            if (fuerza > mayorFuerza) {
                mayorFuerza = fuerza;
            }

            if (fuerza < menorFuerza) {
                menorFuerza = fuerza;
            }

            if (masa > mayorMasa) {
                mayorMasa = masa;
            }

            if (altura > mayorAltura) {
                mayorAltura = altura;
            }

            if (altura < menorAltura) {
                menorAltura = altura;
            }

            sumaFuerza += fuerza;
            sumaMasa += masa;

            contador++;
        }

        System.out.println("Mayor fuerza: " + mayorFuerza);
        System.out.println("Menor fuerza: " + menorFuerza);
        System.out.println("Promedio fuerza: " + sumaFuerza / cantidad);
        System.out.println("Mayor masa: " + mayorMasa);
        System.out.println("Promedio masa: " + sumaMasa / cantidad);
        System.out.println("Mayor altura: " + mayorAltura);
        System.out.println("Menor altura: " + menorAltura);

        entrada.close();
    }
}
