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

    public void setStatusNumber(){
        this.status = (char) (this.getNearby()+'0');
    }
    public void flagThisField(){
        if (this.getStatus()==FLAG)
            setStatusSquare();
        else
            setStatusFlag();
    }

    public void popThisField(){
        if (this.isFlag()==false) {
          if (this.isBomb()!=true)
              this.setStatusNumber();
           else
              this.setStatusMine();

        }
    }


    public char getStatus(){
        return(status);
    }

    public boolean getBomb(){
        return (bomb);
    }

    public boolean isFlag(){
        if (this.getStatus()==FLAG) return (true);
        else
            return (false);
    }

    public boolean didExplode(){
        if (this.getStatus()==MINE) return (true);
        else
            return (false);
    }

    public boolean isBomb(){
        return(this.getBomb());
    }

    public int getNearby(){
        return(nearby);
    }


}

