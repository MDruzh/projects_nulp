package ua.lviv.iot;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        StringProcessor stringProcessor = new StringProcessor();

        String inputString = stringProcessor.readInputText();
        String resultText = stringProcessor.processText(inputString);
        stringProcessor.showResults(resultText);
    }
}