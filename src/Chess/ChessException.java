package Chess;

import boardgame.BoardExcepetion;

public class ChessException extends BoardExcepetion{
    private static final long serialVersionUID = 1L;

    public ChessException(String msg) {
        super(msg);
    }
}