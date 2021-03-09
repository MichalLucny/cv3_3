package sk.stuba.fei.uim.oop.board;

import sk.stuba.fei.uim.oop.utility.Randomizer;

public class Board {
    public Field[][] playingBoard;

    private static final double PROBABILITY = 0.156;

    private static final int BOARD_SIZE = 12;

    public Board (){
        playingBoard = new Field[BOARD_SIZE][BOARD_SIZE];
        generateBoard(BOARD_SIZE);
    }

    private void generateBoard(int size){
        for (int i = 0;i<BOARD_SIZE;i++)
        {
            for (int j =0; j<BOARD_SIZE;j++)
            {
                playingBoard[i][j].bomb= Randomizer.getRandomBoolean(PROBABILITY);
            }
        }



            for (int j =0; j<BOARD_SIZE;j++)
            {

            }


    }

    private int checkNearby(int row, int column){
//        this.playingBoard[row][column].nearby
             int whatFieldIsThis;
            /*
            * 0 - middle
            * 1 - corner; upper left
            * 2 - corner; upper right
            * 3 - corner; lower right
            * 4 - corner; lower left
            * 5 - edge; upper
            * 6 - edge; right
            * 7 - edge; lower
            * 8 - edge; left
            * */
            if (column -1<0 && row-1<0) {
                whatFieldIsThis = 1;
            }
            else if(column +1==BOARD_SIZE && row-1<0){
                whatFieldIsThis = 2;
            }else if (column+1==BOARD_SIZE && row + 1 == BOARD_SIZE){
                whatFieldIsThis = 3;
            }else if (column-1<0 && row + 1 == BOARD_SIZE){
                whatFieldIsThis = 4;
            }else if (row-1<0){
                whatFieldIsThis = 5;
            }else if (column+1==BOARD_SIZE){
                whatFieldIsThis=6;
            }else if (row+1==BOARD_SIZE){
                whatFieldIsThis=7;
            }else if (column-1<0){
                whatFieldIsThis=8;
            }else{
                whatFieldIsThis=0;
            }

          switch (whatFieldIsThis){
              case 0: return (checkNearbyMiddle(row, column));break;
              case 1:
          }


    }

    private int checkNearbyMiddle (int row, int column){
        int amount = 0;

        amount = amount + checkNearbyUtilUpperRow(row, column);


        return (amount);
    }


    private int checkNearbyUtilUpperRow(int row, int column){
        int k;
        k = checkNearbyUtilDiagonalUpLeftField(row, column)+checkNearbyUtilDiagonalUpRightField(row,column)+checkNearbyUtilMiddleUpField(row, column);
        return(k);
    }

    private int checkNearbyUtilLowerRow (int row, int column){
       int k;
       k=checkNearbyUtilDiagonalDownLeftField(row,column)+checkNearbyUtilMiddleDownField(row, column)+checkNearbyUtilDiagonalDownRightField(row, column);
        return(k);
    }

    private int checkNearbyUtilLeftColumn (int row, int column){
        int k;
        k=checkNearbyUtilDiagonalDownLeftField(row,column)+checkNearbyUtilMiddleLeftField(row, column)+checkNearbyUtilDiagonalUpLeftField(row, column);
        return(k);
    }

    private int checkNearbyUtilLeftColumn (int row, int column){
        int k;
        k=checkNearbyUtilDiagonalDownLeftField(row,column)+checkNearbyUtilMiddleLeftField(row, column)+checkNearbyUtilDiagonalUpLeftField(row, column);
        return(k);
    }

    private int checkNearbyUtilMiddleUpField(int row, int column){

        if (this.playingBoard[row-1][column].bomb)
            return(1);
        else return (0);

    }

    private int checkNearbyUtilMiddleDownField(int row, int column){

        if (this.playingBoard[row+1][column].bomb)
            return(1);
        else return (0);

    }

    private int checkNearbyUtilMiddleRightField(int row, int column){

        if (this.playingBoard[row][column+1].bomb)
            return(1);
        else return (0);
    }

    private int checkNearbyUtilMiddleLeftField(int row, int column){

        if (this.playingBoard[row][column-1].bomb)
            return(1);
        else return (0);
    }

    private int checkNearbyUtilDiagonalDownRightField(int row, int column){

        if (this.playingBoard[row+1][column+1].bomb)
            return(1);
        else return (0);
    }
    private int checkNearbyUtilDiagonalDownLeftField(int row, int column){

        if (this.playingBoard[row+1][column].bomb)
            return(1);
        else return (0);
    }

    private int checkNearbyUtilDiagonalUpRightField(int row, int column){

        if (this.playingBoard[row-1][column+1].bomb)
            return(1);
        else return (0);
    }

    private int checkNearbyUtilDiagonalUpLeftField(int row, int column){

        if (this.playingBoard[row-1][column-1].bomb)
            return(1);
        else return (0);
    }






}
