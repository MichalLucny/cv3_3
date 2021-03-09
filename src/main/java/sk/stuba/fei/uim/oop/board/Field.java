package sk.stuba.fei.uim.oop.board;

public class Field {
   public char status;
   public boolean bomb;
   public int nearby;

   private static final char SQUARE = '\u25A1';
   private static final char MINE = '*';
   private static final char FLAG = '\u25B2';

    public Field(boolean bomb){
        setStatusSquare();
        this.bomb = bomb;
        this.nearby = 0;
    }

    public Field(){
       this(0);
    }

    public void setStatusSquare(){
        this.status = SQUARE;
    }

    public void setStatusMine(){
        this.status = MINE;
    }

    public void setStatusFlag(){
        this.status = FLAG;
    }

    public char getStatus(){
        return(status);
    }

    public boolean getBomb(){
        return (bomb);
    }

}

