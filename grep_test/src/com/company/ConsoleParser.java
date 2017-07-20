package com.company;

import java.util.Scanner;

/**
 * Created by Admin on 16.07.2017.
 */
public class ConsoleParser implements Parser {

    @Override
    public String scanText(String someWord) {

        String text = "";
        String smText;
        System.out.println("Insert some text: ");
        Scanner scanner = new Scanner(System.in);
        while (!(smText = scanner.nextLine()).equals("")) {
            if (smText.contains(someWord)) text += smText + "\n";
        }
        scanner.close();
        if (text.equals("")) {
            System.out.println("There are no words like this :( ");
        }
        return text;
    }
}