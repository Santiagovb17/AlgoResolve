package Model;

/**
 * Clase que representa una reina en el tablero de ajedrez.
 * Contiene la posición de la reina en términos de fila y columna.
 */
public class Reina {
    private int fila;
    private int columna;

    /**
     * Constructor de la clase Reina.
     *
     * @param fila    La fila en la que se encuentra la reina (0-7).
     * @param columna La columna en la que se encuentra la reina (0-7).
     */
    public Reina(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }

    /**
     * Obtiene la fila en la que se encuentra la reina.
     *
     * @return La fila de la reina.
     */
    public int getFila() {
        return fila;
    }

    /**
     * Obtiene la columna en la que se encuentra la reina.
     *
     * @return La columna de la reina.
     */
    public int getColumna() {
        return columna;
    }
}



