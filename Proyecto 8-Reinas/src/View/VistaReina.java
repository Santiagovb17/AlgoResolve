package View;

import Model.Reina;

import java.util.List;

/**
 * Clase que representa la vista para mostrar las soluciones del problema de las 8 reinas.
 * Se encarga de imprimir las soluciones en formato de tablero en la consola.
 */
public class VistaReina {

    /**
     * Muestra todas las soluciones encontradas para el problema de las 8 reinas.
     * Cada solución se imprime como un tablero de ajedrez con las reinas colocadas.
     *
     * @param soluciones   Lista de soluciones, donde cada solución es una lista de objetos {@link Reina}.
     * @param reinaInicial La reina inicial que se colocó en el tablero.
     */
    public void mostrarSoluciones(List<List<Reina>> soluciones, Reina reinaInicial) {
        System.out.println("Total de soluciones encontradas: " + soluciones.size());

        int contador = 1;
        for (List<Reina> solucion : soluciones) {
            System.out.println("\n--- Solución #" + contador + " ---");
            char[][] tablero = new char[8][8];

            // Inicializar el tablero con puntos
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    tablero[i][j] = '.';
                }
            }

            // Colocar todas las reinas de la solución
            for (Reina r : solucion) {
                tablero[r.getFila()][r.getColumna()] = 'Q';
            }

            // Asegurar que la reina inicial esté visible aunque no se coloque de nuevo
            tablero[reinaInicial.getFila()][reinaInicial.getColumna()] = 'R';

            // Imprimir el tablero
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    System.out.print(tablero[i][j] + " ");
                }
                System.out.println();
            }

            contador++;
        }
    }
}



