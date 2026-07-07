import java.util.Scanner;

// CLASS TO DISPLAY SEAT ARRANGEMENT AND BOOK SEATS FOR BUS
class BusSeatBooking extends SeatBooking {

    // Display seat arrangement
    @Override
    void displaySeats() {

        int[][] busSeat = new int[8][4];
        int k = 1;

        // Assign seat numbers
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 4; j++) {
                busSeat[i][j] = k++;
            }
        }

        // Display layout
        System.out.printf("%-5s%-5s%8s%-5s%-5s%n", "W", "", "", "", "W");

        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 4; j++) {

                System.out.printf("%-5d", busSeat[i][j]);

                if (j == 1) {
                    System.out.printf("%8s", "");
                }
            }

            System.out.println();
        }
    }

    // Book Seat
    @Override
    int bookSeat(Scanner sc, String name) {

        while (true) {

            System.out.print("Enter the seat number you want to book: ");
            int seatNo = sc.nextInt();
            sc.nextLine();

            if (seatNo < 1 || seatNo > 32) {

                System.out.println(
                        "Invalid seat number. Please select a seat number between 1 and 32.");

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
