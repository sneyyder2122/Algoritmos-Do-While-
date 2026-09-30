
public class Ejercicio50 {
    public static void main(String[] args) {

        int numero = 98;
        int suma = 0;

        while (numero <= 1003) {

            suma = suma + numero;

            numero = numero + 2;
        }

        System.out.println("La suma es: " + suma);
    }
}