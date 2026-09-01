public class DiecinueveavoEjercicio {
    public static void main(String[] args) {
        double suma = 0;
        double termino = 1;
        int contador = 0;

        do {
            suma = suma + termino;
            contador = contador + 1;
            termino = termino / 2;  // Siguiente término es la mitad

        } while (suma < 1.99);

        System.out.println("Número de términos necesarios: " + contador);
        System.out.println("Valor de la suma: " + suma);
        System.out.println("Se aproxima a 1.99");
    }
}


