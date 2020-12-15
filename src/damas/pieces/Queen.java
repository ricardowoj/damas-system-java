package damas.pieces;

import boardgame.Board;
import damas.Color;
import damas.DamasPiece;

public class Queen extends DamasPiece {

    public Queen(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "Q";
    }
}
