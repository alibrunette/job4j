package ru.job4j.condition;
/**
 * Point.
 *
 * @author Alina Maryenko (aliwka.l@gmail.com)
 * @version $Id$
 * @since 07.11.2018
 */

public class Point {
    /**
     * В этом классе мы создали поля
     */

    private int x;
    private int y;

    /**
     * конструктор
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    /**
     * Math.sqrt(a) - корень квадратный от a.
     * Math.pow(a, b) - возведение числа а в степень b.
     */
    public double distanceTo(Point that) {
        return Math.sqrt(
                Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));
    }
    /**
     * В методе main мы создали два объекта типа Point и заполнили их значениями
     */
    public static void main(String[] args) {
        Point a = new Point(0, 1);// Точка А - это текущая точка. К ней мы обращаемся через оператор this.
        Point b = new Point(2, 5);//Точка В - это входящая точка. К ней мы можем обратиться напрямую через имя переменной that
        // или для удобства мы создали новую переменную b и к ней присвоили переменную that.
        System.out.println("x1 = " + a.x);
        System.out.println("y1 = " + a.y);
        System.out.println("x2 = " + b.x);
        System.out.println("y2 = " + b.y);

        double result = a.distanceTo(b);
        System.out.println("Расстояние между точками А и В : " + result);
    }
}




