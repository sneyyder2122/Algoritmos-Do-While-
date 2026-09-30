import java.util.Scanner;

public class Ejercicio46 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int N, K;

        System.out.print("Ingrese N: ");
        N = entrada.nextInt();

        System.out.print("Ingrese K: ");
        K = entrada.nextInt();

        while (N >= K) {
            System.out.println(N);
            N = N - 1;
        }

        entrada.close();
    }
}