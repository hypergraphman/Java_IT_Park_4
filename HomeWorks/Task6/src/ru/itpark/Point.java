package ru.itpark;

// в моем понимание это просто пара координат, не являющихся фигурой
// поэтому и метод изменения положения никак не связан с аналогичным методом фигуры
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
