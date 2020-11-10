import org.omg.CORBA.PRIVATE_MEMBER;

import java.util.Scanner;

  public class Menu {
  private ReproductorPeliculas reproductorPeliculas =  new ReproductorPeliculas();
  private Scanner scanner = new Scanner(System.in);


  public void mostrarMenu() {

      int opcion = 0;
      do {
          System.out.println("\nAccion sobre peliculas ");
          System.out.println("1. Agregar");
          System.out.println("2. Eliminar");
          System.out.println("3. Mostrar");
          System.out.println("4. Actualizar cartelera");
          System.out.println("5. Saliri");
          opcion = scanner.nextInt();
          scanner.nextLine();

          switch (opcion) {
              case 1:
                   reproductorPeliculas.agregar();
                  break;
              case 2:
                  reproductorPeliculas.eliminar();
                  break;
              case 3:
                  reproductorPeliculas.mostrar();
                  break;
              case 4:
                  break;

              case 5:
                  break;
              default:
                  System.out.println("Esta opcion no es valida");
          }
      } while (opcion != 5);

      System.out.println("Gracias por utilizar nuestro plataforma de peliculas");
  }
}
