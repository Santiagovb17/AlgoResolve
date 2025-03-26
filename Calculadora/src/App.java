import controller.calculadoracontralador;
import model.calculadoramodel;
import view.calculadoraconsola;
public class App {
    public static void main(String[] args){
        calculadoramodel modelo = new calculadoramodel();
        calculadoraconsola vista = new calculadoraconsola();
        calculadoracontralador controlador = new calculadoracontralador(modelo, vista);
        controlador.iniciar();
    }
}