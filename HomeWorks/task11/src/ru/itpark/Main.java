package ru.itpark;

public class Main {

    public static void main(String[] args) {
        DataReader reader = new DataReader("names.txt");
        Human human = reader.readHuman();
        while (human != null) {
            System.out.println(human.getName()+ " " + human.getAge());
            human = reader.readHuman();
        }
    }
}
