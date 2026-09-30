import java.util.Scanner;

public class Ejercicio52 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int alumno = 1;
        int edad;
        int especialidad;
        int estadoCivil;
        char sexo;
        int hombres = 0;
        int mujeres = 0;
        int sumaEdadHombres = 0;
        int sumaEdadMujeres = 0;
        int solteros = 0;
        int casados = 0;
        int divorciados = 0;
        int viudos = 0;
        int esp1 = 0;
        int esp2 = 0;
        int esp3 = 0;
        int esp4 = 0;
        int esp5 = 0;

        int mujeresAdultas = 0;
        int hombresJovenes = 0;

        int hombresSolteros = 0;
        int mujeresSolteras = 0;

        while (alumno <= 100) {

            System.out.println("Alumno " + alumno);

            System.out.print("Edad: ");
            edad = entrada.nextInt();

            System.out.print("Sexo (M/F): ");
            sexo = entrada.next().toUpperCase().charAt(0);

            System.out.print("Estado civil (1 Soltero, 2 Casado, 3 Divorciado, 4 Viudo): ");
            estadoCivil = entrada.nextInt();

            System.out.print("Especialidad (1 a 5): ");
            especialidad = entrada.nextInt();

            if (sexo == 'M') {
                hombres++;
                sumaEdadHombres += edad;

                if (edad > 17 && edad < 21) {
                    hombresJovenes++;
                }

                if (estadoCivil == 1) {
                    hombresSolteros++;
                }
            }

            if (sexo == 'F') {
                mujeres++;
                sumaEdadMujeres += edad;

                if (edad > 21) {
                    mujeresAdultas++;
                }

                if (estadoCivil == 1) {
                    mujeresSolteras++;
                }
            }

            if (estadoCivil == 1) {
                solteros++;
            }

            if (estadoCivil == 2) {
                casados++;
            }

            if (estadoCivil == 3) {
                divorciados++;
            }

            if (estadoCivil == 4) {
                viudos++;
            }

            if (especialidad == 1) {
                esp1++;
            }

            if (especialidad == 2) {
                esp2++;
            }

            if (especialidad == 3) {
                esp3++;
            }

            if (especialidad == 4) {
                esp4++;
            }

            if (especialidad == 5) {
                esp5++;
            }

            alumno++;
        }

        System.out.println();
        System.out.println("Promedio edad mujeres: " + (double) sumaEdadMujeres / mujeres);
        System.out.println("Promedio edad hombres: " + (double) sumaEdadHombres / hombres);

        System.out.println("Cantidad de hombres: " + hombres);
        System.out.println("Cantidad de mujeres: " + mujeres);

        System.out.println("Porcentaje solteros: " + (solteros * 100.0 / 100));
        System.out.println("Porcentaje casados: " + (casados * 100.0 / 100));
        System.out.println("Porcentaje divorciados: " + (divorciados * 100.0 / 100));
        System.out.println("Porcentaje viudos: " + (viudos * 100.0 / 100));

        System.out.println("Especialidad 1: " + esp1 + " - " + (esp1 * 100.0 / 100) + "%");
        System.out.println("Especialidad 2: " + esp2 + " - " + (esp2 * 100.0 / 100) + "%");
        System.out.println("Especialidad 3: " + esp3 + " - " + (esp3 * 100.0 / 100) + "%");
        System.out.println("Especialidad 4: " + esp4 + " - " + (esp4 * 100.0 / 100) + "%");
        System.out.println("Especialidad 5: " + esp5 + " - " + (esp5 * 100.0 / 100) + "%");

        System.out.println("Porcentaje de mujeres adultas: " + (mujeresAdultas * 100.0 / mujeres));
        System.out.println("Porcentaje de hombres jovenes: " + (hombresJovenes * 100.0 / hombres));

        System.out.println("Hombres solteros: " + hombresSolteros);
        System.out.println("Mujeres solteras: " + mujeresSolteras);

        entrada.close();
    }
}