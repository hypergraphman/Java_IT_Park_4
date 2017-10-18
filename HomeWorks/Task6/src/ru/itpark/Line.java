package ru.itpark;

public class Line extends Shape {
    private Point pointEnd;
    public Line(Point pointStart, Point pointEnd) {
        super(pointStart);
        this.pointEnd = pointEnd;
    }

    @Override
    public void draw() {
        System.out.println("Я изящная линия.");
        System.out.println("Я настолько изящна, что у меня нет площади.");
        System.out.println("Зато меня можно подвинуть.");
        System.out.println("Вот мои координаты: (" + pointStart.getX() + ", " + pointStart.getY() + ")"
                + " (" + pointEnd.getX() + ", " + pointEnd.getY() + ")");
    }

    // подразумевается, если мы двигаем линию, то должны подвинутся обе точки образующие её
    @Override
    public void move(int x, int y) {
        pointStart.move(x, y);
        pointEnd.move(x, y);
    }
}
