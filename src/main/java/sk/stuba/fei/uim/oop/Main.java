package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.board.Board;
import sk.stuba.fei.uim.oop.utility.KeyboardInput;

public class Main {
    public static void main(String[] args) {
        Board desktop = new Board();
        char readValue;
        int[] rowColumn = new int[2];

        do {
            printDesktop(desktop);

           readValue = KeyboardInput.readChar("\nInsert command: \n P - click on a field, F - flag a field, Q - quit");

            switch (readValue){
                case 'q':
                case 'Q':desktop.explode();break;
                case 'f':
                case 'F': {
                    rowColumn = askForCoordinates();
                    desktop.flagField(rowColumn[0],rowColumn[1]);
                }break;
                case 'p':
                case 'P':{
                    rowColumn = askForCoordinates();
                    desktop.clickField(rowColumn[0],rowColumn[1]);
                }break;
                default: {
                    System.out.println("Unknown command!");
                }break;
            }

        }while(desktop.isExploded()==false||desktop.isSolved()==true);


            printDesktop(desktop);

        if (desktop.isSolved()==true)
        System.out.println("Congratulations! Game solved!");
        else
            System.out.println("Game over!");


    }

    public static void printDesktop(Board desktop){

        System.out.print("XX ");
        for (int j = 0; j < Board.BOARD_SIZE; j++) {
            System.out.print(j);
        }
        System.out.println("\n");

        for (int i = 0; i < Board.BOARD_SIZE; i++) {
            System.out.print(String.format("%02d ",i));
            for (int j = 0; j < Board.BOARD_SIZE; j++) {
                System.out.print(desktop.playingBoard[i][j].getStatus());
            }
            System.out.println();
        }
    }

    public static int[] askForCoordinates ()
    {
        int[] data=new int[2];
        data[0] = KeyboardInput.readInt("Insert row");
        data[1] = KeyboardInput.readInt("Insert column");

    return(data);
    }

}
