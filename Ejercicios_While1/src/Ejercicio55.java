public class Ejercicio55 {
    public static void main(String[] args) {

        int k = 1;
        int terminos = 0;

        double suma = 0;
        double termino;

        while (suma + ((k * k + 1.0) / k) <= 1000) {

            termino = (k * k + 1.0) / k;

            suma += termino;
            terminos++;
            k++;
        }

        System.out.println("Numero de terminos: " + terminos);
        System.out.println("Suma: " + suma);
    }
}