import java.util.Scanner;

// CLASS FOR ADD-ON SERVICES
class AddOnService {

    // Method for selecting Bus Add-ons
    double selectBusAddOns(Scanner sc, int noOfPassg) {

        double totalCost = 0;

        for (int i = 0; i < noOfPassg; i++) {

            double cost = 0;

            System.out.println("\n--- BUS ADD-ONS for Passenger " + (i + 1) + " ---");

            System.out.print("Extra Luggage (Rs.200)? (yes/no): ");
            if (sc.nextLine().equalsIgnoreCase("yes")) {
                cost += 200;
            }

            System.out.print("Window Seat (Rs.100)? (yes/no): ");
            if (sc.nextLine().equalsIgnoreCase("yes")) {
                cost += 100;
            }

            System.out.print("Meal (Rs.150)? (yes/no): ");
            if (sc.nextLine().equalsIgnoreCase("yes")) {
                cost += 150;
            }

            System.out.print("Insurance (Rs.50)? (yes/no): ");
            if (sc.nextLine().equalsIgnoreCase("yes")) {
                cost += 50;
            }

            System.out.print("WiFi (Rs.80)? (yes/no): ");
            if (sc.nextLine().equalsIgnoreCase("yes")) {
                cost += 80;
            }

            totalCost += cost;
        }

        return totalCost;
    }

    // Method for selecting Train Add-ons
    double selectTrainAddOns(Scanner sc, int noOfPassg) {

        double totalCost = 0;

        for (int i = 0; i < noOfPassg; i++) {

            double cost = 0;

            System.out.println("\n--- TRAIN ADD-ONS for Passenger " + (i + 1) + " ---");

            System.out.print("Window Seat (Rs.100)? (yes/no): ");
            if (sc.nextLine().equalsIgnoreCase("yes")) {
                cost += 100;
            }

            System.out.print("Meal (Rs.150)? (yes/no): ");
            if (sc.nextLine().equalsIgnoreCase("yes")) {
                cost += 150;
            }

            System.out.print("Insurance (Rs.50)? (yes/no): ");
            if (sc.nextLine().equalsIgnoreCase("yes")) {
                cost += 50;
            }

            System.out.print("WiFi (Rs.80)? (yes/no): ");
            if (sc.nextLine().equalsIgnoreCase("yes")) {
                cost += 80;
            }

            totalCost += cost;
        }

        return totalCost;
    }

    // Method for selecting Airway Add-ons
    double selectAirwayAddOns(Scanner sc, int noOfPassg) {

        double totalCost = 0;

        for (int i = 0; i < noOfPassg; i++) {

            double cost = 0;

            System.out.println("\n--- AIRWAY ADD-ONS for Passenger " + (i + 1) + " ---");

            System.out.print("Extra Luggage (Rs.500)? (yes/no): ");
            if (sc.nextLine().equalsIgnoreCase("yes")) {
                cost += 500;
            }

            System.out.print("Window Seat (Rs.300)? (yes/no): ");
            if (sc.nextLine().equalsIgnoreCase("yes")) {
                cost += 300;
            }

            System.out.print("Meal (Rs.400)? (yes/no): ");
            if (sc.nextLine().equalsIgnoreCase("yes")) {
                cost += 400;
            }

            System.out.print("Insurance (Rs.200)? (yes/no): ");
            if (sc.nextLine().equalsIgnoreCase("yes")) {
                cost += 200;
            }

            totalCost += cost;
        }

        return totalCost;
    }
}