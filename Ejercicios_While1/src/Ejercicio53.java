import java.util.Scanner;

public class Ejercicio53 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int M;
        int contador = 1;
        String nombre;
        char nacionalidad;
        int edad;
        int tipo;
        int horas;
        double sueldoHora;
        double sueldoBasico;
        double seguroSocial;
        double total;
        int venezolanos1 = 0;
        int venezolanos2 = 0;
        int venezolanos3 = 0;
        int extranjerosEdadImpar = 0;
        int sumaEdades = 0;
        double totalSueldos = 0;

        System.out.print("Cantidad de empleados: ");
        M = entrada.nextInt();

        while (contador <= M) {

            entrada.nextLine();

            System.out.print("Nombre: ");
            nombre = entrada.nextLine();

            System.out.print("Nacionalidad (V/E): ");
            nacionalidad = entrada.next().toUpperCase().charAt(0);

            System.out.print("Edad: ");
            edad = entrada.nextInt();

            System.out.print("Tipo de empleado (1, 2, 3): ");
            tipo = entrada.nextInt();

            System.out.print("Horas trabajadas: ");
            horas = entrada.nextInt();

            sueldoHora = 0;

            if (tipo == 1) {
                sueldoHora = 5000;
            }

            if (tipo == 2) {
                sueldoHora = 10000;
            }

            if (tipo == 3) {
                sueldoHora = 15000;
            }

            sueldoBasico = sueldoHora * horas;

            seguroSocial = 0;

            if (sueldoBasico > 100000) {
                seguroSocial = sueldoBasico * 0.03;
            }

            total = sueldoBasico - seguroSocial;

            System.out.println("Nombre: " + nombre);
            System.out.println("Sueldo basico: " + sueldoBasico);
            System.out.println("Seguro social: " + seguroSocial);
            System.out.println("Total: " + total);

            if (nacionalidad == 'V' && tipo == 1) {
                venezolanos1++;
            }

            if (nacionalidad == 'V' && tipo == 2) {
                venezolanos2++;
            }

            if (nacionalidad == 'V' && tipo == 3) {
                venezolanos3++;
            }

            if (nacionalidad == 'E' && edad % 2 != 0) {
                extranjerosEdadImpar++;
            }

            sumaEdades += edad;
            totalSueldos += total;

            contador++;
        }

        System.out.println("Venezolanos tipo 1: " + venezolanos1);
        System.out.println("Venezolanos tipo 2: " + venezolanos2);
        System.out.println("Venezolanos tipo 3: " + venezolanos3);
        System.out.println("Extranjeros con edad impar: " + extranjerosEdadImpar);
        System.out.println("Promedio de edad: " + (double) sumaEdades / M);
        System.out.println("Total general a pagar: " + totalSueldos);

        entrada.close();
    }
}
