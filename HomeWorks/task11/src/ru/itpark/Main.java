package ru.itpark;

public class Main {

    public static void main(String[] args) {
        DataReader reader = new DataReader("names.txt");

        ArrayList<LinkedList<Human>> arrayList = new ArrayList<>();

        Human human = reader.readHuman();
        while (human != null) {
            if (arrayList.get(human.getAge()) == null) {
                arrayList.set(human.getAge(), new LinkedList<Human>(human));
            } else {
                arrayList.get(human.getAge()).add(human);
            }

            human = reader.readHuman();
        }

        for (LinkedList<Human> linkedList : arrayList) {
            for(Human h : linkedList) {
                System.out.println(h.toString());
            }
        }
    }
}
