import java.util.Scanner;
public class VeintisieteavoEjercicio {
    public static void main(String[] args) {
        int contadorSatelites = 0;
        double mayorFuerza = 0;
        double menorFuerza = 999999999;
        double sumaFuerzas = 0;
        double mayorMasa = 0;
        double sumaMasas = 0;
        double menorAltura = 999999999;
        double mayorAltura = 0;
        Scanner entrada = new Scanner(System.in);
        double G = 6.67259 * Math.pow(10, -11);
        double masaTierra = 5.97 * Math.pow(10, 24);

        System.out.println("CÁLCULO DE FUERZA DE ATRACCIÓN");
        System.out.println("Para terminar, ingrese 'fin' como nombre\n");

        String nombre;
        do {
            System.out.print("Nombre del satélite (o 'fin'): ");
            nombre = entrada.next();

            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }

            System.out.print("País: ");
            String pais = entrada.next();

            System.out.print("Masa (kg): ");
            double masa = entrada.nextDouble();

            System.out.print("Altura (metros): ");
            double altura = entrada.nextDouble();


            double radioTierra = 6371000;
            double distancia = radioTierra + altura;

            double fuerza = G * masa * masaTierra / (distancia * distancia);

            contadorSatelites = contadorSatelites + 1;


            if (fuerza > mayorFuerza) {
                mayorFuerza = fuerza;
            }
            if (fuerza < menorFuerza) {
                menorFuerza = fuerza;
            }
            sumaFuerzas = sumaFuerzas + fuerza;

            if (masa > mayorMasa) {
                mayorMasa = masa;
            }
            sumaMasas = sumaMasas + masa;

            if (altura < menorAltura) {
                menorAltura = altura;
            }
            if (altura > mayorAltura) {
                mayorAltura = altura;
            }

            System.out.println("Fuerza de atracción calculada: " + fuerza + " N");
            System.out.println();

        } while (true);


        System.out.println("\n=== RESULTADOS ===");
        System.out.println("a) Mayor fuerza: " + mayorFuerza + " N");
        System.out.println("   Menor fuerza: " + menorFuerza + " N");
        System.out.println("b) Fuerza promedio: " + (sumaFuerzas / contadorSatelites) + " N");
        System.out.println("c) Mayor masa: " + mayorMasa + " kg");
        System.out.println("d) Masa promedio: " + (sumaMasas / contadorSatelites) + " kg");
        System.out.println("e) Menor altura: " + menorAltura + " m");
        System.out.println("   Mayor altura: " + mayorAltura + " m");

        entrada.close();
    }
}
