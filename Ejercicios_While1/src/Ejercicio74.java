import java.util.Scanner;

public class Ejercicio74 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int obreros;
        int obrero = 1;
        int dia;
        String nombre;
        double limite;
        double produccion;
        double total;
        double sumaProduccion = 0;
        double mayorProduccion = 0;
        String nombreMayor = "";

        int alcanzaron = 0;

        System.out.print("Cantidad de obreros: ");
        obreros = entrada.nextInt();

        System.out.print("Limite semanal: ");
        limite = entrada.nextDouble();

        while (obrero <= obreros) {

            entrada.nextLine();

            System.out.print("Nombre: ");
            nombre = entrada.nextLine();

            dia = 1;
            total = 0;

            while (dia <= 7) {

                System.out.print("Produccion dia " + dia + ": ");
                produccion = entrada.nextDouble();

                total += produccion;

                dia++;
            }

            System.out.println("Obrero: " + nombre);
            System.out.println("Total semanal: " + total);
            System.out.println("Porcentaje: " + total * 100 / limite + "%");

            if (total >= limite) {
                alcanzaron++;
            }

            if (total > mayorProduccion) {
                mayorProduccion = total;
                nombreMayor = nombre;
            }

            sumaProduccion += total;

            obrero++;
        }

        System.out.println("Porcentaje que alcanzo el limite: "
                + alcanzaron * 100.0 / obreros + "%");

        System.out.println("Mayor productor: " + nombreMayor);
        System.out.println("Produccion mayor: " + mayorProduccion);
        System.out.println("Promedio semanal: " + sumaProduccion / obreros);

        entrada.close();
    }
}