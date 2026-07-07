// CLASS TO SHOW BOOKING SUMMARY
class TicketSummary {

    void showSummary(PersonDetails dt, int noOfPassg, String destination,
                     String mode, double totalFare) {

        System.out.println("\n======================= TICKET SUMMARY ======================");

        // Transport Type
        String transport = "";

        if (mode.equalsIgnoreCase("Bus")) {
            transport = "BUS";
        } else if (mode.equalsIgnoreCase("Train")) {
            transport = "TRAIN";
        } else if (mode.equalsIgnoreCase("Airway")) {
            transport = "AIRWAY";
        }

        System.out.println("Mode of Transport : " + transport);
        System.out.println("Destination       : " + destination);
        System.out.println("Number of Passengers : " + noOfPassg);

        System.out.println("============================================================");
        System.out.println("                 Passenger Details");
        System.out.println("============================================================");

        for (int i = 0; i < noOfPassg; i++) {

            System.out.println("\nPassenger " + (i + 1));
            System.out.println("--------------------------------------");
            System.out.println("Name          : " + dt.name.get(i));
            System.out.println("Age           : " + dt.age.get(i));
            System.out.println("Gender        : " + dt.gender.get(i));
            System.out.println("Contact       : " + dt.contactNo.get(i));
            System.out.println("Occupation    : " + dt.occupation.get(i));
            System.out.println("Trip Type     : " + dt.tripType.get(i));
            System.out.println("Journey Date  : " + dt.journeyDate.get(i));
            System.out.println("Journey Time  : " + dt.journeyTime.get(i));
        }

        System.out.println("============================================================");
        System.out.println("Total Fare : Rs." + totalFare);
        System.out.println("============================================================");
    }
}