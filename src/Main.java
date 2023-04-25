public class Main {
    public static void main(String[] args) {
        Airplane airplane = new Airplane(4, 4, Classes.SECOUND);
        airplane.fillSeats();
        airplane.showSeats();
        airplane.checkIfSeatIsReserved(4,4);
        airplane.reserveSeat(4,4);
        airplane.reserveSeat(4,4);
        airplane.showSeats();


    }
}