package by.javaminsk;


import static by.javaminsk.service.CheckErrors.checkError;
import static by.javaminsk.service.CheckErrors.printText;

public class Launch_2 {

    public static void main(String[] args) {
        String inputText = "";

        String outputText = checkError(inputText);

        printText(outputText);
    }


}
