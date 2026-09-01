import java.util.Scanner;
public class Treintaiseisavoejercicio {
    public static void main(String[] args) {

        int totalCiudades = 0;
        int totalUnidadesCiudad = 0;
        double montoTotalCiudad = 0;
        double comisionTienda = 0;
        double comisionCalle = 0;
        double mayorMontoNeto = 0;
        double montoNetoCanal;
        int canalMayorMonto = 0;
        int menorUnidades = 999999;
        int vendedorMenorUnidades = 0;
        int codigoEstado;
        int codigoCiudad;
        int unidadesEsperadas;
        int numVendedores;
        int codigoCanal;
        int vendedor;
        int codigoVendedor;
        int unidadesVendidas;
        double montoVendido;
        int numCanales;
        int canal;

        Scanner entrada = new Scanner(System.in);

        System.out.println("SISTEMA DE VENTAS - EQUIPOS DE COMPUTACIÓN");
        System.out.println("Para terminar, ingrese 0 como código de estado\n");

        do {
            System.out.print("Código de estado (0 para terminar): ");
            codigoEstado = entrada.nextInt();

            if (codigoEstado == 0) {
                break;
            }

            System.out.print("Nombre del estado: ");
            String nombreEstado = entrada.next();

            System.out.print("Código de ciudad: ");
            codigoCiudad = entrada.nextInt();

            System.out.print("Nombre de la ciudad: ");
            String nombreCiudad = entrada.next();

            System.out.print("Unidades esperadas: ");
             unidadesEsperadas = entrada.nextInt();

            System.out.print("Número de canales de comercialización: ");
             numCanales = entrada.nextInt();


             canal = 1;
            do {
                System.out.println("\n--- CANAL #" + canal + " ---");
                System.out.print("Código del canal: ");
                codigoCanal = entrada.nextInt();

                System.out.print("Número de vendedores: ");
                 numVendedores = entrada.nextInt();

                 vendedor = 1;
                do {
                    System.out.print("Código del vendedor " + vendedor + ": ");
                     codigoVendedor = entrada.nextInt();

                    System.out.print("Total de unidades vendidas: ");
                     unidadesVendidas = entrada.nextInt();

                    System.out.print("Monto total vendido: $");
                     montoVendido = entrada.nextDouble();

                    totalUnidadesCiudad = totalUnidadesCiudad + unidadesVendidas;
                    montoTotalCiudad = montoTotalCiudad + montoVendido;

                    int tipoVendedor = codigoVendedor / 1000;  // Primeros dos dígitos

                    if (tipoVendedor == 11) {

                        comisionTienda = comisionTienda + (montoVendido * 0.10);
                    } else if (tipoVendedor == 12) {

                        comisionCalle = comisionCalle + (montoVendido * 0.15);
                    }

                    if (unidadesVendidas < menorUnidades) {
                        menorUnidades = unidadesVendidas;
                        vendedorMenorUnidades = codigoVendedor;
                    }

                    vendedor = vendedor + 1;
                } while (vendedor <= numVendedores);

                 montoNetoCanal = montoTotalCiudad - comisionTienda - comisionCalle;

                if (montoNetoCanal > mayorMontoNeto) {
                    mayorMontoNeto = montoNetoCanal;
                    canalMayorMonto = codigoCanal;
                }

                canal = canal + 1;
            } while (canal <= numCanales);

            totalCiudades = totalCiudades + 1;

            System.out.println("\n=== RESUMEN DE CIUDAD ===");
            System.out.println("Código: " + codigoCiudad);
            System.out.println("Nombre: " + nombreCiudad);
            System.out.println("Total unidades vendidas: " + totalUnidadesCiudad);
            System.out.println("Monto total bruto: $" + montoTotalCiudad);
            System.out.println("Comisión tienda: $" + comisionTienda);
            System.out.println("Comisión calle: $" + comisionCalle);
            System.out.println("Canal con mayor monto neto: " + canalMayorMonto);
            System.out.println("Vendedor con menor unidades: " + vendedorMenorUnidades);

            if (totalUnidadesCiudad >= unidadesEsperadas) {
                System.out.println("Alcanzó la meta de unidades");
            } else {
                System.out.println("NO alcanzó la meta de unidades");
            }

        } while (true);

        System.out.println("\nProceso finalizado");
        entrada.close();
    }
}
