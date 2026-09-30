import java.util.Scanner;

public class Ejercicio49 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int persona = 1;
        int p1, p2, p3;
        int tres = 0;
        int primeraSegunda = 0;
        int primeraTercera = 0;
        int segundaTercera = 0;
        int primera = 0;
        int segunda = 0;
        int tercera = 0;
        int ninguna = 0;

        while (persona <= 100) {

            System.out.println("Persona " + persona);

            System.out.print("Pregunta 1 (1 correcta, 0 incorrecta): ");
            p1 = entrada.nextInt();

            System.out.print("Pregunta 2 (1 correcta, 0 incorrecta): ");
            p2 = entrada.nextInt();

            System.out.print("Pregunta 3 (1 correcta, 0 incorrecta): ");
            p3 = entrada.nextInt();

            if (p1 == 1 && p2 == 1 && p3 == 1) {
                tres++;
            }

            if (p1 == 1 && p2 == 1 && p3 == 0) {
                primeraSegunda++;
            }

            if (p1 == 1 && p2 == 0 && p3 == 1) {
                primeraTercera++;
            }

            if (p1 == 0 && p2 == 1 && p3 == 1) {
                segundaTercera++;
            }

            if (p1 == 1) {
                primera++;
            }

            if (p2 == 1) {
                segunda++;
            }

            if (p3 == 1) {
                tercera++;
            }

            if (p1 == 0 && p2 == 0 && p3 == 0) {
                ninguna++;
            }

            persona++;
        }

        System.out.println("Tres preguntas correctas: " + tres);
        System.out.println("Primera y segunda solamente: " + primeraSegunda);
        System.out.println("Primera y tercera solamente: " + primeraTercera);
        System.out.println("Segunda y tercera solamente: " + segundaTercera);
        System.out.println("Primera pregunta por lo menos: " + primera);
        System.out.println("Segunda pregunta por lo menos: " + segunda);
        System.out.println("Tercera pregunta por lo menos: " + tercera);
        System.out.println("Ninguna correcta: " + ninguna);

        entrada.close();
    }
}