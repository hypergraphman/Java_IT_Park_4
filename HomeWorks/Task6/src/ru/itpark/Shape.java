package ru.itpark;

// собственно абстрактный клас Фигура к вашим услугам.
public abstract class Shape {
    protected Point pointStart;

    public Shape(Point pointStart) {
        this.pointStart = pointStart;
    }

    public abstract void move(int x, int y);

    public abstract void draw();
}
