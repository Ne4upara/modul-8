package ua.goit.sergey.modul8;

public class Triangle extends IsoscelesTriangle {

    protected double sideB;
    public Triangle(String name, double sideA, double sideB, double sideC) {
        super(name, sideA, sideC);
        if (sideB > 0)this.sideB = sideB;
        else System.out.println("Вы ввели не правильные данные :");
    }

    @Override
    public void getMedian() {
        double res = Math. sqrt(((sideA * sideA)*2) + ((sideB * sideB)*2) - (sideC*sideC))/2;
        if (sideA > 0 && sideB > 0 && sideC > 0)System.out.printf("Медиана %s = %.2f ; \n", name ,res);

    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void getArea() {
        double p = (sideA + sideB + sideC) / 2;
        double res = Math. sqrt(p * ((p - sideA)*(p - sideB)*(p - sideC)));
        if (sideA > 0 && sideB > 0 && sideC > 0)System.out.printf("Площадь %s = %.2f ; \n", name ,res);

    }

    @Override
    public void getPerimeter() {
        double res = sideB+ sideA + sideC;
        if (sideA > 0 && sideB > 0 && sideC > 0)System.out.printf("Периметр %s= %.1f ; \n", name, res);

    }
}
