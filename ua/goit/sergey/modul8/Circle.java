package ua.goit.sergey.modul8;

public class Circle extends Shape implements Constants {

    @Override
    public String getName() {
        return super.getName();
    }

    protected double radiusA;


    public Circle(String name,double radiusA) {
        super(name);
        if ( radiusA > 0) this.radiusA = radiusA;
        else System.out.println("Вы ввели не правильные данные :");
    }

    @Override
    public void getArea() {
        double res = (PI * ( radiusA*radiusA));
        if (res > 0) System.out.printf("Площадь %sа = %.2f ; \n", name, res);
    }

    @Override
    public void getPerimeter() {
        double res = (2 * PI * radiusA);
        if (res > 0)System.out.printf("Площадь %sа = %.2f ; \n", name, res);
    }
}
