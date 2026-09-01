import java.util.Scanner;
public class QuinceavoEjercicio {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int factura = 1;

        System.out.println("Ingrese '0' como número de factura para terminar\n");

        do {
            System.out.println("\nfactura" + factura + " ===");
            System.out.print("Número de factura (0 para terminar): ");
            int numFactura = entrada.nextInt();

            if (numFactura == 0) {
                break;
            }

            System.out.print("Nombre del cliente: ");
            String nombreCliente = entrada.next();

            System.out.print("Monto de la factura: $");
            double montoFactura = entrada.nextDouble();

            System.out.print("Fecha de compra (días): ");
            int fechaCompra = entrada.nextInt();

            System.out.print("Fecha de pago (días): ");
            int fechaPago = entrada.nextInt();

            int diasTranscurridos = fechaPago - fechaCompra;

            double montoInteres = 0;
            double montoDescuento = 0;
            double montoFinal = montoFactura;

            if (diasTranscurridos >= 60) {

                montoInteres = montoFactura * 0.08;
                montoFinal = montoFactura + montoInteres;
            } else if (diasTranscurridos >= 31 && diasTranscurridos <= 59) {

                montoInteres = montoFactura * 0.06;
                montoFinal = montoFactura + montoInteres;
            } else if (diasTranscurridos < 15) {

                montoDescuento = montoFactura * 0.02;
                montoFinal = montoFactura - montoDescuento;
            }


            System.out.println("Número de factura: " + numFactura);
            System.out.println("Nombre del cliente: " + nombreCliente);
            System.out.println("Monto de la factura: $" + montoFactura);
            System.out.println("Días transcurridos: " + diasTranscurridos);
            System.out.println("Monto por interés de mora: $" + montoInteres);
            System.out.println("Monto descontado por pronto pago: $" + montoDescuento);
            System.out.println("Monto total a cancelar: $" + montoFinal);

            factura = factura + 1;
        } while (true);

        entrada.close();

    }
}
