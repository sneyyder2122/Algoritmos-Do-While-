import java.util.Scanner;

public class Ejercicio62 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int cantidad;
        int empresa = 1;
        int actividad;
        int localizacion;
        int trabajadores;
        int agricolas = 0;
        int industriales = 0;
        int mineras = 0;
        int minerasSur = 0;
        int trabAgricolas = 0;
        int trabIndustriales = 0;
        int trabMineras = 0;
        int trabPesqueras = 0;
        int trabOtras = 0;
        int industrialesNorte = 0;
        int industrialesSur = 0;
        int industrialesEste = 0;
        int industrialesOeste = 0;
        int pesqueras = 0;
        int otras = 0;

        System.out.print("Cantidad de empresas: ");
        cantidad = entrada.nextInt();

        while (empresa <= cantidad) {

            System.out.println("\nEmpresa " + empresa);

            System.out.print("Actividad (1-5): ");
            actividad = entrada.nextInt();

            System.out.print("Localizacion (1-4): ");
            localizacion = entrada.nextInt();

            System.out.print("Trabajadores: ");
            trabajadores = entrada.nextInt();

            if (actividad == 1) {
                agricolas++;
                trabAgricolas += trabajadores;
            }

            if (actividad == 2) {

                industriales++;
                trabIndustriales += trabajadores;

                if (localizacion == 1) {
                    industrialesNorte++;
                }

                if (localizacion == 2) {
                    industrialesSur++;
                }

                if (localizacion == 3) {
                    industrialesEste++;
                }

                if (localizacion == 4) {
                    industrialesOeste++;
                }
            }

            if (actividad == 3) {

                mineras++;
                trabMineras += trabajadores;

                if (localizacion == 2) {
                    minerasSur++;
                }
            }

            if (actividad == 4) {
                pesqueras++;
                trabPesqueras += trabajadores;
            }

            if (actividad == 5) {
                otras++;
                trabOtras += trabajadores;
            }

            empresa++;
        }

        System.out.println("\nPorcentaje empresas agricolas: "
                + agricolas * 100.0 / cantidad + "%");

        if (mineras > 0) {
            System.out.println("Mineras del sur respecto a mineras: "
                    + minerasSur * 100.0 / mineras + "%");
        }

        if (agricolas > 0) {
            System.out.println("Promedio trabajadores agricolas: "
                    + (double) trabAgricolas / agricolas);
        }

        if (industriales > 0) {
            System.out.println("Promedio trabajadores industriales: "
                    + (double) trabIndustriales / industriales);
        }

        if (mineras > 0) {
            System.out.println("Promedio trabajadores mineras: "
                    + (double) trabMineras / mineras);
        }

        if (pesqueras > 0) {
            System.out.println("Promedio trabajadores pesqueras: "
                    + (double) trabPesqueras / pesqueras);
        }

        if (otras > 0) {
            System.out.println("Promedio trabajadores otras: "
                    + (double) trabOtras / otras);
        }

        int mayor = industrialesNorte;
        int localMayor = 1;

        if (industrialesSur > mayor) {
            mayor = industrialesSur;
            localMayor = 2;
        }

        if (industrialesEste > mayor) {
            mayor = industrialesEste;
            localMayor = 3;
        }

        if (industrialesOeste > mayor) {
            mayor = industrialesOeste;
            localMayor = 4;
        }

        System.out.println("Localizacion con mas empresas industriales: "
                + localMayor);

        entrada.close();
    }
}