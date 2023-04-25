public class ReservationSystem {
    public static boolean checkIfSeatIsFree(Airplane airplane, int columns, int rows) {
        if (airplane.getColumns() < columns || airplane.getRows() < rows) {
            throw new RuntimeException("Such a seat doesnt exist.");
        }

        return airplane.getSeats().get(columns - 1).get(rows - 1).isFree();
    }

    public static void reserveSeat(Airplane airplane, int columns, int rows) {
        if (airplane.getColumns() < columns || airplane.getColumns() < rows) {

            throw new RuntimeException("Such a seat doesnt exist.");

        }


        if (airplane.getSeats().get(columns - 1).get(rows - 1).isFree()) {
            airplane.getSeats().get(columns - 1).get(rows - 1).setFree(false);
            System.out.println("Congratulations, you just booked your seat.");
        } else {
            System.out.println("This seat is not free.");
        }
    }

    public static void removeReservation(Airplane airplane, int column, int row) {

        if (airplane.getColumns() < column || airplane.getColumns() < row) {

            throw new RuntimeException("Such a seat doesnt exist.");

        }
        if(!airplane.getSeats().get(column-1).get(row-1).isFree())
        {
            airplane.getSeats().get(column-1).get(row-1).setFree(true);
            System.out.println("Congratulations, you just removed your reservation.");
        }
        else
        {
            System.out.println("This seat is not reserved.");
        }
    }
}
