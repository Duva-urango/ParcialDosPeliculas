import java.util.Scanner;

public class ReproductorPeliculas {

    private Pelicula[] pelicula = new Pelicula[10];
    private final Scanner scanner = new Scanner(System.in);

    public void agregar() {

        int posicion = buscarPosicionVacio();

        if (posicion != -1) {
            System.out.println("Ingrese el nombre de la pelicula");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese la puntuacion");
            double puntuacion = scanner.nextDouble();
            System.out.println("Ingrese el genero ");
            String genero = scanner.nextLine();
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

        for (int i = 0; i < pelicula.length; i++) {
                System.out.println(pelicula[i]);
        }
    }



    private int buscarPosicionVacio () {

            for (int i = 0; i < pelicula.length; i++) {

                if (pelicula[i] == null) {
                    return i;
                }
            }

            return -1;
        }
    }