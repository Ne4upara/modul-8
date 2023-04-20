package ua.goit.sergey.modul8;

public class IsoscelesTriangle extends EquilateralTtriangle {

    protected double sideC;
    public IsoscelesTriangle(String name, double sideA, double sideC ) {
        super(name, sideA);
        if (sideC > 0)this.sideC = sideC;
        else System.out.println("Вы ввели не правильные данные :");

    }

    @Override
    public void getMedian() {
        double res = Math. sqrt(4*(sideA*sideA) - (sideC*sideC))/2;
        if (sideA > 0 && sideC > 0)System.out.printf("Медиана %s = %.2f ; \n", name ,res);

    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void getArea() {
        double res = (sideA * (Math. sqrt(4*(sideA*sideA) - (sideC*sideC))/2))/2;
        if (sideA > 0 && sideC > 0)System.out.printf("Площадь %s = %.2f ; \n", name ,res);

    }

    @Override
    public void getPerimeter() {
        double res = (2 * sideA) + sideC;
        if (sideA > 0 && sideC > 0)System.out.printf("Периметр %s= %.1f ; \n", name, res);

    }
}
