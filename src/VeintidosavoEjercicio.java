import java.util.Scanner;
public class VeintidosavoEjercicio {
    public static void main(String[] args) {
        double deuda = 12775;
        double pago = 100;
        double diferencia = 125;
        int numeroPago = 1;
        double deudaPendiente = deuda;
        Scanner entrada = new Scanner(System.in);

        System.out.println("TABLA DE PAGOS");
        System.out.println("Pago #\tMonto\t\tPendiente");
        System.out.println("-----------------------------------");

        do {
            deudaPendiente = deudaPendiente - pago;

            System.out.println(numeroPago + "\t$" + pago + "\t\t$" + deudaPendiente);

            if (deudaPendiente <= 0) {
                break;
            }

            numeroPago = numeroPago + 1;
            pago = pago + diferencia;

        } while (deudaPendiente > 0);

        System.out.println("\nNúmero de pagos: " + numeroPago);
        System.out.println("Monto del último pago: $" + pago);
        System.out.println("Respuesta esperada: 14 pagos, último pago = $1725");
    entrada.close();
    }
}
