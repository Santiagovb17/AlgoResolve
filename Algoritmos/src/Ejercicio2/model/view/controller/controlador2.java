package Ejercicio2.model.view.controller;

import java.util.Scanner;

import Ejercicio2.model.modelo2;
import Ejercicio2.model.view.vista2;

public class controlador2 {
    public static void ejecutar(Scanner scanner) {
        System.out.print("Ingrese un número: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Intente de nuevo: ");
            scanner.next();
        }
        int num = scanner.nextInt();
        scanner.nextLine();
        boolean resultado = modelo2.isDigitIncreasing(num);
        vista2.mostrarResultado(num, resultado);
    }
}