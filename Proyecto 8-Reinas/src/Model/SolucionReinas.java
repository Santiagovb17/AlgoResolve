package Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que implementa la solución al problema de las 8 reinas utilizando backtracking.
 * Permite resolver el problema desde una posición inicial específica.
 */
public class SolucionReinas {
    private List<List<Reina>> soluciones; // Lista de todas las soluciones encontradas
    private Reina reinaInicial; // Reina inicial colocada en el tablero

    /**
     * Constructor de la clase SolucionReinas.
     * Inicializa la lista de soluciones.
     */
    public SolucionReinas() {
        soluciones = new ArrayList<>();
    }

    /**
     * Resuelve el problema de las 8 reinas desde una posición inicial específica.
     *
     * @param filaInicial La fila inicial donde se colocará la primera reina (0-7).
     * @param colInicial  La columna inicial donde se colocará la primera reina (0-7).
     */
    public void resolverDesde(int filaInicial, int colInicial) {
        soluciones.clear();
        Tablero tablero = new Tablero();
        Reina reinaInicial = new Reina(filaInicial, colInicial);
        tablero.agregarReina(reinaInicial); // Agregar la reina inicial al tablero
        backtracking(tablero, 0, filaInicial);
    }

    /**
     * Método recursivo que implementa el algoritmo de backtracking para encontrar soluciones.
     *
     * @param tablero     El tablero actual con las reinas colocadas.
     * @param fila        La fila actual que se está evaluando.
     * @param filaInicial La fila donde se colocó la reina inicial (para omitirla en el backtracking).
     */
    private void backtracking(Tablero tablero, int fila, int filaInicial) {
        // Saltar la fila inicial para no modificar la posición de la reina inicial
        if (fila == filaInicial) {
            backtracking(tablero, fila + 1, filaInicial);
            return;
        }

        // Si se han colocado 8 reinas, agregar la solución a la lista
        if (tablero.getReinas().size() == 8) {
            soluciones.add(new ArrayList<>(tablero.getReinas())); // Clonar la lista de reinas
            return;
        }

        // Si la fila excede el tamaño del tablero, terminar la recursión
        if (fila >= 8) return;

        // Intentar colocar una reina en cada columna de la fila actual
        for (int col = 0; col < 8; col++) {
            if (tablero.esSeguro(fila, col)) {
                tablero.agregarReina(new Reina(fila, col)); // Colocar reina
                backtracking(tablero, fila + 1, filaInicial); // Continuar con la siguiente fila
                tablero.quitarUltimaReina(); // Retirar la reina para probar otras configuraciones
            }
        }
    }

    /**
     * Obtiene la lista de soluciones encontradas.
     *
     * @return Una lista de soluciones, donde cada solución es una lista de reinas.
     */
    public List<List<Reina>> getSoluciones() {
        return soluciones;
    }

    /**
     * Obtiene la reina inicial colocada en el tablero.
     *
     * @return La reina inicial.
     */
    public Reina getReinaInicial() {
        return reinaInicial;
    }
}


