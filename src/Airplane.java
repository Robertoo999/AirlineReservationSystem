import java.util.ArrayList;
import java.util.List;

public class Airplane {
    private final int rows;
    private int columns;

    private Classes classes;
    private final List<List<Seat>> seats;


    public Airplane(int columns, int rows, Classes classes) {
        this.rows = rows;
        this.columns = columns;
        this.classes = classes;
        seats = new ArrayList<>();
    }

    public void fillSeats() {
        for (int i = 0; i < rows; i++) {
            seats.add(new ArrayList<>());
            for (int j = 0; j < columns; j++) {

                if (j == 0 || j == columns - 1)
                    seats.get(i).add(new Seat(this.classes.prize+5, i + 1, j + 1));
                else
                    seats.get(i).add(new Seat(this.classes.prize, i + 1, j + 1));
            }
        }
    }


    public void showSeats() {
        for (List<Seat> s : seats) {
            for (Seat ss : s) {
                System.out.print(ss + " ");
            }
            System.out.println();
        }
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    public List<List<Seat>> getSeats() {
        return seats;
    }
}

