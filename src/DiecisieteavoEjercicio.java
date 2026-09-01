import java.util.Scanner;
public class DiecisieteavoEjercicio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = 0;

        int agricolas = 0;
        int mineras = 0;
        int minerasSur = 0;

        int industrialesNorte = 0;
        int industrialesSur = 0;

        int trabajadoresAgricolas = 0;
        int trabajadoresMineras = 0;
        int trabajadoresIndustriales = 0;

        char continuar;

        do {

            System.out.print(
                    "Actividad (A=M agricultura, M=mineria, I=industrial): "
            );
            char actividad =
                    sc.next().toUpperCase().charAt(0);

            System.out.print(
                    "Localizacion (N=norte, S=sur): "
            );
            char localizacion =
                    sc.next().toUpperCase().charAt(0);

            System.out.print(
                    "Numero de trabajadores: "
            );
            int trabajadores = sc.nextInt();

            if (actividad == 'A') {

                agricolas++;
                trabajadoresAgricolas += trabajadores;

            } else if (actividad == 'M') {

                mineras++;
                trabajadoresMineras += trabajadores;

                if (localizacion == 'S') {
                    minerasSur++;
                }

            } else if (actividad == 'I') {

                trabajadoresIndustriales += trabajadores;

                if (localizacion == 'N') {
                    industrialesNorte++;
                } else {
                    industrialesSur++;
                }
            }

            total++;

            System.out.print(
                    "¿Desea ingresar otra empresa? (S/N): "
            );

            continuar =
                    sc.next().toUpperCase().charAt(0);

        } while (continuar == 'S');

        System.out.println("\n--- RESULTADOS ---");

        System.out.println(
                "Porcentaje de empresas agricolas: "
                        + agricolas * 100.0 / total
                        + "%"
        );

        if (mineras > 0) {

            System.out.println(
                    "Porcentaje de mineras del sur: "
                            + minerasSur * 100.0 / mineras
                            + "%"
            );
        }

        if (agricolas > 0) {

            System.out.println(
                    "Promedio trabajadores agricultura: "
                            + trabajadoresAgricolas * 1.0 / agricolas
            );
        }

        if (mineras > 0) {

            System.out.println(
                    "Promedio trabajadores mineria: "
                            + trabajadoresMineras * 1.0 / mineras
            );
        }

        if (industrialesNorte > industrialesSur) {

            System.out.println(
                    "Mayor localizacion industrial: Norte"
            );

        } else if (industrialesSur > industrialesNorte) {

            System.out.println(
                    "Mayor localizacion industrial: Sur"
            );

        } else {

            System.out.println(
                    "Ambas localizaciones tienen la misma cantidad."
            );
        }

        sc.close();
    }

}
