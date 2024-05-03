package application;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;

import java.rmi.server.UID;

public class Main {
    public static void main(String[] args) {

        //Position pos = new Position(1, 5);
        //System.out.println(pos);

        //Board board = new Board(8, 8);
        //System.out.println(board.getRows() +" " + board.getColumns());

        ChessMatch cm = new ChessMatch();

        UI.printBoard(cm.getPieces());
    }
}