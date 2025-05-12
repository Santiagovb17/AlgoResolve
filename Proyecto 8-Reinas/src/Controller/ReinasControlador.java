package Controller;

import Model.SolucionReinas;
import Model.Reina;
import View.VistaReina;

import java.util.Scanner;

/**
 * Controlador para gestionar la interacción entre la vista y el modelo
 * en el problema de las 8 reinas.
 */
public class ReinasControlador {
    private SolucionReinas solucionReinas;
    private VistaReina vistaReina;

    /**
     * Constructor de la clase ReinasControlador.
     *
     * @param solucion Instancia del modelo que resuelve el problema de las 8 reinas.
     * @param vista Instancia de la vista para mostrar las soluciones al usuario.
     */
    public ReinasControlador(SolucionReinas solucion, VistaReina vista) {
        solucionReinas = new SolucionReinas();
        vistaReina = new VistaReina();
    }

    /**
     * Método principal para iniciar la interacción con el usuario.
     * Solicita la posición inicial de la reina, resuelve el problema
     * desde esa posición y muestra las soluciones al usuario.
     */
    public void iniciar() {
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar la posición inicial de la reina
            System.out.print("Ingrese la fila inicial (0-7): ");
            int filaInicial = scanner.nextInt();

            System.out.print("Ingrese la columna inicial (0-7): ");
            int columnaInicial = scanner.nextInt();

            // Resolver las soluciones desde la posición inicial
            solucionReinas.resolverDesde(filaInicial, columnaInicial);

            // Mostrar las soluciones con la reina inicial incluida
            Reina reinaInicial = new Reina(filaInicial, columnaInicial);
            vistaReina.mostrarSoluciones(solucionReinas.getSoluciones(), reinaInicial);
        }
    }
}





