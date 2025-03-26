package Ejercicio1.model.view.controller;
import java.util.Scanner;

import Ejercicio1.model.modelo1;
import Ejercicio1.model.view.vista1;
public class controlador1 {
    public static void ejecutar(Scanner scanner) {
        System.out.print("Ingrese el número de cabezas: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Intente de nuevo: ");
            scanner.next();
        }
        int cabezas = scanner.nextInt();
        
        System.out.print("Ingrese el número de patas: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Intente de nuevo: ");
            scanner.next();
        }
        int patas = scanner.nextInt();
        scanner.nextLine();
        
        int[] resultado = modelo1.resolverPatosYConejos(cabezas, patas);
        vista1.mostrarResultado(resultado[0], resultado[1]);
    }
}