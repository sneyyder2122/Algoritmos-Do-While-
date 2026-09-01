import java.util.Scanner;
public class SextoEjercicio {
    public static void main (String[] args){
        int Termino = 6;
        int diferencia = 5;
        int contador = 1;
        int suma = 0;

        Scanner entrada = new Scanner(System.in);
        do{
            suma += Termino;
            if (contador ==12){
                System.out.println("termino doceavo es: " +Termino);
            }
            Termino +=diferencia;
            contador++;
        }while ( contador <=12 );
        System.out.println("Suma de los terminos es: "+suma);
        entrada.close();
    }
}
