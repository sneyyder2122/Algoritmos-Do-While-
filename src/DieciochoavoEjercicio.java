import java.util.Scanner;
public class DieciochoavoEjercicio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int totalAlumnos = 0;


        int sumaEdadMujeres = 0, contMujeres = 0;
        int sumaEdadHombres = 0, contHombres = 0;
        int solteros = 0, casados = 0, divorciados = 0, viudos = 0;
        int contSolterosHombres = 0, contSolterasMujeres = 0;
        int mujeresAdultas = 0, hombresJovenes = 0;


        int contSistemas = 0, contElectronica = 0, contMecanica = 0, contCivil = 0;

        System.out.println("ENCUESTA DE ALUMNOS");
        System.out.println("Para terminar, ingrese 'fin' como nombre\n");

        String nombre;
        do {
            System.out.print("Nombre del alumno (o 'fin'): ");
            nombre = entrada.next();

            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }

            System.out.print("Edad: ");
            int edad = entrada.nextInt();

            System.out.print("Sexo (M/F): ");
            char sexo = entrada.next().charAt(0);

            System.out.print("Estado civil (S/C/D/V): ");
            char estadoCivil = entrada.next().charAt(0);

            System.out.print("Especialidad (S/E/M/C): ");
            char especialidad = entrada.next().charAt(0);

            totalAlumnos = totalAlumnos + 1;

            if (sexo == 'F') {
                sumaEdadMujeres = sumaEdadMujeres + edad;
                contMujeres = contMujeres + 1;


                if (edad > 21) {
                    mujeresAdultas = mujeresAdultas + 1;
                }

                if (estadoCivil == 'S') {
                    contSolterasMujeres = contSolterasMujeres + 1;
                }
            } else if (sexo == 'M') {
                sumaEdadHombres = sumaEdadHombres + edad;
                contHombres = contHombres + 1;

                if (edad < 21 && edad > 17) {
                    hombresJovenes = hombresJovenes + 1;
                }
                if (estadoCivil == 'S') {
                    contSolterosHombres = contSolterosHombres + 1;
                }
            }

            if (estadoCivil == 'S') {
                solteros = solteros + 1;
            } else if (estadoCivil == 'C') {
                casados = casados + 1;
            } else if (estadoCivil == 'D') {
                divorciados = divorciados + 1;
            } else if (estadoCivil == 'V') {
                viudos = viudos + 1;
            }

            if (especialidad == 'S') {
                contSistemas = contSistemas + 1;
            } else if (especialidad == 'E') {
                contElectronica = contElectronica + 1;
            } else if (especialidad == 'M') {
                contMecanica = contMecanica + 1;
            } else if (especialidad == 'C') {
                contCivil = contCivil + 1;
            }

        } while (true);
        System.out.println("\n=== RESULTADOS DE LA ENCUESTA ===");

        if (contMujeres > 0) {
            System.out.println("a) Promedio de edad de mujeres: " +
                    (sumaEdadMujeres / contMujeres));
        } else {
            System.out.println("a) No hubo mujeres encuestadas");
        }

        if (contHombres > 0) {
            System.out.println("b) Promedio de edad de hombres: " +
                    (sumaEdadHombres / contHombres));
        } else {
            System.out.println("b) No hubo hombres encuestados");
        }

        System.out.println("c) Hombres encuestados: " + contHombres);
        System.out.println("   Mujeres encuestadas: " + contMujeres);

        System.out.println("d) Porcentaje por estado civil:");
        System.out.println("   Solteros: " + (solteros * 100.0 / totalAlumnos) + "%");
        System.out.println("   Casados: " + (casados * 100.0 / totalAlumnos) + "%");
        System.out.println("   Divorciados: " + (divorciados * 100.0 / totalAlumnos) + "%");
        System.out.println("   Viudos: " + (viudos * 100.0 / totalAlumnos) + "%");

        System.out.println("e) Alumnos por especialidad:");
        System.out.println("   Sistemas: " + contSistemas + " (" +
                (contSistemas * 100.0 / totalAlumnos) + "%)");
        System.out.println("   Electrónica: " + contElectronica + " (" +
                (contElectronica * 100.0 / totalAlumnos) + "%)");
        System.out.println("   Mecánica: " + contMecanica + " (" +
                (contMecanica * 100.0 / totalAlumnos) + "%)");
        System.out.println("   Civil: " + contCivil + " (" +
                (contCivil * 100.0 / totalAlumnos) + "%)");
        if (contMujeres > 0) {
            System.out.println("f) Mujeres adultas: " +
                    (mujeresAdultas * 100.0 / contMujeres) + "%");
        }

        if (contHombres > 0) {
            System.out.println("g) Hombres jóvenes: " +
                    (hombresJovenes * 100.0 / contHombres) + "%");
        }

        System.out.println("h) Hombres solteros: " + contSolterosHombres);
        System.out.println("   Mujeres solteras: " + contSolterasMujeres);

        entrada.close();
    }
}
