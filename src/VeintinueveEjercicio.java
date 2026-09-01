import java.util.Scanner;
public class VeintinueveEjercicio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int totalObreros = 0;
        int obrerosAlcanzaron = 0;
        double sumaProduccionTotal = 0;
        String obreroMasProdujo = "";
        int mayorProduccion = 0;

        System.out.println("Control de producción semanal");
        System.out.println("Para terminar, ingrese 'fin' como nombre\n");

        String nombre;
        do {
            System.out.print("Nombre del obrero (o 'fin'): ");
            nombre = entrada.next();

            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }

            System.out.print("Unidades a producir por semana (meta): ");
            int meta = entrada.nextInt();

            int produccionSemanal = 0;

            int dia = 1;
            do {
                System.out.print("Producción día " + dia + ": ");
                int produccionDia = entrada.nextInt();
                produccionSemanal = produccionSemanal + produccionDia;
                dia = dia + 1;
            } while (dia <= 6);

            totalObreros = totalObreros + 1;
            sumaProduccionTotal = sumaProduccionTotal + produccionSemanal;

            double porcentaje = (produccionSemanal * 100.0) / meta;


            System.out.println("\n--- RESULTADO DEL OBRERO ---");
            System.out.println("Nombre: " + nombre);
            System.out.println("Total producido: " + produccionSemanal);
            System.out.println("Porcentaje respecto a meta: " + porcentaje + "%");
            if (produccionSemanal >= meta) {
                obrerosAlcanzaron = obrerosAlcanzaron + 1;
            }
            if (produccionSemanal > mayorProduccion) {
                mayorProduccion = produccionSemanal;
                obreroMasProdujo = nombre;
            }

            System.out.println();

        } while (true);

        if (totalObreros > 0) {
            double porcentajeAlcanzaron = (obrerosAlcanzaron * 100.0) / totalObreros;
            System.out.println("Porcentaje que alcanzaron la meta: " + porcentajeAlcanzaron + "%");
            System.out.println("Obrero que más produjo: " + obreroMasProdujo +
                    " (" + mayorProduccion + " bloques)");
            System.out.println("Promedio de producción: " +
                    (sumaProduccionTotal / totalObreros) + " bloques");
        }

        entrada.close();
    }
}
