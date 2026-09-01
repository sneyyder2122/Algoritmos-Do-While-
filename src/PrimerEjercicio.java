import java.util.Scanner;
public class PrimerEjercicio {
    public static void main (String[] args){
        int K;
        int N;
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el valor de N");
        N = entrada.nextInt();
        System.out.println("ingrese el valor de K");
        K = entrada.nextInt();

        do{
            System.out.println("\n" +N );
            N--;

        }while (N>=K);

    }
}
