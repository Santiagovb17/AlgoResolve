package model;

public class calculadoramodel {
    public double sumar(double a, double b){
        return a + b;
    }
    public double restar(double a, double b){
        return a - b;
    }
    public double multiplicar(double a, double b){
        return a * b;
    }
    public double dividir(double a, double b){
        if (b==0){
            throw new ArithmeticException("no se puede dividir por 0");
        }
        return a / b;
    }
}