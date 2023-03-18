package ru.job4j.calculate;

import ru.job4j.math.MathFunction;

public class Out {

    public static double sumAndMultiplyAndDif(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second)
                + MathFunction.dif(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiplyAndDif(10, 20));
    }
}
