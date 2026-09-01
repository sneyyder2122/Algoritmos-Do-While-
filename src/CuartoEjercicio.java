import java.util.Scanner;

public class CuartoEjercicio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int persona = 1;

        int tres = 0;
        int primeraSegunda = 0;
        int primeraTercera = 0;
        int segundaTercera = 0;
        int primera = 0;
        int segunda = 0;
        int tercera = 0;
        int ninguna = 0;

        do {

            System.out.println("\nPersona " + persona);

            System.out.print("Pregunta 1 correcta (1=Si, 0=No): ");
            int p1 = sc.nextInt();

            System.out.print("Pregunta 2 correcta (1=Si, 0=No): ");
            int p2 = sc.nextInt();

            System.out.print("Pregunta 3 correcta (1=Si, 0=No): ");
            int p3 = sc.nextInt();

            if (p1 == 1 && p2 == 1 && p3 == 1)
                tres++;

            if (p1 == 1 && p2 == 1)
                primeraSegunda++;

            if (p1 == 1 && p3 == 1)
                primeraTercera++;

            if (p2 == 1 && p3 == 1)
                segundaTercera++;

            if (p1 == 1)
                primera++;

            if (p2 == 1)
                segunda++;

            if (p3 == 1)
                tercera++;

            if (p1 == 0 && p2 == 0 && p3 == 0)
                ninguna++;

            persona++;

        } while (persona <= 100);

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Las tres correctas: " + tres);
        System.out.println("Primera y segunda: " + primeraSegunda);
        System.out.println("Primera y tercera: " + primeraTercera);
        System.out.println("Segunda y tercera: " + segundaTercera);
        System.out.println("Primera por lo menos: " + primera);
        System.out.println("Segunda por lo menos: " + segunda);
        System.out.println("Tercera por lo menos: " + tercera);
        System.out.println("Ninguna correcta: " + ninguna);

        sc.close();
    }

}