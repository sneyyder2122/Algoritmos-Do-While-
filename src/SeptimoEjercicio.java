import java.util.Scanner;
public class SeptimoEjercicio {
    public static void main (String[] args){
    int persona = 1;

    int ninos = 0;
    int jovenes = 0;
    int adultos = 0;
    int viejos = 0;

    double sumaNinos = 0;
    double sumaJovenes = 0;
    double sumaAdultos = 0;
    double sumaViejos = 0;

    Scanner entrada = new Scanner(System.in);

    do {

        System.out.println("\nPersona " + persona);

        System.out.print("Edad: ");
        int edad = entrada.nextInt();

        System.out.print("Peso: ");
        double peso = entrada.nextDouble();

        if (edad <= 12) {

            ninos++;
            sumaNinos += peso;

        } else if (edad <= 29) {

            jovenes++;
            sumaJovenes += peso;

        } else if (edad <= 59) {

            adultos++;
            sumaAdultos += peso;

        } else {

            viejos++;
            sumaViejos += peso;
        }

        persona++;

    } while (persona <= 100);

        System.out.println("\n promedio");

        if (ninos > 0)
            System.out.println("Niños: " + sumaNinos / ninos);

        if (jovenes > 0)
            System.out.println("Jovenes: " + sumaJovenes / jovenes);

        if (adultos > 0)
            System.out.println("Adultos: " + sumaAdultos / adultos);

        if (viejos > 0)
            System.out.println("Viejos: " + sumaViejos / viejos);

        entrada.close();
}
}

