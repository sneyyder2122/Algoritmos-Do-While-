

public class Ejercicio47 {
        public static void main(String[] args) {

            int numero = 1;

            while (numero < 100) {

                if (numero % 2 != 0 && numero % 7 != 0) {
                    System.out.println(numero);
                }

                numero++;
            }
        }
    }