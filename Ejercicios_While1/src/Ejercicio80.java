import java.util.Scanner;

public class Ejercicio80 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int estados;
        int estado = 1;
        int ciudades;
        int ciudad;
        int municipios;
        int municipio;
        int personas;
        int persona;
        int edad;
        char educacion;
        char situacion;
        int totalCiudad;
        int desempleadosSinEducacion;
        double mayorPorcentajeProfesionales = 0;
        int estadoMayor = 0;
        System.out.print("Cantidad de estados: ");
        estados = entrada.nextInt();

        while (estado <= estados) {

            int codigoEstado;

            System.out.print("Codigo del estado: ");
            codigoEstado = entrada.nextInt();

            System.out.print("Cantidad de ciudades: ");
            ciudades = entrada.nextInt();

            int profesionalesEstado = 0;
            int profesionalesDesempleadosEstado = 0;

            ciudad = 1;

            while (ciudad <= ciudades) {

                int codigoCiudad;

                System.out.print("Codigo de ciudad: ");
                codigoCiudad = entrada.nextInt();

                System.out.print("Cantidad de municipios: ");
                municipios = entrada.nextInt();

                totalCiudad = 0;
                int totalPersonasCiudad = 0;

                municipio = 1;

                while (municipio <= municipios) {

                    int codigoMunicipio;

                    System.out.print("Codigo de municipio: ");
                    codigoMunicipio = entrada.nextInt();

                    System.out.print("Cantidad de personas: ");
                    personas = entrada.nextInt();

                    persona = 1;
                    desempleadosSinEducacion = 0;

                    while (persona <= personas) {

                        System.out.print("Edad: ");
                        edad = entrada.nextInt();

                        System.out.print("Educacion (N/B/S/P): ");
                        educacion = entrada.next().toUpperCase().charAt(0);

                        System.out.print("Situacion (D/E): ");
                        situacion = entrada.next().toUpperCase().charAt(0);

                        if (situacion == 'D' &&
                                educacion == 'N' &&
                                edad > 25) {
                            desempleadosSinEducacion++;
                        }

                        if (educacion == 'P') {
                            profesionalesEstado++;

                            if (situacion == 'D') {
                                profesionalesDesempleadosEstado++;
                            }
                        }

                        totalPersonasCiudad++;
                        persona++;
                    }

                    System.out.println("Municipio: " + codigoMunicipio);
                    System.out.println("Desempleados sin educacion mayores de 25: "
                            + desempleadosSinEducacion);

                    totalCiudad += desempleadosSinEducacion;

                    municipio++;
                }

                if (totalCiudad > totalPersonasCiudad * 0.50) {
                    System.out.println("Ciudad con mas del 50%: "
                            + codigoCiudad);
                }

                ciudad++;
            }

            if (profesionalesEstado > 0) {

                double porcentaje =
                        profesionalesDesempleadosEstado * 100.0
                                / profesionalesEstado;

                if (porcentaje > mayorPorcentajeProfesionales) {
                    mayorPorcentajeProfesionales = porcentaje;
                    estadoMayor = codigoEstado;
                }
            }

            estado++;
        }

        System.out.println("Estado con mayor porcentaje de profesionales desempleados: "
                + estadoMayor);

        entrada.close();
    }
}