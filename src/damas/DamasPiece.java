package damas;

import boardgame.Board;
import boardgame.Piece;

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
