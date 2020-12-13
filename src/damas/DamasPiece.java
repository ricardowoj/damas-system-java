package damas;

import boadgame.Board;
import boadgame.Piece;

public class DamasPiece extends Piece {

    private Color color;

    public DamasPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
