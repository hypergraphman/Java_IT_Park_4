package ru.itpark;

import java.util.ArrayList;

public class Parser {
    private ParserObserver parserObservers[] = new ParserObserver[10];
    private  int count = 0;

    public String[] parse(String text) {
        ArrayList<String> words = new ArrayList<>();
        char chars[] = text.toCharArray();
        int letterFirst = 0;
        int letterLast = 0;
        boolean isStartWord = true;
        for (int i = 0; i < chars.length; i++) {
            // notifyAll(chars[i]);
            // логика сборки очередного слова
            if (chars[i] != ' ' && isStartWord) {
                isStartWord = false;
                letterFirst = i;
            } else if (chars[i] == ' ' && !isStartWord) {
                isStartWord = true;
                letterLast = i - 1;
            } else if (i == chars.length - 1 && !isStartWord) {
                isStartWord = true;
                letterLast = i;
            }

            if (isStartWord && letterLast - letterFirst > 0) {
                char temp[] = new char[letterLast - letterFirst + 1];
                for(int j = letterFirst, k = 0; j <= letterLast; j++, k++) {
                    temp[k] = chars[j];
                }
                words.add(new String(temp));
            }


        }

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
