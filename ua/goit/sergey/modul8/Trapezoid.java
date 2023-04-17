package ua.goit.sergey.modul8;

public class Trapezoid extends Rectangle {

    protected double heigth;
    public Trapezoid(String name, double length, double width, double height) {
        super(name, length, width);
        if (height > 0 )this.heigth = height;
        else System.out.println("Вы ввели не правильные данные :");
    }

    @Override
    public void getArea() {
        double res = (((1/2f)*(length+width)) * heigth);
        if (length > 0 && width > 0 && heigth > 0) System.out.printf("Площадь  = %.2f ; \n", res);

    }

    @Override
    public void getPerimeter() {
        double res = (2 * heigth) + length + width;
        if (length > 0 && width > 0 && heigth > 0) System.out.printf("Периметр = %.2f ; \n", res);

    }
}
