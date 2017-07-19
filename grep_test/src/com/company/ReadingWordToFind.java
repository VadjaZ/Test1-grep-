package com.company;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class ReadingWordToFind {
    public static String readWord() {
        Scanner scn = new Scanner(in);
        out.println("Insert word to find:\n");
        String someWordToFind = scn.next();

        return someWordToFind;
    }
}
