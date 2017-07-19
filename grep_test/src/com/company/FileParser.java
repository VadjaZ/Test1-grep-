package com.company;

/**
 * Created by Admin on 16.07.2017.
 */

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileParser implements Parser {
    static String path = "D:\\Навчання\\Різне\\Calc.txt";
    static String smText = null;
    static String text = null;

    @Override
    public String scanText(String smWRD) {
        try (FileInputStream inptText = new FileInputStream(path)) {
            BufferedReader bfrRdr = new BufferedReader(new InputStreamReader(inptText));
            while ((smText = bfrRdr.readLine()) != null) {
                if (smText.contains(smWRD)) {
                    text += smText + "\n";
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        if (text == null) {
            System.out.println("Can`t find this word");
        }
        return text;
    }
}


