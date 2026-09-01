import java.util.Scanner;

public class SegundoEjercicio{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = 1;

        do {

            if (numero % 2 != 0 && numero % 7 != 0) {
                System.out.println(numero);
            }

            numero++;

        } while (numero < 100);

        sc.close();
    }
}