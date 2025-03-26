package Ejercicio4.model;
public class modelo4 {
    public static int padovan(int n) {
        if (n == 0 || n == 1 || n == 2) return 1;
        return padovan(n - 2) + padovan(n - 3);
    }
}
