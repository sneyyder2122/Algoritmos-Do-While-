import java.util.Scanner;

public class Ejercicio57 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double N;
        double X = 0.1;
        double RN;
        double diferencia;

        System.out.print("Ingrese un numero positivo: ");
        N = entrada.nextDouble();

        while (N <= 0) {
            System.out.print("Debe ser positivo. Ingrese otro: ");
            N = entrada.nextDouble();
        }

        RN = (X + N / X) / 2;
        diferencia = Math.abs(X - RN);

        while (diferencia >= 0.000001) {

            X = RN;
            RN = (X + N / X) / 2;
            diferencia = Math.abs(X - RN);
        }

        System.out.println("Raiz cuadrada: " + RN);

        entrada.close();
    }
}