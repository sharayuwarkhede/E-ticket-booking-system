import java.util.Scanner;

// CLASS TO SELECT DESTINATION AND MODE OF TRANSPORTATION
class SelectDestination extends DestinationDetails {

    String selectDestination(Scanner sc) {

        System.out.print("\n\nEnter Destination: ");

        String destination = sc.nextLine().trim();

        destination = destination.substring(0, 1).toUpperCase()
                + destination.substring(1).toLowerCase();

        return destination;
    }

    String selectTransport(Scanner sc, String destination, FareCalculation fc) {

        boolean busAvailable = false;
        boolean trainAvailable = false;
        boolean airwayAvailable = false;

        System.out.println("\n\nAvailable mode of transportation for "
                + destination + " is:");

        // Check Bus Availability
        for (int i = 0; i < busJourney.size(); i++) {

            if (destination.equals(busJourney.get(i))) {
                System.out.println("~ Bus Available");
                busAvailable = true;
            }
        }

        // Check Train Availability
        for (int i = 0; i < trainJourney.size(); i++) {

            if (destination.equals(trainJourney.get(i))) {
                System.out.println("~ Train Available");
                trainAvailable = true;
            }
        }

        // Check Airway Availability
        for (int i = 0; i < airwayJourney.size(); i++) {

            if (destination.equals(airwayJourney.get(i))) {
                System.out.println("~ Airway Available");
                airwayAvailable = true;
            }
        }

        int count = 0;

        if (busAvailable)
            count++;

        if (trainAvailable)
            count++;

        if (airwayAvailable)
            count++;

        int transportChoice = 0;
        String mode = "";

        // If only one transport is available
        if (count == 1) {

            if (busAvailable) {
                mode = "Bus";
                transportChoice = 1;
            } else if (trainAvailable) {
                mode = "Train";
                transportChoice = 2;
            } else {
                mode = "Airway";
                transportChoice = 3;
            }

            System.out.println("Automatically selected available mode.");

        } else {

            double busFare;
            double trainFare;
            double airwayFare;

            if (busAvailable)
                busFare = fc.calculateBusFare(destination);
            else
                busFare = -1;

            if (trainAvailable)
                trainFare = fc.calculateTrainFare(destination);
            else
                trainFare = -1;

            if (airwayAvailable)
                airwayFare = fc.calculateAirwayFare(destination);
            else
                airwayFare = -1;

            System.out.println();

            if (busAvailable)
                System.out.println("1. BUS (Fare: Rs." + busFare + ")");

            if (trainAvailable)
                System.out.println("2. TRAIN (Fare: Rs." + trainFare + ")");

            if (airwayAvailable)
                System.out.println("3. AIRWAY (Fare: Rs." + airwayFare + ")");

            System.out.println();

            // Display Cheapest Fare
            if (busFare != -1
                    && (trainFare == -1 || busFare < trainFare)
                    && (airwayFare == -1 || busFare < airwayFare)) {

                System.out.println("Bus fare is cheapest");

            } else if (trainFare != -1
                    && (busFare == -1 || trainFare < busFare)
                    && (airwayFare == -1 || trainFare < airwayFare)) {

                System.out.println("Train fare is cheapest");

            } else if (airwayFare != -1) {

                System.out.println("Airway fare is cheapest");
            }

            do {

                System.out.print("\nSelect mode of transportation: ");
                mode = sc.nextLine();

                if (!(mode.equalsIgnoreCase("Bus")
                        || mode.equalsIgnoreCase("Train")
                        || mode.equalsIgnoreCase("Airway"))) {

                    System.out.println("Invalid input!");
                }

            } while (!(mode.equalsIgnoreCase("Bus")
                    || mode.equalsIgnoreCase("Train")
                    || mode.equalsIgnoreCase("Airway")));
        }

        return mode;
    }
}