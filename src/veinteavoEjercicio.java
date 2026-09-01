import java.util.Scanner;
public class veinteavoEjercicio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.println("Para terminar, ingrese 'fin' como nombre\n");

        String nombre;
        do {
            System.out.print("Nombre del trabajador (o 'fin'): ");
            nombre = entrada.next();

            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }

            System.out.print("Cédula: ");
            String cedula = entrada.next();

            System.out.print("Tipo de trabajador (1=Obrero, 2=Administrativo, 3=Ejecutivo): ");
            int tipo = entrada.nextInt();

            System.out.print("Número de hijos: ");
            int hijos = entrada.nextInt();

            System.out.print("Días asistidos (de 30): ");
            int diasAsistidos = entrada.nextInt();

            double sueldoBasico = 0;
            if (tipo == 1) {
                sueldoBasico = 100000;
            } else if (tipo == 2) {
                sueldoBasico = 165500;
            } else if (tipo == 3) {
                sueldoBasico = 250000;
            }

            double aporteHijos = 0;
            if (hijos > 0) {
                int hijosConsiderados = hijos;
                if (hijos > 5) {
                    hijosConsiderados = 5;
                }
                aporteHijos = sueldoBasico * 0.10 * hijosConsiderados;
            }

            double aporteAsistencia = 0;
            if (diasAsistidos > 28.5) {
                aporteAsistencia = sueldoBasico * 0.05;
            }


            double cajaAhorros = sueldoBasico * 0.10;
            double seguroSocial = sueldoBasico * 0.02;

            double sueldoNeto = sueldoBasico + aporteHijos + aporteAsistencia -
                    cajaAhorros - seguroSocial;

            System.out.println("\n--- REGISTRO DEL EMPLEADO ---");
            System.out.println("Nombre: " + nombre);
            System.out.println("Cédula: " + cedula);
            System.out.println("Sueldo básico: $" + sueldoBasico);
            System.out.println("Aporte por hijos: $" + aporteHijos);
            System.out.println("Aporte por asistencia: $" + aporteAsistencia);
            System.out.println("Caja de ahorros: -$" + cajaAhorros);
            System.out.println("Seguro social: -$" + seguroSocial);
            System.out.println("Sueldo neto: $" + sueldoNeto);
            System.out.println();

        } while (true);

        entrada.close();
    }
}
