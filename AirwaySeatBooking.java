import java.util.Scanner;

// CLASS TO DISPLAY SEAT ARRANGEMENT AND BOOK SEATS FOR AIRWAY
class AirwaySeatBooking extends SeatBooking {

    @Override
    void displaySeats() {

        int[][] airwaySeat = new int[10][8];
        int k = 1;

        // Assign seat numbers
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                airwaySeat[i][j] = k++;
            }
        }

        // Display layout
        System.out.printf(
                "%-4s%-4s%-4s%8s%-4s%-4s%8s%-4s%-8s%4s",
                "W", "", "", "", "", "", "", "", "", "W");

        System.out.println();

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 8; j++) {

                System.out.printf("%-4d", airwaySeat[i][j]);

                if (j == 2 || j == 4) {
                    System.out.printf("     ");
                }
            }

            System.out.println();
        }
    }
        // Book seat for airway journey
    @Override
    int bookSeat(Scanner sc, String name) {

        while (true) {

            System.out.print("Enter the seat number you want to book: ");
            int seatNo = sc.nextInt();
            sc.nextLine();

            if (seatNo < 1 || seatNo > 80) {

                System.out.println(
                        "Invalid seat number. Please select a seat number between 1 and 80.");

            } else if (bookedSeats.contains(seatNo)) {

                System.out.println("Seat number " + seatNo + " is already booked.");

            } else {

                bookedSeats.add(seatNo);

                System.out.println(
                        "Seat number " + seatNo + " has been booked for " + name + ".");

                return seatNo;
            }
        }
    }
}