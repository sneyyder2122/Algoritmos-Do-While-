import java.util.Scanner;
public class Veintitresavoejercicio {
    public static void main(String[] args) {
        int numero = 1;
        int contadorPerfectos = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Los tres primeros números perfectos son:");

        do {
            int sumaDivisores = 0;


            for (int i = 1; i < numero; i++) {
                if (numero % i == 0) {
                    sumaDivisores = sumaDivisores + i;
                }
            }

            if (sumaDivisores == numero && numero > 1) {
                System.out.println(numero);
                contadorPerfectos = contadorPerfectos + 1;
            }

            numero = numero + 1;

        } while (contadorPerfectos < 3);
    entrada.close();
    }
}
