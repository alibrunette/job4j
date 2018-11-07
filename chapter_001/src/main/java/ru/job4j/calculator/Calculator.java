package ru.job4j.calculator;
/**
 * Calculate.
 *
 * @author Alina Maryenko (aliwka.l@gmail.com)
 * @version 1.
 * @since 07.11.2019.
 */
public class Calculator {
    private double result;
    /**
     * Сложение чисел.
     * @param first первое.
     * @param second второе.
     */
    public void add(double first, double second) { //метод складывает аргументы first и second и записывает результат в поле this.result
        this.result = first + second;
    }
    /**
     * Вычитание чисел.
     * @param first первое.
     * @param second второе.
     */
    public void subtract(double first, double second) {
        this.result = first - second;
    }
    /**
     * Деление чисел.
     * @param first первое.
     * @param second второе.
     */
    public void div(double first, double second) {
        this.result = first / second;
    }
    /**
     * Умножение чисел.
     * @param first первое.
     * @param second второе.
     */
    public void multiple(double first, double second) {
        this.result = first * second;
    }

    public double getResult() {
        return this.result;
    }
}
