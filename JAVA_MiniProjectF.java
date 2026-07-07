import java.util.*;

public class JAVA_MiniProjectF {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PersonDetails dt = new PersonDetails();
        int noOfPassg = 0;

        System.out.println("=============== Welcome to E-Ticket Booking Platform ===============");

        while (true) {
            try {
                System.out.print("\n\nEnter number of passengers: ");
                noOfPassg = sc.nextInt();

                if (noOfPassg <= 0) {
                    System.out.println("Please enter a valid number greater than 0.");
                    continue;
                }

                break;

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number.");
                sc.nextLine();
            }
        }

        int day = 0, month = 0, year = 0;

        while (true) {

            System.out.print("Enter Day: ");
            day = sc.nextInt();

            System.out.print("Enter Month: ");
            month = sc.nextInt();

            System.out.print("Enter Year: ");
            year = sc.nextInt();

            if (day < 1 || day > 31 || month < 1 || month > 12) {
                System.out.println("Invalid date! Please enter again.\n");
            } else {
                break;
            }
        }

        sc.nextLine();

        String journeyDate = day + "/" + month + "/" + year;

        System.out.println("Journey Date: " + journeyDate);

        System.out.println("\nSelect Time Slot:");
        System.out.println("1. Morning (6AM - 12PM)");
        System.out.println("2. Afternoon (12PM - 6PM)");
        System.out.println("3. Evening (6PM - 12AM)");
        System.out.println("4. Night (12AM - 6AM)");

        int timeChoice;
        String journeyTime = "";

        while (true) {

            System.out.print("Enter choice (1-4): ");
            timeChoice = sc.nextInt();

            switch (timeChoice) {

                case 1:
                    journeyTime = "Morning (6AM - 12PM)";
                    break;

                case 2:
                    journeyTime = "Afternoon (12PM - 6PM)";
                    break;

                case 3:
                    journeyTime = "Evening (6PM - 12AM)";
                    break;

                case 4:
                    journeyTime = "Night (12AM - 6AM)";
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
                    continue;
            }

            break;
        }

        sc.nextLine();

        System.out.println("Selected Time: " + journeyTime);

        // ---------------- PASSENGER DETAILS ----------------

        for (int i = 0; i < noOfPassg; i++) {

            System.out.println("\n\nAdd details of Passenger " + (i + 1));

            System.out.print("\nEnter Passenger Name: ");
            String passName = sc.nextLine();

            String passGender;

            do {

                System.out.print("Enter Passenger's Gender [Female/Male]: ");
                passGender = sc.nextLine();

                if (!(passGender.equalsIgnoreCase("Male")
                        || passGender.equalsIgnoreCase("Female"))) {

                    System.out.println("Invalid input! Please enter Male or Female.");
                }

            } while (!(passGender.equalsIgnoreCase("Male")
                    || passGender.equalsIgnoreCase("Female")));

            System.out.print("Enter Passenger's Age: ");
            int passAge = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Passenger's Contact Number: ");
            String passContact = sc.nextLine();

            String passOccupation;

            do {

                System.out.print("Enter Passenger's Occupation [Student/Other]: ");
                passOccupation = sc.nextLine();

                if (!(passOccupation.equalsIgnoreCase("Student")
                        || passOccupation.equalsIgnoreCase("Other"))) {

                    System.out.println("Invalid input! Please enter Student or Other.");
                }

            } while (!(passOccupation.equalsIgnoreCase("Student")
                    || passOccupation.equalsIgnoreCase("Other")));

            String passTripType;

            do {

                System.out.print("Enter Trip Type [One Way/Round Trip]: ");
                passTripType = sc.nextLine();

                if (!(passTripType.equalsIgnoreCase("One Way")
                        || passTripType.equalsIgnoreCase("Round Trip"))) {

                    System.out.println("Invalid input! Please enter One Way or Round Trip.");
                }

            } while (!(passTripType.equalsIgnoreCase("One Way")
                    || passTripType.equalsIgnoreCase("Round Trip")));

            dt.addDetails(
                    passName,
                    passAge,
                    passContact,
                    passGender,
                    passOccupation,
                    passTripType,
                    journeyDate,
                    journeyTime
            );
        }

        // ---------------- DESTINATION ----------------

        DestinationDetails dd = new DestinationDetails();
        dd.destinationDetails();

        SelectDestination sd = new SelectDestination();
        sd.availabledestinations();

        FareCalculation fc = new FareCalculation();

        String destination = sd.selectDestination(sc);
        String mode = sd.selectTransport(sc, destination, fc);

        System.out.println("\n\n-----Below is the reference of seat arrangement-----\n");

        BusSeatBooking bs = new BusSeatBooking();
        TrainSeatBooking ts = new TrainSeatBooking();
        AirwaySeatBooking as = new AirwaySeatBooking();

        AddOnService addOn = new AddOnService();
        TicketSummary t = new TicketSummary();

        int choice = 0;

        if (mode.equalsIgnoreCase("Bus")) {
            choice = 1;
        } else if (mode.equalsIgnoreCase("Train")) {
            choice = 2;
        } else if (mode.equalsIgnoreCase("Airway")) {
            choice = 3;
        }

        double totalFare = 0;
                switch (choice) {

            case 1:

                bs.displaySeats();

                for (int i = 0; i < noOfPassg; i++) {
                    bs.bookSeat(sc, dt.name.get(i));
                }

                totalFare = fc.calculateTotalBusFare(dt, destination);
                totalFare += addOn.selectBusAddOns(sc, noOfPassg);

                t.showSummary(dt, noOfPassg, destination, mode, totalFare);

                break;

            case 2:

                ts.displaySeats();

                for (int i = 0; i < noOfPassg; i++) {
                    ts.bookSeat(sc, dt.name.get(i));
                }

                totalFare = fc.calculateTotalTrainFare(dt, destination);
                totalFare += addOn.selectTrainAddOns(sc, noOfPassg);

                t.showSummary(dt, noOfPassg, destination, mode, totalFare);

                break;

            case 3:

                as.displaySeats();

                for (int i = 0; i < noOfPassg; i++) {
                    as.bookSeat(sc, dt.name.get(i));
                }

                totalFare = fc.calculateTotalAirwayFare(dt, destination);
                totalFare += addOn.selectAirwayAddOns(sc, noOfPassg);

                System.out.println("\nTotal Fare for Airway Journey: Rs." + totalFare);

                t.showSummary(dt, noOfPassg, destination, mode, totalFare);

                break;

            default:

                System.out.println("Invalid Choice");
                break;
        }

        System.out.print("Do you want to cancel any ticket? (yes/no): ");
        String ch = sc.nextLine();

        if (ch.equalsIgnoreCase("yes")) {

            System.out.print("Enter name of passenger for ticket cancellation: ");
            String name = sc.nextLine();

            TicketCancellation tc = new TicketCancellation();
            tc.cancelTicket(dt, name);

        } else {

            System.out.println("No ticket cancelled.");
        }

        sc.close();
    }
}