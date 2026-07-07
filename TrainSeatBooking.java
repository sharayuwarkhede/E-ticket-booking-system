import java.util.Scanner;

// CLASS TO DISPLAY SEAT ARRANGEMENT AND BOOK SEATS FOR TRAIN
class TrainSeatBooking extends SeatBooking {

    // Display Train Seat Arrangement
    @Override
    void displaySeats() {

        int[][] trainSeat = new int[12][6];
        int k = 1;

        // Assign seat numbers
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 6; j++) {
                trainSeat[i][j] = k++;
            }
        }

        // Display layout
        System.out.printf("%-4s%-4s%-8s%-4s%-4s%n",
                "L", "U", "", "L", "U");

        System.out.println();

        for (int i = 0; i < 12; i++) {

            for (int j = 0; j < 6; j++) {

                System.out.printf("%-4d", trainSeat[i][j]);

                if (j == 2) {
                    System.out.printf("     ");
                }
            }

            System.out.println();
        }
    }

    // Book Train Seat
    @Override
    int bookSeat(Scanner sc, String name) {

        while (true) {

            System.out.print("Enter the seat number you want to book: ");
            int seatNo = sc.nextInt();
            sc.nextLine();

            if (seatNo < 1 || seatNo > 72) {

                System.out.println(
                        "Invalid seat number. Please select a seat number between 1 and 72.");

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
