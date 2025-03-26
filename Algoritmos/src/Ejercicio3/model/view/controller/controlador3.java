package Ejercicio3.model.view.controller;
import java.util.Scanner;
import Ejercicio3.model.modelo3;
import Ejercicio3.model.view.vista3;

public class controlador3 {
    public static void ejecutar(Scanner scanner) {
        System.out.print("Ingrese un número: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Intente de nuevo: ");
            scanner.next();
        }
        int num = scanner.nextInt();
        scanner.nextLine();
        boolean resultado = modelo3.isDigitPalindromic(num);
        vista3.mostrarResultado(num, resultado);
    }
}