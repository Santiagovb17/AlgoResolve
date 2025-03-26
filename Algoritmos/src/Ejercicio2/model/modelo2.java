package Ejercicio2.model;

public class modelo2 {
    public static boolean isDigitIncreasing(int num) {
        for (int c = 1; c <= 9; c++) {
            int sum = 0, term = 0;
            for (; sum < num;) {
                term = term * 10 + c;
                sum += term;
            }
            if (sum == num) return true;
        }
        return false;
    }
}
