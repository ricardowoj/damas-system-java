package application;

import damas.DamasPiece;

public class UI {

    public static void printBoard(DamasPiece[][] pieces) {
        System.out.println();
        System.out.println(" ___________________________________________");
        System.out.println("|         DAMA GAME - 2020 // By RW         |");

        for (int i = 0; i < 2; i++) {
            System.out.println("|             " +
                    "                              |");
        }

        for (int i=0; i<pieces.length; i++) {
            System.out.print("|   " + (8 - i) + "   ");
            for (int j=0; j<pieces.length; j++) {
                printPiece(pieces[i][j]);
            }
            System.out.println("    |");
            System.out.println("|                                           |");
        }
        System.out.println("|       a   b   c   d   e   f   g   h       |");
        System.out.println("|___________________________________________|");
    }

    private static void printPiece(DamasPiece piece) {
        if (piece == null) {
            System.out.print("-");
        }
        else {
            System.out.print(piece);
        }
        System.out.print("   ");
    }
}
