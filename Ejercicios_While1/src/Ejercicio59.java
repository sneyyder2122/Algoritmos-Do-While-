import java.util.Scanner;

public class Ejercicio59 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int continuar = 1;
        int alumnos = 0;
        double matematica;
        double programacion;
        double ingles;
        double menorProgramacion = 0;
        double sumaProgramacion = 0;
        int noIngles = 0;
        int siIngles = 0;
        int aprobaronTodas = 0;
        int reprobaronMatematica = 0;
        int presentaronMatematica = 0;

        while (continuar == 1) {

            System.out.print("Nota Matemática (-1 si no presento): ");
            matematica = entrada.nextDouble();

            System.out.print("Nota Programación (-1 si no presento): ");
            programacion = entrada.nextDouble();

            System.out.print("Nota Inglés (-1 si no presento): ");
            ingles = entrada.nextDouble();

            alumnos++;

            if (programacion >= 0) {

                sumaProgramacion += programacion;

                if (menorProgramacion == 0 || programacion < menorProgramacion) {
                    menorProgramacion = programacion;
                }
            }

            if (ingles < 0) {
                noIngles++;
            } else {
                siIngles++;
            }

            if (matematica >= 0) {

                presentaronMatematica++;

                if (matematica < 10) {
                    reprobaronMatematica++;
                }
            }

            if (matematica >= 10 && programacion >= 10 && ingles >= 10) {
                aprobaronTodas++;
            }

            System.out.print("¿Desea ingresar otro alumno? 1=Si 0=No: ");
            continuar = entrada.nextInt();
        }

        System.out.println("Nota menor de Programacion: " + menorProgramacion);

        if (siIngles > 0) {
            System.out.println("Porcentaje no presentaron Ingles: "
                    + noIngles * 100.0 / siIngles + "%");
        }

        System.out.println("Aprobaron todas: " + aprobaronTodas);

        System.out.println("Promedio Programacion: "
                + sumaProgramacion / alumnos);

        if (presentaronMatematica > 0) {
            System.out.println("Porcentaje reprobaron Matematica: "
                    + reprobaronMatematica * 100.0 / presentaronMatematica + "%");
        }

        entrada.close();
    }
}
