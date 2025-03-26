package Ejercicio1.model;
public class modelo1 {
    public static int[] resolverPatosYConejos(int cabezas, int patas) {
        int conejos = (patas - (2 * cabezas)) / 2;
        int patos = cabezas - conejos;
        return new int[]{patos, conejos};
    }
}