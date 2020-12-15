package damas;

import boardgame.Board;
import damas.pieces.Stone;

public class DamasMatch {

    private Board board;

    public DamasMatch() {
        board = new Board(8, 8);
        initialSetup();
    }

    public DamasPiece[][] getPieces() {
        DamasPiece[][] mat = new DamasPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                mat[i][j] = (DamasPiece) board.piece(i, j);
            }
        }
        return mat;
    }

    private void placeNewPiece(char column, int row, DamasPiece piece) {
        board.placePiece(piece, new DamasPosition(column, row).toPosition());
    }

    private void initialSetup() {
        placeNewPiece('a', 2, new Stone(board, Color.WHITE));
        placeNewPiece('b', 2, new Stone(board, Color.WHITE));
        placeNewPiece('c', 2, new Stone(board, Color.WHITE));
        placeNewPiece('d', 2, new Stone(board, Color.WHITE));
        placeNewPiece('e', 2, new Stone(board, Color.WHITE));
        placeNewPiece('f', 2, new Stone(board, Color.WHITE));
        placeNewPiece('g', 2, new Stone(board, Color.WHITE));
        placeNewPiece('h', 2, new Stone(board, Color.WHITE));

    }
}
