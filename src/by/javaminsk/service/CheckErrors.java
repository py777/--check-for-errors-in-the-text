package by.javaminsk.service;

/**
 * Created by kirzhanov on 10/20/15.
 */
public class CheckErrors {

    public static String checkError(String input){
        StringBuilder inputText = new StringBuilder(input);
        StringBuilder outputText = new StringBuilder();

        outputText = checkWrongSymbols(inputText);
        outputText = checkWrongLetters(outputText);
        outputText = checkUnicode(outputText);
        outputText = checkDuplicateLetters(outputText);
        outputText = checkPedovkaStyle(outputText);

        return outputText.toString();
    }

    static private StringBuilder checkWrongSymbols(StringBuilder inputText){
        StringBuilder outputText = inputText;

        return outputText;
    }

    static private StringBuilder checkWrongLetters(StringBuilder inputText){
        StringBuilder outputText = inputText;

        return outputText;
    }

    static private StringBuilder checkUnicode(StringBuilder inputText){
        StringBuilder outputText = inputText;

        return outputText;
    }

    static private StringBuilder checkDuplicateLetters(StringBuilder inputText){
        StringBuilder outputText = inputText;

        return outputText;
    }

    static private StringBuilder checkPedovkaStyle(StringBuilder inputText){
        StringBuilder outputText = inputText;

        return outputText;
    }

    static public void printText(String inputText){

    }

}
