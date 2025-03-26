package Ejercicio5.model;
public class modelo5 {
    public static int mSenh(int n) {
        if (n == 0 || n == 1 || n == 2) return 1;
        return mSenh(n - 2) + mSenh(n - 3);
    }
}