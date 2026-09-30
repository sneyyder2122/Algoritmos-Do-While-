public class Ejercicio51 {
    public static void main(String[] args) {

        int termino = 6;
        int suma = 0;
        int contador = 1;

        while (contador <= 12) {

            suma = suma + termino;

            if (contador == 12) {
                System.out.println("Termino 12: " + termino);
            }

            termino = termino + 5;
            contador++;
        }

        System.out.println("Suma de los 12 terminos: " + suma);
    }
}