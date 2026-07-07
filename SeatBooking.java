import java.util.ArrayList;
import java.util.Scanner;

// ABSTRACT CLASS FOR SEAT BOOKING
abstract class SeatBooking {

    // Stores booked seat numbers
    ArrayList<Integer> bookedSeats = new ArrayList<>();

    abstract void displaySeats();

    abstract int bookSeat(Scanner sc, String name);
}
