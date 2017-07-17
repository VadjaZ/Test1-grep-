package com.company;

import java.util.Scanner;

public class RdngWrdtoFnd {
    public static String ReadWRD() {
        String smWordToFind;
        Scanner scn = new Scanner(System.in);
        System.out.println("Insert word to find:\n");
        smWordToFind = scn.next();

        return smWordToFind;
    }
}
