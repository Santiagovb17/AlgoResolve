package Ejercicio4.controller;
import java.util.Scanner;
import Ejercicio4.model.modelo4;
import Ejercicio4.view.vista4;
public class controlador4 {
    public static void ejecutar(Scanner scanner) {
        System.out.print("Ingrese el término de Padovan: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Intente de nuevo: ");
            scanner.next();
        }
        int n = scanner.nextInt();
        scanner.nextLine();
        int resultado = modelo4.padovan(n);
        vista4.mostrarResultado(n, resultado);
    }
}
