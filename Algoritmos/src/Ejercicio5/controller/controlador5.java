package Ejercicio5.controller;
import java.util.Scanner;
import Ejercicio5.model.modelo5;
import Ejercicio5.view.vista5;
public class controlador5 {
    public static void ejecutar(Scanner scanner) {
        System.out.print("Ingrese el término de mSenh: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Intente de nuevo: ");
            scanner.next();
        }
        int n = scanner.nextInt();
        scanner.nextLine();
        int resultado = modelo5.mSenh(n);
        vista5.mostrarResultado(n, resultado);
    }
}