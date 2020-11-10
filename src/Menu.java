import org.omg.CORBA.PRIVATE_MEMBER;

import java.util.Scanner;

  public class Menu {

  private Scanner scanner = new Scanner(System.in);


  public void mostrarMenu(){

          System.out.println("Accion sobre peliculas ");
          System.out.println("1. Agregar");
          System.out.println("2. Eliminar");
          System.out.println("3. Mostrar");
          System.out.println("4. Actualizar cartelera");
          int opcion = scanner.nextInt();

          switch (opcion){
              case 1:

                  break;
              case 2:
                  break;
              case 3:
                  break;
              case 4:
                  break;
              default:
          }

      }


}
