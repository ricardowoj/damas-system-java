package application;

import damas.DamasMatch;

public class Program {

    public static void main(String[] args) {

        DamasMatch damasMatch = new DamasMatch();
        UI.printBoard(damasMatch.getPieces());
    }
}
