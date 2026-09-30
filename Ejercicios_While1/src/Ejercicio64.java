
public class Ejercicio64 {
    public static void main(String[] args) {

        int termino = 1;
        int cantidad = 0;

        double suma = 0;
        double valor = 1;

        while (suma < 1.99) {

            suma += valor;
            cantidad++;

            valor = valor / 2;
        }

        System.out.println("Numero de terminos: " + cantidad);
        System.out.println("Suma: " + suma);
    }
}