package com.company;

import java.io.IOException;

public class Main {

    static String smText = null;
    static String smWRDToFnd = null;
    static String choise = null;

    public static void main(String[] args) throws IOException {
        smWRDToFnd = ReadingWordToFind.readWord();

        Menu nwMenu = new Menu();
        choise = nwMenu.choiseMenu();

        ParserBuilder parsB = new ParserBuilder();
        smText = parsB.parserBuild(choise, smWRDToFnd);

        Output prntText = new Output();
        prntText.printText(smText);

    }
}
