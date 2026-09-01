import java.util.Scanner;
public class VeintiseisavoEjercicio {
    public static void main(String[] args) {
        int totalNinos = 0;
        Scanner entrada = new Scanner(System.in);

        int contTachira = 0, contDistritoCapital = 0;
        int grupo1 = 0, grupo2 = 0, grupo3 = 0, grupo4 = 0;
        int contNinos = 0, contNinas = 0;
        System.out.println("SISTEMA DE INFORMACIÓN UNICEF");
        System.out.println("Para terminar, ingrese 'fin' como nombre\n");

        String nombre;
        do {
            System.out.print("Nombre del niño (o 'fin'): ");
            nombre = entrada.next();

            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }

            System.out.print("Sexo (M/F): ");
            char sexo = entrada.next().charAt(0);

            System.out.print("Edad: ");
            int edad = entrada.nextInt();

            System.out.print("Estado (Táchira/Distrito Capital/Otro): ");
            String estado = entrada.next();

            totalNinos = totalNinos + 1;

            if (estado.equalsIgnoreCase("Táchira")) {
                contTachira = contTachira + 1;
            } else if (estado.equalsIgnoreCase("Distrito") ||
                    estado.equalsIgnoreCase("Capital")) {
                contDistritoCapital = contDistritoCapital + 1;
            }

            if (edad < 1) {
                grupo1 = grupo1 + 1;
            } else if (edad >= 1 && edad <= 3) {
                grupo2 = grupo2 + 1;
            } else if (edad >= 4 && edad <= 6) {
                grupo3 = grupo3 + 1;
            } else {
                grupo4 = grupo4 + 1;
            }

            // Contamos por sexo
            if (sexo == 'M') {
                contNinos = contNinos + 1;
            } else if (sexo == 'F') {
                contNinas = contNinas + 1;
            }

        } while (true);

        System.out.println("\n=== RESULTADOS ===");

        if (totalNinos > 0) {
            double porcentajeTachira = (contTachira * 100.0) / totalNinos;
            double porcentajeCapital = (contDistritoCapital * 100.0) / totalNinos;
            System.out.println("a) Táchira: " + porcentajeTachira + "%");
            System.out.println("   Distrito Capital: " + porcentajeCapital + "%");


            System.out.println("b) Grupo 1 (menores de 1 año): " + grupo1);
            System.out.println("   Grupo 2 (1-3 años): " + grupo2);
            System.out.println("   Grupo 3 (4-6 años): " + grupo3);
            System.out.println("   Grupo 4 (mayores de 6): " + grupo4);


            System.out.println("c) Niños: " + contNinos + " (" +
                    (contNinos * 100.0 / totalNinos) + "%)");
            System.out.println("   Niñas: " + contNinas + " (" +
                    (contNinas * 100.0 / totalNinos) + "%)");
        } else {
            System.out.println("No se ingresaron datos");
        }

        entrada.close();
    }
}
