public class QuintoEjercicio {
    public static void main(String[] args) {

        int numero = 98;
        int suma = 0;

        do {

            suma = suma + numero;

            numero = numero + 2;

        } while (numero <= 1003);

        System.out.println("La suma de los números es: "
                + suma);
    }
}