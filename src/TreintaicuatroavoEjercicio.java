import java.util.Scanner;
public class TreintaicuatroavoEjercicio {
    public static void main(String[] args) {

        int totalLibros = 0;
        int librosCienciaFiccion = 0;
        int librosRomance = 0;
        String autorMasLibros = "";
        int mayorCantidadLibros = 0;
        Scanner entrada = new Scanner(System.in);


        System.out.println("Para terminar, ingrese 'fin' como apellido\n");

        String apellido;
        do {
            System.out.print("Apellido del autor (o 'fin'): ");
            apellido = entrada.next();

            if (apellido.equalsIgnoreCase("fin")) {
                break;
            }

            System.out.print("Número de libros: ");
            int numLibros = entrada.nextInt();

            int totalPaginasAutor = 0;
            int mayorPaginas = 0;
            int codigoMayorPaginas = 0;


            int libro = 1;
            do {
                System.out.print("Código del libro " + libro + ": ");
                int codigoLibro = entrada.nextInt();

                System.out.print("Género (CF/R/A/T/N/AA/AC): ");
                String genero = entrada.next();

                System.out.print("Número de páginas: ");
                int numPaginas = entrada.nextInt();

                totalPaginasAutor = totalPaginasAutor + numPaginas;
                totalLibros = totalLibros + 1;

                if (genero.equalsIgnoreCase("CF")) {
                    librosCienciaFiccion = librosCienciaFiccion + 1;
                } else if (genero.equalsIgnoreCase("R")) {
                    librosRomance = librosRomance + 1;
                }

                if (numPaginas > mayorPaginas) {
                    mayorPaginas = numPaginas;
                    codigoMayorPaginas = codigoLibro;
                }

                libro = libro + 1;
            } while (libro <= numLibros);

            if (numLibros > mayorCantidadLibros) {
                mayorCantidadLibros = numLibros;
                autorMasLibros = apellido;
            }

            // Mostramos información del autor
            System.out.println("\n--- INFORMACIÓN DEL AUTOR ---");
            System.out.println("Apellido: " + apellido);
            System.out.println("Total de páginas escritas: " + totalPaginasAutor);
            System.out.println("Libro con más páginas: Código " + codigoMayorPaginas +
                    " (" + mayorPaginas + " páginas)");
            System.out.println();

        } while (true);

        // Mostramos estadísticas generales
        System.out.println("\n=== ESTADÍSTICAS GENERALES ===");
        if (totalLibros > 0) {
            double porcentajeCF = (librosCienciaFiccion * 100.0) / totalLibros;
            System.out.println("Porcentaje de ciencia ficción: " + porcentajeCF + "%");
        }
        System.out.println("Libros de ciencia ficción: " + librosCienciaFiccion);
        System.out.println("Libros de romance: " + librosRomance);
        System.out.println("Autor con más libros: " + autorMasLibros +
                " (" + mayorCantidadLibros + " libros)");

        entrada.close();
    }
}
