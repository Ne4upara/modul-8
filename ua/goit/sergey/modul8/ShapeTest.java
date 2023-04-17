package ua.goit.sergey.modul8;

public class ShapeTest {

    public static void main(String[] args) {

        Shape quad = new Quad("Квадрат", 4);
        System.out.println(quad.name);
        quad.getArea();
        quad.getPerimeter();

        Shape rectangle = new Rectangle("Прямоугольник", 3, 5);
        System.out.println(rectangle.name);
        rectangle.getArea();
        rectangle.getPerimeter();

        Shape circle = new Circle("Круг", 4);
        System.out.println(circle.name);
        circle.getArea();
        circle.getPerimeter();

        Shape ellipse = new Ellipse("Элипс", 10, 6);
        System.out.println(ellipse.name);
        ellipse.getArea();
        ellipse.getPerimeter();

        Shape trapezoid = new Trapezoid("Трапеция", 3, 6, 4);
        System.out.println(trapezoid.name);
        trapezoid.getArea();
        trapezoid.getPerimeter();

        EquilateralTtriangle equilateralTtriangle = new EquilateralTtriangle("Tреугольник", 5);
        System.out.println(equilateralTtriangle.name);
        equilateralTtriangle.getMedian();
        equilateralTtriangle.getArea();
        equilateralTtriangle.getPerimeter();

        EquilateralTtriangle isoscelesTriangle = new IsoscelesTriangle("Треугольник равнобедренный", 5 , 5);
        System.out.println(isoscelesTriangle.name);
        isoscelesTriangle.getMedian();
        isoscelesTriangle.getArea();
        isoscelesTriangle.getPerimeter();

        EquilateralTtriangle triangle = new Triangle("Треугольник", 5, 5,5 );
        System.out.println(triangle.name);
        triangle.getMedian();
        triangle.getArea();
        triangle.getPerimeter();

    }
}
