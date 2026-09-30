import java.util.Scanner;
public class Ejercicio65 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int cantidad;
        int empleado = 1;

        String nombre;
        String cedula;

        int tipo;
        int hijos;
        int diasAsistidos;

        double sueldoBasico;
        double aporteHijos;
        double aporteAsistencia;
        double caja;
        double seguro;
        double sueldoNeto;

        System.out.print("Cantidad de empleados: ");
        cantidad = entrada.nextInt();

        while (empleado <= cantidad) {

            entrada.nextLine();

            System.out.print("Nombre: ");
            nombre = entrada.nextLine();

            System.out.print("Cedula: ");
            cedula = entrada.nextLine();

            System.out.print("Tipo (1 Obrero, 2 Administrativo, 3 Ejecutivo): ");
            tipo = entrada.nextInt();

            System.out.print("Cantidad de hijos: ");
            hijos = entrada.nextInt();

            System.out.print("Dias asistidos: ");
            diasAsistidos = entrada.nextInt();

            sueldoBasico = 0;

            if (tipo == 1) {
                sueldoBasico = 100000;
            }

            if (tipo == 2) {
                sueldoBasico = 165500;
            }

            if (tipo == 3) {
                sueldoBasico = 250000;
            }

            if (hijos > 5) {
                hijos = 5;
            }

            aporteHijos = sueldoBasico * 0.10 * hijos;

            aporteAsistencia = 0;

            if (diasAsistidos > 28) {
                aporteAsistencia = sueldoBasico * 0.05;
            }

            caja = sueldoBasico * 0.10;
            seguro = sueldoBasico * 0.02;

            sueldoNeto = sueldoBasico
                    + aporteHijos
                    + aporteAsistencia
                    - caja
                    - seguro;

            System.out.println("\nNombre: " + nombre);
            System.out.println("Cedula: " + cedula);
            System.out.println("Sueldo basico: " + sueldoBasico);
            System.out.println("Caja de ahorros: " + caja);
            System.out.println("Seguro social: " + seguro);
            System.out.println("Sueldo neto: " + sueldoNeto);

            empleado++;
        }

        entrada.close();
    }
}