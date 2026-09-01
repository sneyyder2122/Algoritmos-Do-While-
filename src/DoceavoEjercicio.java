import java.util.Scanner;
public class DoceavoEjercicio {
    public static void main (String[] args){
        double numero;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.print("Ingrese un número positivo: ");
            numero = entrada.nextDouble();

            if (numero <= 0) {
                System.out.println("Error: El número debe ser positivo");
            }
        } while (numero <= 0);

        double x = 0.1;
        double raiz = 0;
        int iteraciones = 0;

        do {
            raiz = (x + numero / x) / 2;
            iteraciones = iteraciones + 1;
            x = raiz;
        } while (Math.abs(x - raiz) > 0.000001);

        System.out.println("La raíz cuadrada de " + numero + " es: " + raiz);
        System.out.println("Se realizaron " + iteraciones + " iteraciones");
        System.out.println("Verificación con Math.sqrt: " + Math.sqrt(numero));

        entrada.close();

    }
}
