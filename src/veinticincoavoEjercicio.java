import java.util.Scanner;
public class veinticincoavoEjercicio {
    public static void main(String[] args) {
        int dias = 0;
        int errores = 0;
        double sumaMaximas = 0;
        double sumaMinimas = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("ESTACIÓN CLIMÁTICA");
        System.out.println("Ingrese las temperaturas (máxima y mínima)");
        System.out.println("Para terminar, ingrese 0 0\n");

        do {
            System.out.print("Temperatura máxima: ");
            double tempMax = entrada.nextDouble();

            System.out.print("Temperatura mínima: ");
            double tempMin = entrada.nextDouble();

            // Verificamos si es fin de datos
            if (tempMax == 0 && tempMin == 0) {
                break;
            }

            dias = dias + 1;

            // Verificamos si están fuera de rango
            if (tempMax < 14 || tempMax > 30 || tempMin < 14 || tempMin > 30) {
                errores = errores + 1;
                System.out.println("Error: Temperatura fuera de rango (14-30°C)");
            } else {
                sumaMaximas = sumaMaximas + tempMax;
                sumaMinimas = sumaMinimas + tempMin;
            }

        } while (true);

        // Mostramos resultados
        System.out.println("\n=== RESULTADOS ===");
        System.out.println("g) Días procesados: " + dias);

        if (dias > 0) {
            System.out.println("h) Media máxima: " + (sumaMaximas / dias));
            System.out.println("   Media mínima: " + (sumaMinimas / dias));
        }

        System.out.println("i) Errores ingresados: " + errores);

        if (dias > 0) {
            double porcentajeErrores = (errores * 100.0) / dias;
            System.out.println("j) Porcentaje de errores: " + porcentajeErrores + "%");
        }

        entrada.close();

    }
}
