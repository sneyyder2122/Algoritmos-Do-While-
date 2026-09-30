import java.util.Scanner;

public class Ejercicio63 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int edad;
        int estado;
        int especialidad;
        char sexo;
        int continuar = 1;
        int total = 0;
        int hombres = 0;
        int mujeres = 0;
        int sumaHombres = 0;
        int sumaMujeres = 0;
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
        while (continuar == 1) {

            System.out.print("Edad: ");
            edad = entrada.nextInt();

            System.out.print("Sexo (M/F): ");
            sexo = entrada.next().toUpperCase().charAt(0);

            System.out.print("Estado civil (1-4): ");
            estado = entrada.nextInt();

            System.out.print("Especialidad (1-5): ");
            especialidad = entrada.nextInt();

            total++;

            if (sexo == 'M') {

                hombres++;
                sumaHombres += edad;

                if (edad > 17 && edad < 21) {
                    hombresJovenes++;
                }

                if (estado == 1) {
                    hombresSolteros++;
                }
            }

            if (sexo == 'F') {

                mujeres++;
                sumaMujeres += edad;

                if (edad > 21) {
                    mujeresAdultas++;
                }

                if (estado == 1) {
                    mujeresSolteras++;
                }
            }

            if (estado == 1) {
                solteros++;
            }

            if (estado == 2) {
                casados++;
            }

            if (estado == 3) {
                divorciados++;
            }

            if (estado == 4) {
                viudos++;
            }

            if (especialidad == 1) esp1++;
            if (especialidad == 2) esp2++;
            if (especialidad == 3) esp3++;
            if (especialidad == 4) esp4++;
            if (especialidad == 5) esp5++;

            System.out.print("¿Otro alumno? 1=Si 0=No: ");
            continuar = entrada.nextInt();
        }

        if (mujeres > 0) {
            System.out.println("Promedio mujeres: "
                    + (double) sumaMujeres / mujeres);
        }

        if (hombres > 0) {
            System.out.println("Promedio hombres: "
                    + (double) sumaHombres / hombres);
        }

        System.out.println("Hombres: " + hombres);
        System.out.println("Mujeres: " + mujeres);

        System.out.println("Solteros: " + solteros * 100.0 / total + "%");
        System.out.println("Casados: " + casados * 100.0 / total + "%");
        System.out.println("Divorciados: " + divorciados * 100.0 / total + "%");
        System.out.println("Viudos: " + viudos * 100.0 / total + "%");

        System.out.println("Especialidad 1: " + esp1);
        System.out.println("Especialidad 2: " + esp2);
        System.out.println("Especialidad 3: " + esp3);
        System.out.println("Especialidad 4: " + esp4);
        System.out.println("Especialidad 5: " + esp5);

        if (mujeres > 0) {
            System.out.println("Mujeres adultas: "
                    + mujeresAdultas * 100.0 / mujeres + "%");
        }

        if (hombres > 0) {
            System.out.println("Hombres jovenes: "
                    + hombresJovenes * 100.0 / hombres + "%");
        }

        System.out.println("Hombres solteros: " + hombresSolteros);
        System.out.println("Mujeres solteras: " + mujeresSolteras);

        entrada.close();
    }
}