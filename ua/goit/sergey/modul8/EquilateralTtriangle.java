package ua.goit.sergey.modul8;

public class EquilateralTtriangle extends Shape {

    protected double sideA;


    public EquilateralTtriangle(String name, double sideA) {
        super(name);
        if ( sideA > 0) this.sideA = sideA;
        else System.out.println("Вы ввели не правильные данные :");
    }

    public void getMedian(){
        double res = (sideA*Math. sqrt(3))/2;
        if (res > 0)System.out.printf("Медиана %s = %.2f ; \n", name ,res);

    }

    public EquilateralTtriangle(String name) {
        super(name);
    }

    @Override
    public void getArea() {
        double res = ((sideA*sideA)*Math. sqrt(3))/4;
        if (res > 0)System.out.printf("Площадь %s = %.2f ; \n", name ,res);

    }

    @Override
    public void getPerimeter() {
        double res = 3 * sideA;
        if (res > 0)System.out.printf("Периметр %s= %.1f ; \n", name, res);

    }
}
