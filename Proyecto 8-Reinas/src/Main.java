import Controller.ReinasControlador;
import Model.SolucionReinas;
import View.VistaReina;

/**
 * Clase principal que inicia la ejecución del programa para resolver el problema de las 8 reinas.
 * Se encarga de crear las instancias necesarias del modelo, la vista y el controlador,
 * y de iniciar la interacción con el usuario.
 */
public class Main {
    /**
     * Método principal del programa.
     * Configura el modelo, la vista y el controlador, y da inicio al flujo de ejecución.
     *
     * @param args Argumentos de la línea de comandos (no utilizados en este programa).
     */
    public static void main(String[] args) {
        // Crear las instancias del modelo, la vista y el controlador
        SolucionReinas solucion = new SolucionReinas();
        VistaReina vista = new VistaReina();
        ReinasControlador controlador = new ReinasControlador(solucion, vista);  // Usar ReinasControlador

        // Iniciar la interacción con el usuario
        controlador.iniciar();
    }
}
