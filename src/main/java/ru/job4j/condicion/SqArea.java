package ru.job4j.condicion;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        return k;
    }

    public static void main(String[] args) {
        double result = SqArea.square(9, 0.5);
        System.out.println("p = 9, k = 0.5, s = " + result);
    }

}
