package damas;

import boadgame.Board;
import boadgame.Position;
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

    private void initialSetup() {
        for (int i = 0; i < 8; i++) {
            board.placePiece(new Stone(board, Color.WHITE), new Position(i, i));
        }
    }
}
