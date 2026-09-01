import java.util.Scanner;

public class VeintiunavoEjercicio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int vuelos;

        System.out.print("Cantidad de vuelos: ");
        vuelos = sc.nextInt();

        int vuelo = 1;
        int totalPasajeros = 0;
        int pasajerosSinPago = 0;

        do {

            System.out.println("\n===== VUELO " + vuelo + " =====");

            System.out.print("Numero de vuelo: ");
            int numeroVuelo = sc.nextInt();

            System.out.print("Cantidad de pasajeros: ");
            int pasajeros = sc.nextInt();

            int pasajero = 1;

            double totalVuelo = 0;

            double mayorPeso = -1;
            double menorPeso = Double.MAX_VALUE;

            String pasajeroMayor = "";
            String pasajeroMenor = "";

            do {

                sc.nextLine();

                System.out.print("Nombre del pasajero: ");
                String nombre = sc.nextLine();

                System.out.print("Codigo de abordo: ");
                String abordo = sc.nextLine();

                System.out.print("Cantidad de maletas: ");
                int maletas = sc.nextInt();

                int maleta = 1;

                double pesoTotal = 0;
                double mayorPesoMaleta = -1;
                String codigoMaletaMayor = "";

                do {

                    sc.nextLine();

                    System.out.print("Codigo de maleta: ");
                    String codigoMaleta = sc.nextLine();

                    System.out.print("Peso de la maleta: ");
                    double peso = sc.nextDouble();

                    pesoTotal += peso;

                    if (peso > mayorPesoMaleta) {
                        mayorPesoMaleta = peso;
                        codigoMaletaMayor = codigoMaleta;
                    }

                    maleta++;

                } while (maleta <= maletas);

                double tarifa;

                if (pesoTotal <= 3) {
                    tarifa = 0;
                } else if (pesoTotal <= 6) {
                    tarifa = 600;
                } else if (pesoTotal <= 9) {
                    tarifa = 1200;
                } else if (pesoTotal <= 12) {
                    tarifa = 1500;
                } else if (pesoTotal <= 15) {
                    tarifa = 2000;
                } else {
                    tarifa = 2500;
                }

                System.out.println("\n--- PASAJERO ---");
                System.out.println("Vuelo: " + numeroVuelo);
                System.out.println("Codigo abordo: " + abordo);
                System.out.println("Nombre: " + nombre);
                System.out.println("Peso total: " + pesoTotal);
                System.out.println("Monto a pagar: " + tarifa);
                System.out.println("Maleta de mayor peso: " + codigoMaletaMayor);

                if (tarifa == 0) {
                    pasajerosSinPago++;
                }

                if (pesoTotal > mayorPeso) {
                    mayorPeso = pesoTotal;
                    pasajeroMayor = nombre;
                }

                if (pesoTotal < menorPeso) {
                    menorPeso = pesoTotal;
                    pasajeroMenor = nombre;
                }

                totalVuelo += tarifa;
                totalPasajeros++;

                pasajero++;

            } while (pasajero <= pasajeros);

            System.out.println("\n--- RESUMEN DEL VUELO ---");
            System.out.println("Pasajero con mayor peso: "
                    + pasajeroMayor + " - " + mayorPeso);

            System.out.println("Pasajero con menor peso: "
                    + pasajeroMenor + " - " + menorPeso);

            System.out.println("Total pagado por equipaje: "
                    + totalVuelo);

            vuelo++;

        } while (vuelo <= vuelos);

        System.out.println("\nPorcentaje de pasajeros que no pagaron: "
                + pasajerosSinPago * 100.0 / totalPasajeros + "%");

        sc.close();
    }
}