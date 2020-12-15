package damas;

import boardgame.BoardException;

public class DamasException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public DamasException(String msg) {
        super(msg);
    }
}
