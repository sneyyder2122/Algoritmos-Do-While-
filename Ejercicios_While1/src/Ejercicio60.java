import java.util.Scanner;

public class Ejercicio60 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int continuar = 1;

        while (continuar == 1) {

            System.out.print("Numero de factura: ");
            int numeroFactura = entrada.nextInt();

            entrada.nextLine();

            System.out.print("Nombre del cliente: ");
            String nombre = entrada.nextLine();

            System.out.print("Monto de la factura: ");
            double monto = entrada.nextDouble();

            System.out.println("Fecha de compra");
            System.out.print("Dia: ");
            int diaCompra = entrada.nextInt();
            System.out.print("Mes: ");
            int mesCompra = entrada.nextInt();
            System.out.print("Año: ");
            int anioCompra = entrada.nextInt();

            System.out.println("Fecha de pago");
            System.out.print("Dia: ");
            int diaPago = entrada.nextInt();
            System.out.print("Mes: ");
            int mesPago = entrada.nextInt();
            System.out.print("Año: ");
            int anioPago = entrada.nextInt();

            int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            int diasCompra = 0;
            int anio = 1;

            while (anio < anioCompra) {
                diasCompra = diasCompra + 365;
                anio++;
            }

            int bisiestosCompra = (anioCompra - 1) / 4
                    - (anioCompra - 1) / 100
                    + (anioCompra - 1) / 400;

            diasCompra = diasCompra + bisiestosCompra;

            int mes = 1;

            while (mes < mesCompra) {
                diasCompra = diasCompra + diasMes[mes - 1];
                mes++;
            }

            int bisiesto = anioCompra / 4
                    - anioCompra / 100
                    + anioCompra / 400;

            int ajuste = 0;
            int mesTemporal = mesCompra;

            while (mesTemporal > 2) {
                ajuste = bisiesto;
                mesTemporal = 2;
            }

            diasCompra = diasCompra + diaCompra + ajuste;

            int diasPago = 0;
            anio = 1;

            while (anio < anioPago) {
                diasPago = diasPago + 365;
                anio++;
            }

            int bisiestosPago = (anioPago - 1) / 4
                    - (anioPago - 1) / 100
                    + (anioPago - 1) / 400;

            diasPago = diasPago + bisiestosPago;

            mes = 1;

            while (mes < mesPago) {
                diasPago = diasPago + diasMes[mes - 1];
                mes++;
            }

            bisiesto = anioPago / 4
                    - anioPago / 100
                    + anioPago / 400;

            ajuste = 0;
            mesTemporal = mesPago;

            while (mesTemporal > 2) {
                ajuste = bisiesto;
                mesTemporal = 2;
            }

            diasPago = diasPago + diaPago + ajuste;

            int dias = diasPago - diasCompra;

            double interes = 0;
            double descuento = 0;

            int caso = 0;

            while (dias >= 60 && caso == 0) {
                interes = monto * 0.08;
                caso = 1;
            }

            while (dias >= 31 && dias <= 59 && caso == 0) {
                interes = monto * 0.06;
                caso = 1;
            }

            while (dias < 15 && caso == 0) {
                descuento = monto * 0.02;
                caso = 1;
            }

            double total = monto + interes - descuento;

            System.out.println();
            System.out.println("Numero de factura: " + numeroFactura);
            System.out.println("Cliente: " + nombre);
            System.out.println("Monto de factura: " + monto);
            System.out.println("Dias transcurridos: " + dias);
            System.out.println("Interes de mora: " + interes);
            System.out.println("Descuento: " + descuento);
            System.out.println("Monto a cancelar: " + total);

            System.out.print("Desea ingresar otra factura? 1=Si 0=No: ");
            continuar = entrada.nextInt();
        }

        entrada.close();
    }
}