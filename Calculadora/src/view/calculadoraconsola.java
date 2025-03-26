package view;
import java.util.Scanner;
public class calculadoraconsola {
    private Scanner scanner;
    public calculadoraconsola(){
        scanner = new Scanner(System.in);
    }
    public double leernumero(String mensaje){
        System.out.println(mensaje);
        return scanner.nextDouble();
    }
    public int leeropcion(){
        System.out.println("\nSeleccione una operacion: ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. salir");
        System.out.print("opcion: ");
        return scanner.nextInt();
    }
    public void mostraResultado(double resultado){
        System.out.println("resultado: " + resultado);
    }
    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
    public void cerrarScanner(){
        scanner.close();
    }
}
