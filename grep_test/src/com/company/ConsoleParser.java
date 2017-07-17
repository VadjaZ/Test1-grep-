package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Admin on 16.07.2017.
 */
public class ConsoleParser implements Parser {
    static String text = "";

    @Override
    public String ScanText(String smWRD) {

        String smWordToFind=smWRD;
        String text = null;
        String smText = null;
        System.out.println("Insert some text: ");
        BufferedReader bfrRdr = new BufferedReader(new InputStreamReader(System.in));
        try {
            while ((smText = bfrRdr.readLine()) != null) {
                if (smText.contains(smWordToFind)) {
                    text += smText + "\n";
                }
            }
            if(text==null){
                    System.out.println("There are no words like this :( ");
            }
        }
            catch (IOException ex) {
            System.out.println(ex.getMessage());
                try {
                    bfrRdr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        return text;
    }
}