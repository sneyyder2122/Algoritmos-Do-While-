import java.util.Scanner;

public class Ejercicio79 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int autores=0;
        int autor = 1;
        int libros;
        int libro;
        String apellido;
        String codigo;
        int genero;
        int paginas;
        int totalLibros = 0;
        int cienciaFiccion = 0;
        int romance = 0;
        int mayorCantidadLibros = 0;
        String autorMayor = "";

        while (autor <= autores) {

            entrada.nextLine();

            System.out.print("Apellido del autor: ");
            apellido = entrada.nextLine();

            System.out.print("Cantidad de libros: ");
            libros = entrada.nextInt();

            int totalPaginasAutor = 0;
            int libroMayorPaginas = 0;
            String codigoLibroMayor = "";

            libro = 1;

            while (libro <= libros) {

                entrada.nextLine();

                System.out.print("Codigo del libro: ");
                codigo = entrada.nextLine();

                System.out.print("Genero (1 Ciencia, 2 Romance, 3 Accion, 4 Terror, 5 Novela, 6 Autoayuda, 7 Academico): ");
                genero = entrada.nextInt();

                System.out.print("Paginas: ");
                paginas = entrada.nextInt();

                totalPaginasAutor += paginas;
                totalLibros++;

                if (paginas > libroMayorPaginas) {
                    libroMayorPaginas = paginas;
                    codigoLibroMayor = codigo;
                }

                if (genero == 1) {
                    cienciaFiccion++;
                }

                if (genero == 2) {
                    romance++;
                }

                libro++;
            }

            System.out.println("Autor: " + apellido);
            System.out.println("Total paginas: " + totalPaginasAutor);
            System.out.println("Libro con mas paginas: "
                    + codigoLibroMayor);

            if (libros > mayorCantidadLibros) {
                mayorCantidadLibros = libros;
                autorMayor = apellido;
            }

            autor++;
        }

        System.out.println("Porcentaje ciencia ficcion: "
                + cienciaFiccion * 100.0 / totalLibros + "%");

        System.out.println("Ciencia ficcion: " + cienciaFiccion);
        System.out.println("Romance: " + romance);

        System.out.println("Autor con mas libros: "
                + autorMayor);

        entrada.close();
    }
}
