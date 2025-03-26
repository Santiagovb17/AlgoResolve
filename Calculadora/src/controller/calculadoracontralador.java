package controller;
import model.calculadoramodel;
import view.calculadoraconsola;
public class calculadoracontralador {
    private calculadoramodel modelo;
    private calculadoraconsola vista;
    public calculadoracontralador(calculadoramodel modelo, calculadoraconsola vista){
        this.modelo=modelo;
        this.vista=vista;
    }
    public void iniciar(){
        boolean continuar=true;
        while (continuar) {
            int opcion = vista.leeropcion();
            if (opcion == 5) {
                vista.mostrarMensaje("Saliendo del programa: ");
                continuar=false;
                break;
            }
            double num1 = vista.leernumero("Ingrese el primer numero: ");
            double num2 = vista.leernumero("Ingrese el segundo numero: ");
            double resultado = 0;
            try{
                switch (opcion) {
                    case 1:
                        resultado = modelo.sumar(num1, num2);
                        break;
                    case 2:
                        resultado = modelo.restar(num1, num2);
                        break;
                    case 3:
                        resultado = modelo.multiplicar(num1, num2);
                        break;
                    case 4:
                        resultado = modelo.dividir(num1, num2);
                        break;              
                    default:
                        vista.mostrarMensaje("opcion invalida. intente de nuevo");
                        break;
                }
                vista.mostraResultado(resultado);
            }catch (ArithmeticException e) {
                vista.mostrarMensaje("Error: " + e.getMessage());

            } 
        }vista.cerrarScanner();
    }
}