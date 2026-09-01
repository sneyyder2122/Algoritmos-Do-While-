import java.util.Scanner;
public class TreintaicincoavoEjercicio {
    public static void main(String[] args) {

        int totalPersonas = 0;
        int personasDesempleadasSinEducacion = 0;
        int profesionalesDesempleados = 0;
        int totalProfesionales = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Para terminar, ingrese 0 como estado\n");

        do {
            System.out.print("estado (0 para terminar): ");
            int codigoEstado = entrada.nextInt();

            if (codigoEstado == 0) {
                break;
            }

            System.out.print("Código de ciudad: ");
            int codigoCiudad = entrada.nextInt();

            System.out.print("Código de municipio: ");
            int codigoMunicipio = entrada.nextInt();

            System.out.print("Edad: ");
            int edad = entrada.nextInt();

            if (edad < 18) {
                System.out.println("Error: Debe ser mayor de 18 años");
                continue;
            }

            System.out.print("Nivel de educación (N/B/S/P): ");
            char nivelEducacion = entrada.next().charAt(0);

            System.out.print("Situación actual (D/E): ");
            char situacion = entrada.next().charAt(0);

            totalPersonas = totalPersonas + 1;

            if (situacion == 'D' && nivelEducacion == 'N' && edad > 25) {
                personasDesempleadasSinEducacion = personasDesempleadasSinEducacion + 1;
            }


            if (nivelEducacion == 'P') {
                totalProfesionales = totalProfesionales + 1;
                if (situacion == 'D') {
                    profesionalesDesempleados = profesionalesDesempleados + 1;
                }
            }


            System.out.println("Registrado: Estado " + codigoEstado +
                    ", Ciudad " + codigoCiudad +
                    ", Municipio " + codigoMunicipio);

        } while (true);


        System.out.println("\n RESULTADOS ");
        System.out.println("Personas desempleadas sin educación mayores de 25: " +
                personasDesempleadasSinEducacion);

        if (totalProfesionales > 0) {
            double porcentajeProfDesempleados =
                    (profesionalesDesempleados * 100.0) / totalProfesionales;
            System.out.println("Porcentaje de profesionales desempleados: " +
                    porcentajeProfDesempleados + "%");
        }

        System.out.println("Total de personas registradas: " + totalPersonas);

        entrada.close();
    }
}
