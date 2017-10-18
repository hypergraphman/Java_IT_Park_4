package ru.itpark;

public class Parser {
    private ParserObserver parserObservers[] = new ParserObserver[10];
    private  int count = 0;

    public void addObserver(ParserObserver observer) {
        parserObservers[count++] = observer;
    }

    public void parseString (SpecialModule specialModule) {
        for (ParserObserver parserObserver: parserObservers) {
            parserObserver.handleParserModule(specialModule);
        }
    }
}
