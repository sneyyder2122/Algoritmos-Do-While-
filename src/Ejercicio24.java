import java.util.Scanner;
public class Ejercicio24 {
    public static void main(String[] args) {

        int numero = 1;
        int contadorPares = 0;
        Scanner entrada = new Scanner(System.in);
        do {

            int sumaDivisores = 0;
            for (int i = 1; i < numero; i++) {
                if (numero % i == 0) {
                    sumaDivisores = sumaDivisores + i;
                }
            }

            if (sumaDivisores > numero) {

                int sumaDivisores2 = 0;
                for (int j = 1; j < sumaDivisores; j++) {
                    if (sumaDivisores % j == 0) {
                        sumaDivisores2 = sumaDivisores2 + j;
                    }
                }

                if (sumaDivisores2 == numero) {
                    System.out.println("Par " + (contadorPares + 1) + ": " +
                            numero + " y " + sumaDivisores);
                    contadorPares = contadorPares + 1;
                }
            }

            numero = numero + 1;

        } while (contadorPares < 3);
        entrada.close();
    }
}