package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.board.Board;

public class Main {
    public static void main(String[] args) {
        Board desktop = new Board();

        for (int i = 0;i<Board.BOARD_SIZE;i++)
        {
            for (int j =0; j<Board.BOARD_SIZE;j++)
            {
                System.out.print(desktop.playingBoard[i][j].getNearby());
            }
            System.out.println();
        }

        for (int i = 0;i<Board.BOARD_SIZE;i++)
        {
            for (int j =0; j<Board.BOARD_SIZE;j++)
            {
                System.out.print(desktop.playingBoard[i][j].getBomb());
            }
            System.out.println();
        }
    }
}
