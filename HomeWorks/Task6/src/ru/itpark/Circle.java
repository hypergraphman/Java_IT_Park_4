package ru.itpark;

public class Circle extends Shape implements Area {
    double radius;

    public Circle(Point pointStart, double radius) {
        super(pointStart);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Я есть круг.");
        System.out.println("Моя зона: " + getArea());
        System.out.println("Мув ми плиз");
        System.out.println("Май кординатс: (" + pointStart.getX() + ", " + pointStart.getY() + ")");
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void move(int x, int y) {
        pointStart.move(x, y);
    }
}
