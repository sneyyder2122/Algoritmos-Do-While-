import java.util.Scanner;


public class Ejercicio73 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int estados;
        int estado = 1;
        int agencias;
        int agencia;
        int clientes;
        int cliente;
        int pagares;
        int pagare;
        int codigoEstado;
        int codigoAgencia;
        int codigoCliente;
        String nombre;
        String direccion;
        String numeroPagare;
        double monto;
        double totalCliente;
        double totalAgencia;
        double totalEstado;
        double mayorDeudaCliente;
        int clienteMayorDeuda;
        double mayorAgenciaEstado;
        double menorAgenciaEstado;
        int agenciaMayor=0;
        int agenciaMenor=0;
        double sumaMaximosAgencias = 0;
        int totalAgencias = 0;

        System.out.print("Cantidad de estados: ");
        estados = entrada.nextInt();

        while (estado <= estados) {

            System.out.print("\nCodigo del estado: ");
            codigoEstado = entrada.nextInt();
            System.out.print("Cantidad de agencias: ");
            agencias = entrada.nextInt();
            agencia = 1;
            totalEstado = 0;
            mayorAgenciaEstado = 0;
            menorAgenciaEstado = 0;

            while (agencia <= agencias) {

                System.out.print("\nCodigo de agencia: ");
                codigoAgencia = entrada.nextInt();

                System.out.print("Cantidad de clientes: ");
                clientes = entrada.nextInt();

                cliente = 1;
                totalAgencia = 0;
                mayorDeudaCliente = 0;
                clienteMayorDeuda = 0;

                while (cliente <= clientes) {

                    System.out.print("Codigo cliente: ");
                    codigoCliente = entrada.nextInt();

                    entrada.nextLine();

                    System.out.print("Nombre: ");
                    nombre = entrada.nextLine();

                    System.out.print("Direccion: ");
                    direccion = entrada.nextLine();

                    System.out.print("Cantidad de pagares: ");
                    pagares = entrada.nextInt();

                    pagare = 1;
                    totalCliente = 0;

                    while (pagare <= pagares) {

                        entrada.nextLine();

                        System.out.print("Numero del pagare: ");
                        numeroPagare = entrada.nextLine();

                        System.out.print("Monto del pagare: ");
                        monto = entrada.nextDouble();

                        totalCliente += monto;

                        pagare++;
                    }

                    System.out.println("\nRecibo");
                    System.out.println("Cliente: " + codigoCliente);
                    System.out.println("Nombre: " + nombre);
                    System.out.println("Estado: " + codigoEstado);
                    System.out.println("Agencia: " + codigoAgencia);
                    System.out.println("Total pendiente: " + totalCliente);

                    totalAgencia += totalCliente;

                    if (totalCliente > mayorDeudaCliente) {
                        mayorDeudaCliente = totalCliente;
                        clienteMayorDeuda = codigoCliente;
                    }

                    cliente++;
                }

                System.out.println("\nAgencia: " + codigoAgencia);
                System.out.println("Estado: " + codigoEstado);
                System.out.println("Total adeudado: " + totalAgencia);
                System.out.println("Cliente con mayor deuda: "
                        + clienteMayorDeuda);

                if (agencia == 1) {
                    mayorAgenciaEstado = totalAgencia;
                    menorAgenciaEstado = totalAgencia;
                    agenciaMayor = codigoAgencia;
                    agenciaMenor = codigoAgencia;
                } else {
                    agenciaMayor = codigoAgencia;
                    agenciaMenor = codigoAgencia;
                }

                if (totalAgencia > mayorAgenciaEstado) {
                    mayorAgenciaEstado = totalAgencia;
                    agenciaMayor = codigoAgencia;
                }

                if (totalAgencia < menorAgenciaEstado) {
                    menorAgenciaEstado = totalAgencia;
                    agenciaMenor = codigoAgencia;
                }

                sumaMaximosAgencias += totalAgencia;
                totalAgencias++;
                totalEstado += totalAgencia;

                agencia++;
            }

            System.out.println("\nEstado: " + codigoEstado);
            System.out.println("Total adeudado: " + totalEstado);
            System.out.println("Agencia mayor: " + agenciaMayor);
            System.out.println("Agencia menor: " + agenciaMenor);

            estado++;
        }

        System.out.println("\nPromedio de montos de agencias: "
                + sumaMaximosAgencias / totalAgencias);

        entrada.close();
    }
}
