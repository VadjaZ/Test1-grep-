package com.company;


import java.util.Scanner;

/**
 * Created by Admin on 17.07.2017.
 */
public class Menu {

    public String choiseMenu() {
        String choise;
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please, chose the way for inserting text: \n" +
                "Press 1 -Insert text to console;\n" +
                "Press 2 -Load from file.");
        choise = scnr.next();
        return  choise;
    }
}
