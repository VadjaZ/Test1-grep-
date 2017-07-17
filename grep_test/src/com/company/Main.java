package com.company;

import java.io.IOException;

public class Main {

    static String smText = null;
    static String smWRDToFnd = null;

    public static void main(String[] args) throws IOException {
        smWRDToFnd = RdngWrdtoFnd.ReadWRD();

        Menu nwMenu = new Menu();
        smText=nwMenu.ChoiseMenu(smWRDToFnd);

        Output prntText = new Output();
        prntText.printText(smText);

    }
}
