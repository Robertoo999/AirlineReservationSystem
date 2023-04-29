public class Main {
    public static void main(String[] args) {
        Airplane airplane = new Airplane(10, 10, Classes.SECOND);
        airplane.fillSeats();
        airplane.showBetterSeats();
        ReservationSystem.reserveSeat(airplane,4,5);
        airplane.showBetterSeats();




    }
}