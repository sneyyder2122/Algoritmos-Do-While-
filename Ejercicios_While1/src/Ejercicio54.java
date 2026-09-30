import java.util.Scanner;

public class Ejercicio54 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int cuestionario = 1;
        int pregunta;
        double respuesta;
        double totalPuntos;
        double promedio;
        double sumaPromedios = 0;
        double promedioMayor = 0;
        double promedioMenor = 0;
        int cuestionarioMayor = 0;
        int cuestionarioMenor = 0;
        int menores3 = 0;
        int mayores4 = 0;
        int entre45y5 = 0;

        while (cuestionario <= 64) {

            totalPuntos = 0;
            pregunta = 1;

            while (pregunta <= 23) {

                System.out.print("Cuestionario " + cuestionario +
                        ", pregunta " + pregunta + ": ");

                respuesta = entrada.nextDouble();

                totalPuntos = totalPuntos + respuesta;

                pregunta++;
            }

            promedio = totalPuntos / 23;

            sumaPromedios = sumaPromedios + promedio;

            if (cuestionario == 1) {
                promedioMayor = promedio;
                promedioMenor = promedio;
                cuestionarioMayor = cuestionario;
                cuestionarioMenor = cuestionario;
            }

            if (promedio > promedioMayor) {
                promedioMayor = promedio;
                cuestionarioMayor = cuestionario;
            }

            if (promedio < promedioMenor) {
                promedioMenor = promedio;
                cuestionarioMenor = cuestionario;
            }

            if (promedio < 3) {
                menores3++;
            }

            if (promedio > 4) {
                mayores4++;
            }

            if (promedio >= 4.5 && promedio <= 5) {
                entre45y5++;
            }

            cuestionario++;
        }

        double promedioGeneral = sumaPromedios / 64;

        System.out.println("Promedio general: " + promedioGeneral);
        System.out.println("Promedio mas alto: " + promedioMayor);
        System.out.println("Cuestionario con promedio mas alto: " + cuestionarioMayor);
        System.out.println("Promedio mas bajo: " + promedioMenor);
        System.out.println("Cuestionario con promedio mas bajo: " + cuestionarioMenor);

        if (mayores4 > 0) {
            System.out.println("Porcentaje menores de 3 respecto a mayores de 4: " + (menores3 * 100.0 / mayores4) + "%");
        }

        System.out.println("Porcentaje entre 4.5 y 5: " + (entre45y5 * 100.0 / 64) + "%");

        entrada.close();
    }
}