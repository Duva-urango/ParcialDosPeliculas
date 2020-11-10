import java.util.Scanner;

public class ReproductorPeliculas {

    private Pelicula[] pelicula = new Pelicula[10];
    private final Scanner scanner = new Scanner(System.in);

    public void agregar() {

        int posicion = buscarPosicionVacio();

        if (posicion != -1) {
            System.out.println("Ingrese el nombre de la pelicula");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese la puntuacion de 0 a 10");
            double puntuacion = scanner.nextDouble();
            scanner.nextLine();
            Genero genero = elegirGenero();
            System.out.println("Ingrese la descripcion");
            String descripcion = scanner.nextLine();
            pelicula[posicion] = new Pelicula(posicion + 1, nombre, puntuacion, genero, descripcion);
        } else {
            System.out.println("No hay espacios disponibles");
        }
    }

    public void eliminar () {

        System.out.println("Que id desea eliminar");
        int posicion = scanner.nextInt();
        scanner.nextLine();

        if (posicion >= 1 && posicion <= pelicula.length) {
            if (pelicula[posicion - 1] == null){
                System.out.println("El id=" + posicion + "Esta vacio");
            }else{}
            pelicula[posicion - 1] = null;
            System.out.println("La pelicula con id" + posicion + "Fue eliminado satisfactoriamente");
        } else {
            System.out.println("Este id no existe");
        }
    }

    public void mostrar(){

        System.out.println("\nPELICULA");
        for (int i = 0; i < pelicula.length; i++) {
                if(pelicula[i] != null) {
                    System.out.println(pelicula[i]);
                }
        }
    }


    private int buscarPosicionVacio () {

            System.out.println("PELICULA");
            for (int i = 0; i < pelicula.length; i++) {

                if (pelicula[i] == null) {
                    return i;
                }
            }

            return -1;
        }

        private Genero elegirGenero(){

            int opcion = 0;
            do {
                System.out.println("Elija el genero ");
                System.out.println("1. " + Genero.AVENTURA);
                System.out.println("2. " + Genero.COMEDIA);
                System.out.println("3. " + Genero.DRAMA);
                System.out.println("4. " + Genero.TERROR);
                opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        return Genero.AVENTURA;
                    case 2:
                        return Genero.COMEDIA;
                    case 3:
                        return Genero.DRAMA;
                    case 4:
                        return Genero.TERROR;
                    default:
                        System.out.println("No ecxiste el genero");
                        return null;
                }
            }while (true);

        }
    }

