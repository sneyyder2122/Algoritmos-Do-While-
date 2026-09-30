import java.util.Scanner;

public class Ejercicio77 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int estado = 1;
        int municipios;
        String nombre;
        String mayorEstado = "";
        String menorEstado = "";
        long habitantes;
        long totalEstado;
        long mayor = 0;
        long menor = 0;
        long totalCinco = 0;
        double totalPais;

        System.out.print("Total de habitantes del pais: ");
        totalPais = entrada.nextDouble();

        while (estado <= 5) {

            entrada.nextLine();

            System.out.print("Nombre del estado: ");
            nombre = entrada.nextLine();

            System.out.print("Cantidad de municipios: ");
            municipios = entrada.nextInt();

            int municipio = 1;
            totalEstado = 0;

            while (municipio <= municipios) {

                System.out.print("Habitantes del municipio "
                        + municipio + ": ");

                habitantes = entrada.nextLong();

                totalEstado += habitantes;

                municipio++;
            }

            System.out.println("Habitantes del estado: " + totalEstado);

            if (estado == 1) {
                mayor = totalEstado;
                menor = totalEstado;
                mayorEstado = nombre;
                menorEstado = nombre;
            }

            if (totalEstado > mayor) {
                mayor = totalEstado;
                mayorEstado = nombre;
            }

            if (totalEstado < menor) {
                menor = totalEstado;
                menorEstado = nombre;
            }

            totalCinco += totalEstado;

            estado++;
        }

        System.out.println("Estado con mayor poblacion: "
                + mayorEstado + " - " + mayor);

        System.out.println("Estado con menor poblacion: "
                + menorEstado + " - " + menor);

        System.out.println("Porcentaje respecto al pais: "
                + totalCinco * 100.0 / totalPais + "%");

        System.out.println("Promedio por estado: "
                + (double) totalCinco / 5);

        entrada.close();
    }
}