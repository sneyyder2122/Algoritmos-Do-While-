import java.util.Scanner;
public class DecimoEjercicio {
    public static void main(String[] args){

        double suma = 0;
        int k = 1;
        double termino;
        Scanner entrada = new Scanner(System.in);

        do {

            termino = (Math.pow(k, 2) + 1) / k;

            if (suma + termino <= 1000) {

                suma = suma + termino;
                k++;

            } else {

                break;
            }

        } while (suma < 1000);

        System.out.println("Numero de terminos: " + (k - 1));
        System.out.println("Suma: " + suma);
        entrada.close();
}
}
