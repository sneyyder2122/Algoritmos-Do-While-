import java.util.Scanner;
public class VeintiochoavoEjercicio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("SISTEMA DE CONTROL DE PAGARÉS");
        System.out.println("Para terminar, ingrese 0 como código de estado\n");

        do {
            System.out.print("Código de estado (0 para terminar): ");
            int codigoEstado = entrada.nextInt();

            if (codigoEstado == 0) {
                break;
            }

            System.out.print("Código de agencia: ");
            int codigoAgencia = entrada.nextInt();

            System.out.print("Código de cliente: ");
            int codigoCliente = entrada.nextInt();

            System.out.print("Nombre del cliente: ");
            String nombreCliente = entrada.next();

            System.out.print("Dirección: ");
            String direccion = entrada.next();

            // Procesamos los pagarés del cliente
            int numPagares = 0;
            double montoTotalPendiente = 0;

            System.out.println("\n--- PAGARÉS DEL CLIENTE ---");
            System.out.print("¿Cuántos pagarés tiene? ");
            int totalPagares = entrada.nextInt();

            int pagare = 1;
            do {
                System.out.print("Número de pagaré: ");
                int numPagare = entrada.nextInt();

                System.out.print("Fecha de vencimiento (días): ");
                int fechaVencimiento = entrada.nextInt();

                System.out.print("Monto del pagaré: $");
                double montoPagare = entrada.nextDouble();

                numPagares = numPagares + 1;
                montoTotalPendiente = montoTotalPendiente + montoPagare;

                pagare = pagare + 1;
            } while (pagare <= totalPagares);

            // Imprimimos el recibo
            System.out.println("Cliente: " + codigoCliente);
            System.out.println("Nombre: " + nombreCliente);
            System.out.println("Dirección: " + direccion);
            System.out.println("Estado: " + codigoEstado);
            System.out.println("Agencia: " + codigoAgencia);
            System.out.println("\nDetalle de pagarés:");
            System.out.println("Cantidad de pagarés: " + numPagares);
            System.out.println("Monto total pendiente: $" + montoTotalPendiente);
            System.out.println("===================\n");

        } while (true);

        System.out.println("Proceso finalizado");
        entrada.close();

    }
}
