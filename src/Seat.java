public class Seat {
    private int prize;
    private int row;
    private int column;
    private boolean isFree=true;

    public Seat(int prize, int row, int column) {
        this.prize = prize;
        this.row = row;
        this.column = column;
    }

    @Override
    public String toString() {
        return "Row="+row+" , column="+column+" , prize="+prize+" , isFree="+isFree+ " |";
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }
}
