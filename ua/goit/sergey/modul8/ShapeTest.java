package ua.goit.sergey.modul8;

public class ShapeTest {

    public static void main(String[] args) {

        Shape rectangle = new Rectangle("Прямоугольник", 3.0, 4.0);
        Shape quad = new Quad("Квадрат", 2.0);
        Shape circle = new Circle("Круг", 4);
        Shape trapezoid = new Trapezoid("Трапеция", 3, 6, 4);
        EquilateralTtriangle triangle = new Triangle("Треугольник", 5, 5,5 );
        Shape ellipse = new Ellipse("Элипс", 10, 6);
        EquilateralTtriangle equilateralTtriangle = new EquilateralTtriangle("Tреугольник равностороний", 5);
        EquilateralTtriangle isoscelesTriangle = new IsoscelesTriangle("Треугольник равнобедренный", 5 , 5);

        ShowName showName = new ShowName();

        showName.showName(rectangle);
        showName.showName(quad);
        showName.showName(circle);
        showName.showName(trapezoid);
        showName.showName(triangle);
        showName.showName(ellipse);
        showName.showName(equilateralTtriangle);
        showName.showName(isoscelesTriangle);


//        printer.printName(quad);
//       quad.getArea();
//        quad.getPerimeter();
//
//        rectangle.getArea();
//        rectangle.getPerimeter();
//
//        circle.getArea();
//        circle.getPerimeter();
//
//        ellipse.getArea();
//        ellipse.getPerimeter();
//
//        trapezoid.getArea();
//        trapezoid.getPerimeter();
//
//        equilateralTtriangle.getMedian();
//        equilateralTtriangle.getArea();
//        equilateralTtriangle.getPerimeter();
//
//        isoscelesTriangle.getMedian();
//        isoscelesTriangle.getArea();
//        isoscelesTriangle.getPerimeter();
//
//        triangle.getMedian();
//        triangle.getArea();
//        triangle.getPerimeter();

    }
}
