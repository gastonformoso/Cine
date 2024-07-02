import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Pelicula pelicula1 = new Pelicula("Rápidos y Furiosos", "Acción/Crimen", 106);
        Pelicula pelicula2 = new Pelicula("La Vida es Bella", "Comedia/Bélico", 116);
        Pelicula pelicula3 = new Pelicula("Deadpool", "Comedia/Acción", 108);
        Pelicula pelicula4 = new Pelicula("Intensamente", "Infantil/Comedia", 95);
        Pelicula pelicula5 = new Pelicula("Scary Movie", "Comedia/Terror", 88);

        Entrada entradas = new Entrada(0);

        Formato formato1 = new Formato("2D", 4600);
        Formato formato2 = new Formato("3D", 5800);
        Formato formato3 = new Formato("4D", 12300);

        Idioma lenguaje1 = new Idioma("Castellano");
        Idioma lenguaje2 = new Idioma("Subtitulada");
        Idioma lenguaje3 = new Idioma("Ingles");


        Scanner scanner = new Scanner(System.in);


        // EJECUCIÓN

        // Seleccionar pelicula

        Scanner opcionpelicula = new Scanner(System.in);



        System.out.println("-----------------------------------------------");
        System.out.println("¿Que película desea ver? Ingrese 1,2,3,4 o 5" );
        System.out.println("-----------------------------------------------");
        System.out.println("1 - " + pelicula1.getNombre() + " - " + pelicula1.getGenero() + " - " + pelicula1.getDuracion() + " minutos");
        System.out.println("2 - " + pelicula2.getNombre() + " - " + pelicula2.getGenero() + " - " + pelicula2.getDuracion() + " minutos");
        System.out.println("3 - " + pelicula3.getNombre() + " - " + pelicula3.getGenero() + " - " + pelicula3.getDuracion() + " minutos");
        System.out.println("4 - " + pelicula4.getNombre() + " - " + pelicula4.getGenero() + " - " + pelicula4.getDuracion() + " minutos");
        System.out.println("5 - " + pelicula5.getNombre() + " - " + pelicula5.getGenero() + " - " + pelicula5.getDuracion() + " minutos");
        System.out.println("-----------------------------------------------");

        int op1 = scanner.nextInt();

        Pelicula peliculaSeleccionada = null;
        switch (op1) {
            case 1:
                peliculaSeleccionada = pelicula1;
                break;
            case 2:
                peliculaSeleccionada = pelicula2;
                break;
            case 3:
                peliculaSeleccionada = pelicula3;
                break;
            case 4:
                peliculaSeleccionada = pelicula4;
                break;
            case 5:
                peliculaSeleccionada = pelicula5;
                break;
            default:
                System.out.println("No se ha seleccionado una opción correcta");
                System.exit(0);
        }


        // Seleccionar cantidad de entradas (máximo 4)

        Scanner opcionentradas = new Scanner(System.in);


        System.out.println("-----------------------------------------------");
        System.out.println("Ingrese la cantidad de entradas (máximo 4)");
        System.out.println("-----------------------------------------------");

        int op2 = scanner.nextInt();


        if (op2 <1 || op2 > 4){
            System.out.println("No se ha seleccionado una opción correcta");
            System.exit(0);
        }
        else{
            entradas.setCantidadentradas(op2);
        }

        // Seleccionar formato (2D, 3D, 4D)

        Scanner opcionformato = new Scanner(System.in);

        System.out.println("-----------------------------------------------");
        System.out.println("Elija un formato (Ingrese 1,2 o 3,");
        System.out.println("1 - " + formato1.getDimension());
        System.out.println("2 - " + formato2.getDimension());
        System.out.println("3 - " + formato3.getDimension());
        System.out.println("-----------------------------------------------");

        int op3 = scanner.nextInt();


        Formato formatoSeleccionado = null;
        switch (op3) {
            case 1:
                formatoSeleccionado = formato1;
                break;
            case 2:
                formatoSeleccionado = formato2;
                break;
            case 3:
                formatoSeleccionado = formato3;
                break;
            default:
                System.out.println("No se ha seleccionado una opción correcta");
                System.exit(0);
        }

        // Elegir idioma (Castellano, Subitulado, Inglés)

        Scanner opcionidioma = new Scanner(System.in);

        System.out.println("-----------------------------------------------");
        System.out.println("Elija un idioma (Ingrese 1,2 o 3,");
        System.out.println("1 - " + lenguaje1.getLenguaje());
        System.out.println("2 - " + lenguaje2.getLenguaje());
        System.out.println("3 - " + lenguaje3.getLenguaje());
        System.out.println("-----------------------------------------------");

        int op4 = scanner.nextInt();

        Idioma idiomaSeleccionado = null;
        switch (op4) {
            case 1:
                idiomaSeleccionado = lenguaje1;
                break;
            case 2:
                idiomaSeleccionado = lenguaje2;
                break;
            case 3:
                idiomaSeleccionado = lenguaje3;
                break;
            default:
                System.out.println("No se ha seleccionado una opción correcta");
                System.exit(0);
        }

        // Resumen de compra + cálculo de precio dependiendo el formato seleccionado

        System.out.println("-----------------------------------------------");
        System.out.println("Resumen de compra");
        System.out.println("-----------------------------------------------");
        System.out.println("Pelicula " + peliculaSeleccionada.getNombre());
        System.out.println("Genero " + peliculaSeleccionada.getGenero());
        System.out.println("Duración: " + peliculaSeleccionada.getDuracion());
        System.out.println("Cantidad de entradas: " + entradas.getCantidadentradas());
        System.out.println("Formato: " + formatoSeleccionado.getDimension());
        System.out.println("Idioma: " + idiomaSeleccionado.getLenguaje());
        System.out.println("Sala: 2 ");
        System.out.println("Asientos: Sin Numeración");
        System.out.println("Horario: 20:00 HS");
        System.out.println("-----------------------------------------------");
        System.out.println("Precio total a pagar: " + formatoSeleccionado.getPreciodimension() * entradas.getCantidadentradas());
        System.out.println("-----------------------------------------------");

        scanner.close();
    }
}