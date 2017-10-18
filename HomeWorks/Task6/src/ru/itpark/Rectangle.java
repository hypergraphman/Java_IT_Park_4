package ru.itpark;

public class Rectangle extends Shape implements Area{
    private Point pointEnd;

    public Rectangle(Point pointStart, Point pointEnd) {
        super(pointStart);
        this.pointEnd = pointEnd;
    }


    @Override
    public void move(int x, int y) {
        pointStart.move(x, y);
        pointEnd.move(x, y);
    }

    @Override
    public void draw() {
        System.out.println("Я абыщный дүртпочмак.");
        System.out.println("Минем площать: " + getArea());
        System.out.println("Меня можно подвинуть инде.");
        System.out.println("Менә координатлар: (" + pointStart.getX() + ", " + pointStart.getY() + ")"
                + " (" + pointEnd.getX() + ", " + pointEnd.getY() + ")");
    }

    @Override
    public double getArea() {
        int side1 = Math.abs(pointEnd.getX() - pointStart.getX());
        int side2 = Math.abs(pointEnd.getY() - pointStart.getY());
        return side1 * side2;
    }
}
