import java.util.Scanner;

public class Ejercicio78 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double pvp1, pvp2, pvp3;
        int sucursales;
        int sucursal = 1;
        int puntos;
        int punto;
        int codigoSucursal;
        int codigoPunto;
        double esperado;
        int unidades1;
        int unidades2;
        int unidades3;
        double ventaBruta;
        double comision;
        double ventaNeta;
        double totalSucursal;
        double mayorComision;
        int puntoMayorComision;
        int productoMenor;
        int sucursalesCumplieron = 0;

        System.out.print("PVP producto 1: ");
        pvp1 = entrada.nextDouble();

        System.out.print("PVP producto 2: ");
        pvp2 = entrada.nextDouble();

        System.out.print("PVP producto 3: ");
        pvp3 = entrada.nextDouble();

        System.out.print("Cantidad de sucursales: ");
        sucursales = entrada.nextInt();

        while (sucursal <= sucursales) {

            System.out.print("\nCodigo sucursal: ");
            codigoSucursal = entrada.nextInt();

            System.out.print("Venta esperada: ");
            esperado = entrada.nextDouble();

            System.out.print("Cantidad de puntos: ");
            puntos = entrada.nextInt();

            punto = 1;
            totalSucursal = 0;
            mayorComision = 0;
            puntoMayorComision = 0;

            while (punto <= puntos) {

                System.out.print("Codigo punto de venta: ");
                codigoPunto = entrada.nextInt();

                System.out.print("Unidades producto 1: ");
                unidades1 = entrada.nextInt();

                System.out.print("Unidades producto 2: ");
                unidades2 = entrada.nextInt();

                System.out.print("Unidades producto 3: ");
                unidades3 = entrada.nextInt();

                ventaBruta = unidades1 * pvp1
                        + unidades2 * pvp2
                        + unidades3 * pvp3;

                comision = ventaBruta * 0.10;
                ventaNeta = ventaBruta - comision;

                productoMenor = 1;

                if (unidades2 < unidades1 &&
                        unidades2 <= unidades3) {
                    productoMenor = 2;
                }

                if (unidades3 < unidades1 &&
                        unidades3 < unidades2) {
                    productoMenor = 3;
                }

                System.out.println("Punto: " + codigoPunto);
                System.out.println("Unidades: "
                        + (unidades1 + unidades2 + unidades3));
                System.out.println("Venta neta: " + ventaNeta);
                System.out.println("Comision: " + comision);
                System.out.println("Producto menor: " + productoMenor);

                totalSucursal += ventaBruta;

                if (comision > mayorComision) {
                    mayorComision = comision;
                    puntoMayorComision = codigoPunto;
                }

                punto++;
            }

            System.out.println("Sucursal: " + codigoSucursal);
            System.out.println("Total vendido: " + totalSucursal);
            System.out.println("Porcentaje alcanzado: "
                    + totalSucursal * 100 / esperado + "%");
            System.out.println("Punto con mayor comision: "
                    + puntoMayorComision);

            if (totalSucursal >= esperado) {
                sucursalesCumplieron++;
            }

            sucursal++;
        }

        System.out.println("Porcentaje de sucursales que cumplieron: "
                + sucursalesCumplieron * 100.0 / sucursales + "%");

        entrada.close();
    }
}
