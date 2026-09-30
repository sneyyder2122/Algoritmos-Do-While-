import java.util.Scanner;

public class Ejercicio76 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int grupos;
        int alumnos;
        int materias;
        int grupo = 1;
        int alumno;
        int materia;
        int nota;
        double calificacion;
        double sumaMateria;
        double promedioMateria;
        double sumaAlumno;
        double promedioAlumno;
        double sumaGrupo;
        double promedioGrupo;
        double sumaGeneral = 0;
        int cantidadAlumnos = 0;

        System.out.print("Cantidad de grupos: ");
        grupos = entrada.nextInt();

        System.out.print("Cantidad de alumnos por grupo: ");
        alumnos = entrada.nextInt();

        System.out.print("Cantidad de materias: ");
        materias = entrada.nextInt();

        while (grupo <= grupos) {

            alumno = 1;
            sumaGrupo = 0;

            while (alumno <= alumnos) {

                materia = 1;
                sumaAlumno = 0;

                while (materia <= materias) {

                    nota = 1;
                    sumaMateria = 0;

                    while (nota <= 3) {

                        System.out.print("Grupo " + grupo
                                + ", alumno " + alumno
                                + ", materia " + materia
                                + ", nota " + nota + ": ");

                        calificacion = entrada.nextDouble();

                        sumaMateria += calificacion;
                        nota++;
                    }

                    promedioMateria = sumaMateria / 3;

                    sumaAlumno += promedioMateria;
                    materia++;
                }

                promedioAlumno = sumaAlumno / materias;

                System.out.println("Promedio alumno: "
                        + promedioAlumno);

                sumaGrupo += promedioAlumno;
                sumaGeneral += promedioAlumno;
                cantidadAlumnos++;

                alumno++;
            }

            promedioGrupo = sumaGrupo / alumnos;

            System.out.println("Promedio grupo " + grupo
                    + ": " + promedioGrupo);

            grupo++;
        }

        System.out.println("Promedio general: "
                + sumaGeneral / cantidadAlumnos);

        entrada.close();
    }
}