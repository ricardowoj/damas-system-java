package damas.pieces;

import boadgame.Board;
import damas.Color;
import damas.DamasPiece;

public class Stone extends DamasPiece {

    public Stone(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "D";
    }
}
