package ru.itpark;

import java.util.ArrayList;

public class Parser {
    private ParserObserver parserObservers[] = new ParserObserver[10];
    private  int count = 0;

    public String[] parse(String text) {
        ArrayList<String> words = new ArrayList<>();
        char chars[] = text.toCharArray();
        int letterFirst = 0;
        for (int i = 0; i < chars.length; i++) {
            // notifyAll(chars[i]);
            // логика сборки очередного слова
            if (chars[i] == ' ') {
                if (i > letterFirst) {
                    char temp[] = new char[i - letterFirst];
                    for(int j = letterFirst, k = 0; j < i; j++, k++) {
                        temp[k] = chars[j];
                    }
                    words.add(new String(temp));
                }
                letterFirst = i + 1;
            }
        }

        if (letterFirst < chars.length) {
            char temp[] = new char[chars.length - letterFirst];
            for(int j = letterFirst, k = 0; j < chars.length; j++, k++) {
                temp[k] = chars[j];
            }
            words.add(new String(temp));

        }

        /* авторский метод разбивки слов по пробелам
        он мне больше понравился =) Но условия сложноваты
        int letterFirst = 0;
        int letterLast = 0;
        boolean isNotStartWord = true;
        for (int i = 0; i < chars.length; i++) {
            // notifyAll(chars[i]);
            // логика сборки очередного слова
            // Если не пробел и слово не начало формироваться
            if (chars[i] != ' ' && isNotStartWord) {
                // говорим, что слово начало формироваться и запоминаем индекс первой буквы
                isNotStartWord = false;
                letterFirst = i;
            } else if (chars[i] == ' ' && !isNotStartWord) {
                // иначе, если пробел и слово уже формируется, то
                // говорим, что слово закончилось и начинает формироваться заново и
                // запоминаем индекс последнего символа перед пробелом.
                isNotStartWord = true;
                letterLast = i - 1;
            } else if (i == chars.length - 1 && !isNotStartWord) {
                // иначе, если строка закончилась и слово формируется,
                // то запоминаем последний индекс строки.
                isNotStartWord = true;
                letterLast = i;
            }

            // если слово сформированно и оно имеет длину, то
            // добавляем его в наш массив слов
            if (isNotStartWord && letterLast - letterFirst > 0) {
                char temp[] = new char[letterLast - letterFirst + 1];
                for(int j = letterFirst, k = 0; j <= letterLast; j++, k++) {
                    temp[k] = chars[j];
                }
                words.add(new String(temp));
                letterFirst = letterLast = 0;
            }


        }
        */

        return words.toArray(new String[words.size()]);
    }

    public void notifyAll(char c) {
        for (int i = 0; i < parserObservers.length; i++) {
            parserObservers[i].handleParserModule(c);
        }
    }

    public void addObserver(ParserObserver observer) {
        parserObservers[count++] = observer;
    }
    /*
    public void parseString (SpecialModule specialModule) {
        for (ParserObserver parserObserver: parserObservers) {
            parserObserver.handleParserModule(specialModule);
        }
    }
    */
}
