import java.util.Scanner;

public class Ejercicio81 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int estados;
        int estado = 1;

        int ciudades;
        int ciudad;

        int canales;
        int canal;

        int vendedores;
        int vendedor;

        int codigoEstado;
        int codigoCiudad;
        int codigoCanal;
        int codigoVendedor;

        String nombreEstado;
        String nombreCiudad;

        int unidades;
        double monto;
        double comision;

        int unidadesCiudad;
        double brutoCiudad;
        double comisionTienda;
        double comisionCalle;

        double mayorCanal;
        int canalMayor;

        int menorUnidades;
        int vendedorMenor;

        int ciudadesNoEsperadas;
        int ciudades40a60;

        double esperado;

        System.out.print("Cantidad de estados: ");
        estados = entrada.nextInt();

        while (estado <= estados) {

            System.out.print("\nCodigo del estado: ");
            codigoEstado = entrada.nextInt();

            entrada.nextLine();

            System.out.print("Nombre del estado: ");
            nombreEstado = entrada.nextLine();

            System.out.print("Cantidad de ciudades: ");
            ciudades = entrada.nextInt();

            ciudad = 1;
            ciudadesNoEsperadas = 0;
            ciudades40a60 = 0;

            while (ciudad <= ciudades) {

                System.out.print("\nCodigo ciudad: ");
                codigoCiudad = entrada.nextInt();

                entrada.nextLine();

                System.out.print("Nombre ciudad: ");
                nombreCiudad = entrada.nextLine();

                System.out.print("Unidades esperadas: ");
                esperado = entrada.nextDouble();

                System.out.print("Cantidad de canales: ");
                canales = entrada.nextInt();

                canal = 1;

                unidadesCiudad = 0;
                brutoCiudad = 0;
                comisionTienda = 0;
                comisionCalle = 0;

                mayorCanal = 0;
                canalMayor = 0;

                menorUnidades = 0;
                vendedorMenor = 0;

                while (canal <= canales) {

                    System.out.print("Codigo del canal: ");
                    codigoCanal = entrada.nextInt();

                    System.out.print("Cantidad de vendedores: ");
                    vendedores = entrada.nextInt();

                    vendedor = 1;
                    double ventaCanal = 0;

                    while (vendedor <= vendedores) {

                        System.out.print("Codigo vendedor: ");
                        codigoVendedor = entrada.nextInt();

                        System.out.print("Unidades vendidas: ");
                        unidades = entrada.nextInt();

                        System.out.print("Monto vendido: ");
                        monto = entrada.nextDouble();

                        comision = 0;

                        int tipoVendedor = codigoVendedor / 1000;

                        if (tipoVendedor == 11) {
                            comision = monto * 0.10;
                            comisionTienda += comision;
                        }

                        if (tipoVendedor == 12) {
                            comision = monto * 0.15;
                            comisionCalle += comision;
                        }

                        ventaCanal += monto;
                        unidadesCiudad += unidades;
                        brutoCiudad += monto;

                        if (vendedor == 1 && canal == 1) {
                            menorUnidades = unidades;
                            vendedorMenor = codigoVendedor;
                        }

                        if (unidades < menorUnidades) {
                            menorUnidades = unidades;
                            vendedorMenor = codigoVendedor;
                        }

                        vendedor++;
                    }

                    double netoCanal = ventaCanal;

                    if (netoCanal > mayorCanal) {
                        mayorCanal = netoCanal;
                        canalMayor = codigoCanal;
                    }

                    canal++;
                }

                double porcentajeEsperado =
                        unidadesCiudad * 100.0 / esperado;

                System.out.println("\nEstado: " + nombreEstado);
                System.out.println("Ciudad: " + nombreCiudad);
                System.out.println("Unidades vendidas: " + unidadesCiudad);
                System.out.println("Monto bruto: " + brutoCiudad);
                System.out.println("Comision tienda: " + comisionTienda);
                System.out.println("Comision calle: " + comisionCalle);
                System.out.println("Canal con mayor venta: " + canalMayor);
                System.out.println("Vendedor con menos unidades: "
                        + vendedorMenor);

                if (unidadesCiudad < esperado) {
                    ciudadesNoEsperadas++;
                }

                if (unidadesCiudad >= esperado * 1.40 &&
                        unidadesCiudad <= esperado * 1.60) {
                    ciudades40a60++;
                }

                ciudad++;
            }

            System.out.println("\nEstado: " + codigoEstado);
            System.out.println("Ciudades que no alcanzaron esperado: "
                    + ciudadesNoEsperadas);

            System.out.println("Porcentaje de ciudades que no alcanzaron: "
                    + ciudadesNoEsperadas * 100.0 / ciudades + "%");

            System.out.println("Ciudades entre 40% y 60% por encima: "
                    + ciudades40a60);

            estado++;
        }

        entrada.close();
    }
}
