import java.util.Scanner;
public class NovenoEjercicio {
    public static void main (String[] args){


        int cuestionario = 1;

        Scanner entrada = new Scanner(System.in)
                ;

        double sumaPromedios = 0;
        double promedioMasAlto = 0;
        int instrumentoMasAlto = 0;
        double promedioMasBajo = 5;
        int instrumentoMasBajo = 0;
        int inferiorA3 = 0;
        int superiorA4 = 0;
        int entre45y5 = 0;

        do {
            System.out.println("\n Cuestionario #" + cuestionario + " ===");
            int sumaPuntos = 0;
            int pregunta = 1;

            do {
                System.out.print("Pregunta " + pregunta + " (1 a 5): ");
                int respuesta = entrada.nextInt();

                if (respuesta >= 1 && respuesta <= 5) {
                    sumaPuntos = sumaPuntos + respuesta;
                    pregunta = pregunta + 1;
                } else {
                    System.out.println("Error: Debe ser un número entre 1 y 5");
                }
            } while (pregunta <= 23);

            double promedio = (double) sumaPuntos / 23;
            sumaPromedios = sumaPromedios + promedio;

            if (promedio > promedioMasAlto) {
                promedioMasAlto = promedio;
                instrumentoMasAlto = cuestionario;
            }

            if (promedio < promedioMasBajo) {
                promedioMasBajo = promedio;
                instrumentoMasBajo = cuestionario;
            }

            if (promedio < 3) {
                inferiorA3 = inferiorA3 + 1;
            } else if (promedio > 4) {
                superiorA4 = superiorA4 + 1;
            }

            if (promedio >= 4.5 && promedio <= 5) {
                entre45y5 = entre45y5 + 1;
            }

            cuestionario = cuestionario + 1;
        } while (cuestionario <= 64);

        // Calculamos y mostramos resultados
        double promedioGeneral = sumaPromedios / 64;

        System.out.println("\n=== RESULTADOS ===");
        System.out.println("a) Promedio general: " + promedioGeneral);
        System.out.println("b) Promedio más alto: " + promedioMasAlto +
                " (Cuestionario #" + instrumentoMasAlto + ")");
        System.out.println("c) Promedio más bajo: " + promedioMasBajo +
                " (Cuestionario #" + instrumentoMasBajo + ")");

        if (superiorA4 > 0) {
            double porcentaje = (double) inferiorA3 / superiorA4 * 100;
            System.out.println("d) Porcentaje inferior a 3 vs superior a 4: " + porcentaje + "%");
        }

        double porcentaje45y5 = (double) entre45y5 / 64 * 100;
        System.out.println("e) Porcentaje entre 4.5 y 5: " + porcentaje45y5 + "%");

        entrada.close();
    }
}
