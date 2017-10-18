package ru.itpark;

public class Main {

    public static void main(String[] args) {
	    Shape shapes[] = new Shape[6];
	    shapes[1] = new Dot(new Point(1,1));
	    shapes[2] = new Line(new Point(2,2), new Point(3, 4));
	    shapes[3] = new Rectangle(new Point(-1,-1), new Point( - 3, -4));
	    shapes[4] = new Line(new Point(1,1), new Point(-4, -3));
	    shapes[5] = new Rectangle(new Point(1,-1), new Point(-1, 1));
	    shapes[0] = new Circle(new Point(1,1), 5.5);

	    for (Shape shape: shapes) {
	        shape.draw();
        }

        for (Shape shape: shapes) {
            shape.move(-1, 1);
        }

        for (Shape shape: shapes) {
            shape.draw();
        }
    }
}
