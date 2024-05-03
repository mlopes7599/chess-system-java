package boardgame;

import chess.Color;

import java.util.List;

public class Piece {

    protected Position position;
    private Board board;
    private Color color;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    protected Board getBoard() {
        return board;
    }
}