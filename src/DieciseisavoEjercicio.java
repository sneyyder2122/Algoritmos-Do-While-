import java.util.Scanner;

public class DieciseisavoEjercicio {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el multiplicador: ");
        int multiplicador = entrada.nextInt();

        System.out.print("Ingrese el multiplicando: ");
        int multiplicando = entrada.nextInt();

        int resultado = 0;
        int multiplicadorOriginal = multiplicador;
        int multiplicandoOriginal = multiplicando;

        System.out.println("\nProceso de multiplicación rusa:");
        System.out.println("Multiplicador\tMultiplicando\tSuma");
        System.out.println("-----------------------------------");

        do {
            if (multiplicador % 2 != 0) {
                resultado = resultado + multiplicando;
                System.out.println(multiplicador + "\t\t" + multiplicando + "\t\t+" + multiplicando);
            } else {
                System.out.println(multiplicador + "\t\t" + multiplicando + "\t\t-");
            }
            multiplicando = multiplicando * 2;
            multiplicador = multiplicador / 2;

        } while (multiplicador >= 1);

        System.out.println("\nResultado: " + multiplicadorOriginal + " x " +
                multiplicandoOriginal + " = " + resultado);

        entrada.close();
    }
}
