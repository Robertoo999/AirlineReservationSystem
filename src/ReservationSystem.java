public class ReservationSystem {
    public static boolean checkIfSeatIsReserved(Airplane airplane,int columns,int rows)
    {
        if(airplane.getColumns()<columns || airplane.getRows()<rows)
        {
            throw new RuntimeException("Such a seat doesnt exist.");
        }

        if(airplane.getSeats().get(columns-1).get(rows-1).isFree())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void reserveSeat(Airplane airplane,int columns,int rows)
    {
        if(airplane.getColumns()<columns || airplane.getColumns()<rows)
        {
            System.out.println("Such a seat doesnt exist.");
            System.exit(0);
        }


        if(airplane.getSeats().get(columns-1).get(rows-1).isFree())
        {
            airplane.getSeats().get(columns-1).get(rows-1).setFree(false);
            System.out.println("Congratulations, you just booked your seat.");
        }
        else
        {
            System.out.println("This seat is not free.");
        }
    }
}
