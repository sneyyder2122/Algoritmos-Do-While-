import java.util.Scanner;
public class CatorceavoEjercicio {
    public static void main (String[] args){

        double notaMenorProgramacion = 20;
        int presentaronIngles = 0;
        int noPresentaronIngles = 0;
        int aprobaronTodas = 0;
        double sumaProgramacion = 0;
        int presentaronMatematica = 0;
        int reprobaronMatematica = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese las notas de los alumnos");
        System.out.println("Use -1 si el alumno no presentó la materia");
        System.out.println("Para terminar, escriba 'fin' como nombre\n");

        String nombre;
        do {
            System.out.print("Nombre del alumno (o 'fin' para terminar): ");
            nombre = entrada.next();

            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }

            System.out.print("Nota Matemática (0-20 o -1): ");
            double notaMate = entrada.nextDouble();

            System.out.print("Nota Programación (0-20 o -1): ");
            double notaProg = entrada.nextDouble();

            System.out.print("Nota Inglés (0-20 o -1): ");
            double notaIngles = entrada.nextDouble();

            if (notaProg >= 0 && notaProg < notaMenorProgramacion) {
                notaMenorProgramacion = notaProg;
            }

            if (notaIngles >= 0) {
                presentaronIngles = presentaronIngles + 1;
            } else {
                noPresentaronIngles = noPresentaronIngles + 1;
            }
            if (notaMate >= 10 && notaProg >= 10 && notaIngles >= 10) {
                aprobaronTodas = aprobaronTodas + 1;
            }

            if (notaProg >= 0) {
                sumaProgramacion = sumaProgramacion + notaProg;
            }
            if (notaMate >= 0) {
                presentaronMatematica = presentaronMatematica + 1;
                if (notaMate < 10) {
                    reprobaronMatematica = reprobaronMatematica + 1;
                }
            }

        } while (true);
        System.out.println("a) Nota menor de Programación: " + notaMenorProgramacion);

        double porcentajeNoIngles = (double) noPresentaronIngles /
                (presentaronIngles + noPresentaronIngles) * 100;
        System.out.println("b) Porcentaje que no presentaron Inglés: " + porcentajeNoIngles + "%");

        System.out.println("c) Alumnos que aprobaron todas: " + aprobaronTodas);

        double promedioProg = sumaProgramacion / presentaronIngles;
        System.out.println("d) Promedio general en Programación: " + promedioProg);

        double porcentajeReprobaronMate = (double) reprobaronMatematica /
                presentaronMatematica * 100;
        System.out.println("e) Porcentaje que reprobaron Matemática: " +
                porcentajeReprobaronMate + "%");

        entrada.close();
    }
}
