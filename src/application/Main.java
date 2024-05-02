package application;

import boardgame.Board;
import boardgame.Position;

public class Main {
    public static void main(String[] args) {

        Position pos = new Position(1, 5);
        System.out.println(pos);

        Board board = new Board(10, 10);
        System.out.println(board.getRows() +" " + board.getColumns());
    }
}