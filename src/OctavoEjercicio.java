import java.util.Scanner;
public class OctavoEjercicio {
    public static void main (String[] args){

        int M;
        Scanner entrada =new Scanner(System.in);

        System.out.print("Cantidad de empleados: ");
        M = entrada.nextInt();

        int empleado = 1;

        int venezolanos1 = 0;
        int venezolanos2 = 0;
        int venezolanos3 = 0;

        int extranjerosImpares = 0;

        int sumaEdades = 0;
        double totalSueldos = 0;

        do {

            entrada.nextLine();

            System.out.println("\nEmpleado " + empleado);

            System.out.print("Nombre: ");
            String nombre = entrada.nextLine();

            System.out.print("Nacionalidad (V/E): ");
            char nacionalidad = entrada.next().toUpperCase().charAt(0);

            System.out.print("Edad: ");
            int edad = entrada.nextInt();

            System.out.print("Tipo de empleado (1, 2, 3): ");
            int tipo = entrada.nextInt();

            System.out.print("Horas trabajadas: ");
            double horas = entrada.nextDouble();

            double pagoHora = 0;

            if (tipo == 1) {
                pagoHora = 5000;
            } else if (tipo == 2) {
                pagoHora = 10000;
            } else if (tipo == 3) {
                pagoHora = 15000;
            }

            double sueldo = horas * pagoHora;

            double seguro = 0;

            if (sueldo > 100000) {
                seguro = sueldo * 0.03;
            }

            double neto = sueldo - seguro;

            System.out.println("\nNombre: " + nombre);
            System.out.println("Sueldo bruto: " + sueldo);
            System.out.println("Seguro Social: " + seguro);
            System.out.println("Sueldo neto: " + neto);

            if (nacionalidad == 'V') {

                if (tipo == 1)
                    venezolanos1++;
                else if (tipo == 2)
                    venezolanos2++;
                else if (tipo == 3)
                    venezolanos3++;

            } else {

                if (edad % 2 != 0)
                    extranjerosImpares++;
            }

            sumaEdades += edad;
            totalSueldos += sueldo;

            empleado++;

        } while (empleado <= M);

        System.out.println("\n--- ESTADISTICAS ---");

        System.out.println("Venezolanos tipo 1: " + venezolanos1);
        System.out.println("Venezolanos tipo 2: " + venezolanos2);
        System.out.println("Venezolanos tipo 3: " + venezolanos3);

        System.out.println(
                "Extranjeros con edad impar: "
                        + extranjerosImpares
        );

        System.out.println(
                "Promedio de edad: "
                        + (double) sumaEdades / M
        );

        System.out.println(
                "Total general en sueldos: "
                        + totalSueldos
        );

        entrada.close();
    }
}
