package ru.itpark;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class DataReader {
    private InputStream input;
    private final static int MAX_NAME_LENGTH = 60;

    public DataReader(String fileName) {
        try {
            input = new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Human readHuman() {
        try {
            return readHuman0();
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private Human readHuman0() throws IOException{
        byte bytesName[] = new byte[MAX_NAME_LENGTH];

        int buf = input.read();

        for (int i = 0; buf != 32 && buf != 10 && buf != 13 && buf != -1; i++, buf = input.read()) {
            bytesName[i] = (byte) buf;
        }

        int age = 0;

        buf = input.read();

        for (; buf != 32 && buf != 10 && buf != 13 && buf != -1; buf = input.read()) {
            age = age * 10 + buf - '0';
        }

        return buf == -1 ? null : new Human(new String(bytesName, "UTF-8"), age);
    }
}
