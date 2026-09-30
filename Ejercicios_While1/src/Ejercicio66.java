import java.util.Scanner;
public class Ejercicio66 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int vuelos;
        int vuelo = 1;
        int pasajeros;
        int pasajero;
        int maletas;
        int maleta;
        int codigoVuelo;
        int codigoAbordo;
        int codigoMaleta;
        String nombre;
        double peso;
        double tarifa;
        double monto;
        double totalVuelo;
        double totalPesoPasajero;
        double totalPagoPasajero;
        double mayorMaleta;
        int codigoMayorMaleta;
        double mayorPasajero;
        double menorPasajero;
        int codigoMayorPasajero;
        int codigoMenorPasajero;
        String nombreMayorPasajero;
        String nombreMenorPasajero;
        int pasajerosSinPago = 0;
        int totalPasajeros = 0;

        System.out.print("Cantidad de vuelos: ");
        vuelos = entrada.nextInt();

        while (vuelo <= vuelos) {

            System.out.print("\nNumero de vuelo: ");
            codigoVuelo = entrada.nextInt();

            System.out.print("Cantidad de pasajeros: ");
            pasajeros = entrada.nextInt();

            totalVuelo = 0;
            pasajero = 1;

            mayorPasajero = 0;
            menorPasajero = 0;
            codigoMayorPasajero = 0;
            codigoMenorPasajero = 0;
            nombreMayorPasajero = "";
            nombreMenorPasajero = "";

            while (pasajero <= pasajeros) {

                entrada.nextLine();

                System.out.print("Codigo de abordo: ");
                codigoAbordo = entrada.nextInt();

                entrada.nextLine();

                System.out.print("Nombre: ");
                nombre = entrada.nextLine();

                System.out.print("Cantidad de maletas: ");
                maletas = entrada.nextInt();

                totalPesoPasajero = 0;
                totalPagoPasajero = 0;

                mayorMaleta = 0;
                codigoMayorMaleta = 0;

                maleta = 1;

                while (maleta <= maletas) {

                    System.out.print("Codigo de maleta: ");
                    codigoMaleta = entrada.nextInt();

                    System.out.print("Peso de la maleta: ");
                    peso = entrada.nextDouble();

                    tarifa = 0;

                    if (peso <= 3) {
                        tarifa = 0;
                    }

                    if (peso > 3 && peso <= 6) {
                        tarifa = 600;
                    }

                    if (peso > 6 && peso <= 9) {
                        tarifa = 1200;
                    }

                    if (peso > 9 && peso <= 12) {
                        tarifa = 1500;
                    }

                    if (peso > 12 && peso <= 15) {
                        tarifa = 2000;
                    }

                    if (peso > 15) {
                        tarifa = 2500;
                    }

                    monto = peso * tarifa;

                    totalPesoPasajero += peso;
                    totalPagoPasajero += monto;

                    if (peso > mayorMaleta) {
                        mayorMaleta = peso;
                        codigoMayorMaleta = codigoMaleta;
                    }

                    maleta++;
                }

                System.out.println("\nVuelo: " + codigoVuelo);
                System.out.println("Abordo: " + codigoAbordo);
                System.out.println("Nombre: " + nombre);
                System.out.println("Kilogramos: " + totalPesoPasajero);
                System.out.println("Monto: " + totalPagoPasajero);
                System.out.println("Maleta mayor: " + codigoMayorMaleta);

                totalVuelo += totalPagoPasajero;
                totalPasajeros++;

                if (totalPagoPasajero == 0) {
                    pasajerosSinPago++;
                }

                if (pasajero == 1) {
                    mayorPasajero = totalPesoPasajero;
                    menorPasajero = totalPesoPasajero;
                    codigoMayorPasajero = codigoAbordo;
                    codigoMenorPasajero = codigoAbordo;
                    nombreMayorPasajero = nombre;
                    nombreMenorPasajero = nombre;
                }

                if (totalPesoPasajero > mayorPasajero) {
                    mayorPasajero = totalPesoPasajero;
                    codigoMayorPasajero = codigoAbordo;
                    nombreMayorPasajero = nombre;
                }

                if (totalPesoPasajero < menorPasajero) {
                    menorPasajero = totalPesoPasajero;
                    codigoMenorPasajero = codigoAbordo;
                    nombreMenorPasajero = nombre;
                }

                pasajero++;
            }

            System.out.println("\nVuelo " + codigoVuelo);
            System.out.println("Mayor peso: " + nombreMayorPasajero
                    + " - " + mayorPasajero + " kg");
            System.out.println("Menor peso: " + nombreMenorPasajero
                    + " - " + menorPasajero + " kg");
            System.out.println("Total cobrado: " + totalVuelo);

            vuelo++;
        }

        System.out.println("Porcentaje sin pagar equipaje: "
                + pasajerosSinPago * 100.0 / totalPasajeros + "%");

        entrada.close();
    }
}
