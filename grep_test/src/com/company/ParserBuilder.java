package com.company;

/**
 * Created by Admin on 18.07.2017.
 */
public class ParserBuilder {
    String findTXT=null;
    public String parserBuild(String choise, String someWord ){
        if (choise.equals("1"))  {
            Parser consolePars = new ConsoleParser();
            findTXT=consolePars.scanText(someWord);
        }
        else {
            Parser filePars = new FileParser();
            findTXT=filePars.scanText(someWord);
        }
        return findTXT;
    }
}
