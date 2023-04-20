package ua.goit.sergey.modul8;

public class Ellipse extends Circle implements Constants {

    protected double radiusB;
    public Ellipse(String name, double radiusA, double radiusB) {
        super(name, radiusA);
        if (radiusB > 0 )this.radiusB = radiusB;
        else System.out.println("Вы ввели не правильные данные :");
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void getArea() {
        double res = (PI * radiusA * radiusB);
        if (radiusA > 0 && radiusB > 0)System.out.printf("Площадь %sа = %.2f ; \n", name, res);

    }

    @Override
    public void getPerimeter() {
        double res = ((4*((PI*radiusA*radiusB)+((radiusA-radiusB)*(radiusA-radiusB)))/(radiusA+radiusB)));
        if (radiusA > 0 && radiusB > 0)System.out.printf("Площадь %sа = %.2f ; \n", name, res);

    }
}
