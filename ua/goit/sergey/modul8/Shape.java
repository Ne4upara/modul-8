package ua.goit.sergey.modul8;

abstract class Shape {

    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void  getArea();
    public abstract void getPerimeter();

}
