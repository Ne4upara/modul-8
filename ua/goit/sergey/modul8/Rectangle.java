package ua.goit.sergey.modul8;

class Rectangle extends Quad {
    protected double width;

    public Rectangle(String name, double length, double width) {
        super(name, length);
        if (width > 0)this.width = width;
        else System.out.println("Вы ввели не правильные данные :");
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void getArea() {

        double res = length * width;
        if (length > 0 && width > 0) System.out.printf("Площадь %sa = %.2f ; \n", name ,res);


    }
    @Override
    public void getPerimeter() {

        double res = 2 * (length + width);
        if (length > 0 && width > 0) System.out.printf("Периметр %sa= %.2f ; \n", name, res);


    }
}
