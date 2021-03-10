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
       this(false);
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

    public void setStatusPop(){
        this.status = (char) (this.getNearby()+'0');
    }

    public char getStatus(){
        return(status);
    }

    public boolean getBomb(){
        return (bomb);
    }

    public int getNearby(){
        return(nearby);
    }
}

