package ru.itpark;

// статический класс для выдачи предупреждающих сообщений
public class Messages {
    private static String[] messages = {"All ready!", "Store is full.", "This element not found.", "Store is empty"};

    public static void MessagesPrint (int numberMessage) {
        System.out.println(messages[numberMessage]);
    }
}
