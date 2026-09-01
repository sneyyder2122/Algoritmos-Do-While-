import java.util.Scanner;
public class TreintaunEjercicio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Número de grupos: ");
        int numGrupos = entrada.nextInt();

        System.out.print("Número de alumnos por grupo: ");
        int numAlumnos = entrada.nextInt();

        System.out.print("Número de materias: ");
        int numMaterias = entrada.nextInt();

        double sumaPromediosGrupos = 0;
        int grupo = 1;

        do {
            System.out.println("\n=== GRUPO " + grupo + " ===");
            double sumaPromediosAlumnos = 0;
            int alumno = 1;

            do {
                System.out.println("\nAlumno " + alumno + ":");
                double sumaPromediosMaterias = 0;
                int materia = 1;

                do {
                    System.out.println("Materia " + materia + ":");
                    double sumaCalificaciones = 0;
                    int calificacion = 1;

                    do {
                        System.out.print("Calificación " + calificacion + ": ");
                        double nota = entrada.nextDouble();
                        sumaCalificaciones = sumaCalificaciones + nota;
                        calificacion = calificacion + 1;
                    } while (calificacion <= 3);

                    double promedioMateria = sumaCalificaciones / 3;
                    sumaPromediosMaterias = sumaPromediosMaterias + promedioMateria;

                    System.out.println("Promedio de la materia: " + promedioMateria);
                    materia = materia + 1;
                } while (materia <= numMaterias);

                double promedioAlumno = sumaPromediosMaterias / numMaterias;
                sumaPromediosAlumnos = sumaPromediosAlumnos + promedioAlumno;

                System.out.println("Promedio del alumno: " + promedioAlumno);
                alumno = alumno + 1;
            } while (alumno <= numAlumnos);

            double promedioGrupo = sumaPromediosAlumnos / numAlumnos;
            sumaPromediosGrupos = sumaPromediosGrupos + promedioGrupo;

            System.out.println("\nPromedio del grupo: " + promedioGrupo);
            grupo = grupo + 1;
        } while (grupo <= numGrupos);

        double promedioGeneral = sumaPromediosGrupos / numGrupos;
        System.out.println("\nPromedio general de todos los grupos: " + promedioGeneral);

        entrada.close();
    }
}