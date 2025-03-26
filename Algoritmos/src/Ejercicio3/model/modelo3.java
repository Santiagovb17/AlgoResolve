package Ejercicio3.model;

public class modelo3 {
    public static boolean isDigitPalindromic(int n) {
        int reversed = 0, original = n;
        while (n > 0) {
            reversed = reversed * 10 + (n % 10);
            n /= 10;
        }
        return original == reversed;
    }
}
