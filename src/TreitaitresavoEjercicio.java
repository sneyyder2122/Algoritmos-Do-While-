import java.util.Scanner;
public class TreitaitresavoEjercicio {
    public static void main(String[] args) {

        int totalSucursales = 0;
        int sucursalesAlcanzaron = 0;
        double precioProducto1 = 100;
        double precioProducto2 = 150;
        double precioProducto3 = 200;
        Scanner entrada = new Scanner(System.in);

        System.out.println("SISTEMA DE VENTAS - EMPRESA CERÁMICA");
        System.out.println("Para terminar, ingrese 0 como código de sucursal\n");

        do {
            System.out.print("Código de sucursal (0 para terminar): ");
            int codigoSucursal = entrada.nextInt();

            if (codigoSucursal == 0) {
                break;
            }

            System.out.print("Descripción de sucursal: ");
            String descripcionSucursal = entrada.next();

            System.out.print("Monto de venta esperado: $");
            double montoEsperado = entrada.nextDouble();

            System.out.print("Número de puntos de venta: ");
            int numPuntosVenta = entrada.nextInt();

            double montoTotalSucursal = 0;
            double mayorComision = 0;
            int puntoMayorComision = 0;

            int punto = 1;
            do {
                System.out.println("\npunto de venta" + punto + " ---");
                System.out.print("Código del punto de venta: ");
                int codigoPunto = entrada.nextInt();

                System.out.print("Número de vendedores: ");
                int numVendedores = entrada.nextInt();

                System.out.print("Unidades vendidas producto 1: ");
                int unidadesP1 = entrada.nextInt();

                System.out.print("Unidades vendidas producto 2: ");
                int unidadesP2 = entrada.nextInt();

                System.out.print("Unidades vendidas producto 3: ");
                int unidadesP3 = entrada.nextInt();

                double ventaP1 = unidadesP1 * precioProducto1;
                double ventaP2 = unidadesP2 * precioProducto2;
                double ventaP3 = unidadesP3 * precioProducto3;
                double ventaBruta = ventaP1 + ventaP2 + ventaP3;

                double comision = ventaBruta * 0.10;
                double comisionPorVendedor = comision / numVendedores;

                montoTotalSucursal = montoTotalSucursal + ventaBruta;

                if (comision > mayorComision) {
                    mayorComision = comision;
                    puntoMayorComision = codigoPunto;
                }

                int menorUnidades = unidadesP1;
                int codigoMenorProducto = 1;
                if (unidadesP2 < menorUnidades) {
                    menorUnidades = unidadesP2;
                    codigoMenorProducto = 2;
                }
                if (unidadesP3 < menorUnidades) {
                    menorUnidades = unidadesP3;
                    codigoMenorProducto = 3;
                }

                System.out.println("Código: " + codigoPunto);
                System.out.println("Unidades vendidas: " + (unidadesP1 + unidadesP2 + unidadesP3));
                System.out.println("Monto neto: $" + ventaBruta);
                System.out.println("Comisión total: $" + comision);
                System.out.println("Comisión por vendedor: $" + comisionPorVendedor);
                System.out.println("Producto con menor venta: " + codigoMenorProducto);

                punto = punto + 1;
            } while (punto <= numPuntosVenta);

            totalSucursales = totalSucursales + 1;


            if (montoTotalSucursal >= montoEsperado) {
                sucursalesAlcanzaron = sucursalesAlcanzaron + 1;
            }
            double porcentajeAlcanzado = (montoTotalSucursal * 100.0) / montoEsperado;
            System.out.println("\n=== RESUMEN DE SUCURSAL ===");
            System.out.println("Código: " + codigoSucursal);
            System.out.println("Descripción: " + descripcionSucursal);
            System.out.println("Monto total vendido: $" + montoTotalSucursal);
            System.out.println("Porcentaje alcanzado: " + porcentajeAlcanzado + "%");
            System.out.println("Punto con mayor comisión: " + puntoMayorComision +
                    " ($" + mayorComision + ")");
            System.out.println();

        } while (true);


        System.out.println("\n=== RESULTADO GENERAL ===");
        if (totalSucursales > 0) {
            double porcentajeAlcanzaron = (sucursalesAlcanzaron * 100.0) / totalSucursales;
            System.out.println("Porcentaje de sucursales que alcanzaron la meta: " +
                    porcentajeAlcanzaron + "%");
        }

        entrada.close();
    }
}
