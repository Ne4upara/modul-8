package ua.goit.sergey.modul8;

public class Quad extends Shape {

    protected double length;

    public Quad(String name, double length) {
        super(name);
        if (length >0) this.length = length;
        else System.out.println("Вы ввели не правильные данные :");
    }
    @Override
    public void getArea() {
        double res = length * length;
        if (res > 0) System.out.printf("Площадь %sa = %.2f ; \n", name ,res);

    }
    @Override
    public void getPerimeter() {
        double res = 4 * length;
        if (res > 0) System.out.printf("Периметр %sa= %.2f ; \n", name, res);

    }
}


