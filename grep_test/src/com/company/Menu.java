package com.company;


import java.util.Scanner;

/**
 * Created by Admin on 17.07.2017.
 */
public class Menu {
    String FindTXT=null;
    public String ChoiseMenu(String smWrd) {

        String choise = null;
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please, chose the way for inserting text: \n" +
                "Press 1 -Insert text to console;\n" +
                "Press 2 -Load from file.");
        choise = scnr.next();
        if (choise.equals("1"))  {
            Parser consolePars = new ConsoleParser();
            FindTXT=consolePars.ScanText(smWrd);
        }
        else {
            Parser filePars = new FileParser();
            FindTXT=filePars.ScanText(smWrd);
        }
        return  FindTXT;
    }
}
