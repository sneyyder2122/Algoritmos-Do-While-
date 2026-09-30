import java.util.Scanner;

public class Ejercicio71 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int continuar = 1;
        String estado;
        char sexo;
        double edad;
        int total = 0;
        int tachira = 0;
        int distrito = 0;
        int grupo1 = 0;
        int grupo2 = 0;
        int grupo3 = 0;
        int grupo4 = 0;
        int ninos = 0;
        int ninas = 0;

        while (continuar == 1) {

            System.out.print("Sexo (M/F): ");
            sexo = entrada.next().toUpperCase().charAt(0);

            System.out.print("Edad: ");
            edad = entrada.nextDouble();

            entrada.nextLine();

            System.out.print("Estado: ");
            estado = entrada.nextLine();

            total++;

            if (estado.equalsIgnoreCase("Tachira")) {
                tachira++;
            }

            if (estado.equalsIgnoreCase("Distrito Capital")) {
                distrito++;
            }

            if (edad < 1) {
                grupo1++;
            }

            if (edad >= 1 && edad <= 3) {
                grupo2++;
            }

            if (edad >= 4 && edad <= 6) {
                grupo3++;
            }

            if (edad > 6) {
                grupo4++;
            }

            if (sexo == 'M') {
                ninos++;
            }

            if (sexo == 'F') {
                ninas++;
            }

            System.out.print("¿Otro niño? 1=Si 0=No: ");
            continuar = entrada.nextInt();
        }

        System.out.println("Tachira: " + tachira * 100.0 / total + "%");
        System.out.println("Distrito Capital: " + distrito * 100.0 / total + "%");

        System.out.println("Grupo 1: " + grupo1);
        System.out.println("Grupo 2: " + grupo2);
        System.out.println("Grupo 3: " + grupo3);
        System.out.println("Grupo 4: " + grupo4);

        System.out.println("Ninos: " + ninos + " - " + ninos * 100.0 / total + "%");

        System.out.println("Ninas: " + ninas + " - " + ninas * 100.0 / total + "%");

        entrada.close();
    }
}