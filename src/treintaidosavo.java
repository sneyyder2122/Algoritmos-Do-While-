import java.util.Scanner;
public class treintaidosavo {
    public static void main(String[] args) {

        int totalHabitantes = 0;
        String estadoMayorPoblacion = "";
        int mayorPoblacion = 0;
        String estadoMenorPoblacion = "";
        int menorPoblacion = 999999999;
        int sumaHabitantes = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("5 Estados principales\n");

        int estado = 1;
        do {
            System.out.println("estado" + estado + " ===");
            System.out.print("Nombre del estado: ");
            String nombreEstado = entrada.next();

            System.out.print("Número de municipios: ");
            int numMunicipios = entrada.nextInt();

            int habitantesEstado = 0;
            int municipio = 1;

            do {
                System.out.print("Habitantes del municipio " + municipio + ": ");
                int habitantesMunicipio = entrada.nextInt();
                habitantesEstado = habitantesEstado + habitantesMunicipio;
                municipio = municipio + 1;
            } while (municipio <= numMunicipios);

            sumaHabitantes = sumaHabitantes + habitantesEstado;

            if (habitantesEstado > mayorPoblacion) {
                mayorPoblacion = habitantesEstado;
                estadoMayorPoblacion = nombreEstado;
            }

            if (habitantesEstado < menorPoblacion) {
                menorPoblacion = habitantesEstado;
                estadoMenorPoblacion = nombreEstado;
            }

            System.out.println("Habitantes de " + nombreEstado + ": " + habitantesEstado);
            System.out.println();

            estado = estado + 1;
        } while (estado <= 5);

        System.out.print("Total de habitantes del país: ");
        totalHabitantes = entrada.nextInt();

        // Mostramos resultados
        System.out.println("\n=== RESULTADOS ===");
        System.out.println("a) Estado con mayor población: " + estadoMayorPoblacion +
                " (" + mayorPoblacion + " habitantes)");
        System.out.println("b) Estado con menor población: " + estadoMenorPoblacion +
                " (" + menorPoblacion + " habitantes)");

        double porcentaje = (sumaHabitantes * 100.0) / totalHabitantes;
        System.out.println("c) Porcentaje respecto al total del país: " + porcentaje + "%");

        double promedio = sumaHabitantes / 5.0;
        System.out.println("d) Promedio de habitantes por estado: " + promedio);

        entrada.close();

    }
}
