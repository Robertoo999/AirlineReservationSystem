public class Airplane {
    private int rows;
    private int columns;

    private Classes classes;
   private  Seat [][] seats;

    public Airplane(int columns,int rows,Classes classes) {
        this.rows=rows;
        this.columns=columns;
        this.classes=classes;
        seats = new Seat[rows][columns];
    }

    public void fillSeats()
    {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                switch(this.classes)
                {
                    case FIRST -> {
                        if (j == 0 || j == columns-1)
                            seats[i][j] = new Seat(30 + 5, i + 1, j + 1);
                        else
                            seats[i][j] = new Seat(30, i + 1, j + 1);
                    }

                    case SECOUND -> {
                        if (j == 0 || j == columns-1)
                            seats[i][j] = new Seat(20 + 5, i + 1, j + 1);
                        else
                            seats[i][j] = new Seat(20, i + 1, j + 1);
                    }

                    case THIRD -> {
                        if (j == 0 || j == columns-1)
                            seats[i][j] = new Seat(10 + 5, i + 1, j + 1);
                        else
                            seats[i][j] = new Seat(10, i + 1, j + 1);
                    }
                }

            }
        }
    }

    public void showSeats()
    {
        for (Seat[] s: seats)
        {
            for (Seat ss : s)
            {
                System.out.print(ss+" ");
            }
            System.out.println();
        }
    }
    public void checkIfSeatIsReserved(int columns,int rows)
    {
        if(this.columns<columns || this.rows<rows)
        {
            System.out.println("Such a seat doesnt exist.");
            System.exit(0);
        }

        if(seats[columns-1][rows-1].isFree())
        {
            System.out.println("This seat is free.");
        }
        else
        {
            System.out.println("This seat is not free.");
        }
    }
    public void reserveSeat(int columns,int rows)
    {
        if(this.columns<columns || this.rows<rows)
        {
            System.out.println("Such a seat doesnt exist.");
            System.exit(0);
        }


        if(seats[columns-1][rows-1].isFree())
        {
            seats[columns-1][rows-1].setFree(false);
            System.out.println("Congratulations, you just booked your seat.");
        }
        else
        {
            System.out.println("This seat is not free.");
        }
    }
}
