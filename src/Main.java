public class Main {
    public static void main(String[] args) {
        Airplane airplane = new Airplane(3, 3, Classes.SECOND);
        airplane.fillSeats();
        airplane.showSeats();
        System.out.println(ReservationSystem.checkIfSeatIsFree(airplane,3,3));
        ReservationSystem.reserveSeat(airplane,3,3);
        airplane.showSeats();
        ReservationSystem.removeReservation(airplane,3,3);
        airplane.showSeats();



    }
}