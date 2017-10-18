package ru.itpark;

// просто ЖИРНАЯ точка, возможно с появлением настоящего метода Draw сильно изменится
public class Dot extends Shape {
    public Dot(Point pointStart) {
        super(pointStart);
    }

    @Override
    public void draw() {
        System.out.println("Я просто ЖИРНАЯ точка.");
        System.out.println("У меня нет площади, хоть я и ЖИРНАЯ.");
        System.out.println("Зато меня можно подвинуть.");
        System.out.println("Вот мои координаты: (" + pointStart.getX() + ", " + pointStart.getY() + ")");
    }

    @Override
    public void move(int x, int y) {
        pointStart.move(x, y);
    }
}
