package Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un tablero de ajedrez para resolver el problema de las 8 reinas.
 * Permite agregar, quitar y verificar la seguridad de las posiciones de las reinas.
 */
public class Tablero {
    private List<Reina> reinas;

    /**
     * Constructor de la clase Tablero.
     * Inicializa una lista vacía para almacenar las reinas colocadas en el tablero.
     */
    public Tablero() {
        reinas = new ArrayList<>();
    }

    /**
     * Verifica si es seguro colocar una reina en una posición específica del tablero.
     * Una posición es segura si no hay otra reina en la misma fila, columna o diagonal.
     *
     * @param fila    La fila donde se desea colocar la reina.
     * @param columna La columna donde se desea colocar la reina.
     * @return {@code true} si la posición es segura, {@code false} en caso contrario.
     */
    public boolean esSeguro(int fila, int columna) {
        for (Reina r : reinas) {
            if (r.getFila() == fila || r.getColumna() == columna ||
                Math.abs(r.getFila() - fila) == Math.abs(r.getColumna() - columna)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Agrega una reina al tablero en una posición específica.
     *
     * @param reina La reina que se desea agregar al tablero.
     */
    public void agregarReina(Reina reina) {
        reinas.add(reina);
    }

    /**
     * Quita la última reina colocada en el tablero.
     * Este método es útil para implementar el algoritmo de backtracking.
     */
    public void quitarUltimaReina() {
        if (!reinas.isEmpty()) {
            reinas.remove(reinas.size() - 1);
        }
    }

    /**
     * Obtiene la lista de reinas colocadas actualmente en el tablero.
     *
     * @return Una lista de objetos {@link Reina} que representan las reinas colocadas.
     */
    public List<Reina> getReinas() {
        return reinas;
    }
}


