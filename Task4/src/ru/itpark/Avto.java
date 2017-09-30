package ru.itpark;

public class Avto {
    private String color;
    private int power;
    private String number;

    public void setColor(String color) {
        this.color = color;
    }

    public void setPower(int power) {
        this.power = power <= 0 ? 1 : power;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public int getPower () {
        return power;
    }
    public String getNumber () {
        return number;
    }
}
