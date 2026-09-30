public class Ejercicio67 {
    public static void main(String[] args) {

        double deuda = 12775;
        double pago = 100;
        double aumento = 125;
        int cantidad = 0;

        System.out.println("Pago\tMonto\tPendiente");

        while (deuda > 0) {

            deuda -= pago;

            if (deuda < 0) {
                deuda = 0;
            }

            cantidad++;

            System.out.println(cantidad + "\t" + pago + "\t" + deuda);

            pago += aumento;
        }

        System.out.println("Numero de pagos: " + cantidad);
        System.out.println("Ultimo pago: " + (pago - aumento));
    }
}
