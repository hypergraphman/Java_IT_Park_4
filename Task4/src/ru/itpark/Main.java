package ru.itpark;

public class Main {

    public static void main(String[] args) {
        Avto mers = new Avto();
        mers.setColor("Красный");
        mers.setNumber("AA777A");
        mers.setPower(90);

        Avto lada = new Avto();
        lada.setColor("Blue");
        lada.setNumber("BB777A");
        lada.setPower(90);

        Avto vazda = new Avto();
        vazda.setColor("Yellow");
        vazda.setNumber("YY777A");
        vazda.setPower(90);

        Avto avtos[] = {mers, lada, vazda};

        for (int i = 0; i < avtos.length - 1; ++i) {
            for (int j = i + 1; j <= avtos.length; ++j) {

            }
        }
    }
}
