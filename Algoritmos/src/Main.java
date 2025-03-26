import java.util.Scanner;
import Ejercicio1.model.view.controller.controlador1;
import Ejercicio2.model.view.controller.controlador2;
import Ejercicio3.model.view.controller.controlador3;
import Ejercicio4.controller.controlador4;
import Ejercicio5.controller.controlador5;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        while (running) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Resolver problema de patos y conejos");
            System.out.println("2. Verificar número digit-increasing");
            System.out.println("3. Verificar número digit-palindromic");
            System.out.println("4. Calcular serie de Padovan");
            System.out.println("5. Calcular serie de mSenh");
            System.out.println("6. Salir");
            System.out.print("Ingrese opción: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Intente de nuevo.");
                scanner.next();
                continue;
            }
            
            int opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    controlador1.ejecutar(scanner);
                    break;
                case 2:
                    controlador2.ejecutar(scanner);
                    break;
                case 3:
                    controlador3.ejecutar(scanner);
                    break;
                case 4:
                    controlador4.ejecutar(scanner);
                    break;
                case 5:
                    controlador5.ejecutar(scanner);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    running = false;
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }
        scanner.close();
    }
}