// CLASS TO CALCULATE FARE
class FareCalculation {

    // ---------------- BUS FARE ----------------
    double calculateBusFare(String destination) {

        double fare = 0;

        switch (destination) {

            case "Mumbai":
                fare = 500;
                break;

            case "Nagpur":
                fare = 400;
                break;

            case "Sambhajinagar":
                fare = 350;
                break;

            case "Thane":
                fare = 450;
                break;

            case "Ahmedabad":
                fare = 600;
                break;

            case "Surat":
                fare = 550;
                break;

            case "Indore":
                fare = 300;
                break;

            case "Lucknow":
                fare = 700;
                break;

            case "Panaji":
                fare = 650;
                break;

            case "Bengaluru":
                fare = 800;
                break;

            case "Chennai":
                fare = 750;
                break;

            case "Hyderabad":
                fare = 700;
                break;

            case "Kolkata":
                fare = 900;
                break;

            case "Jaipur":
                fare = 450;
                break;

            case "Satara":
                fare = 200;
                break;

            case "Kolhapur":
                fare = 250;
                break;

            case "Solapur":
                fare = 300;
                break;

            case "Nashik":
                fare = 350;
                break;

            case "Sangli":
                fare = 400;
                break;

            case "Latur":
                fare = 450;
                break;

            case "Dhule":
                fare = 500;
                break;

            case "Buldhana":
                fare = 550;
                break;

            case "Jalgaon":
                fare = 600;
                break;

            case "Jalna":
                fare = 650;
                break;

            case "Amaravati":
                fare = 700;
                break;
        }

        return fare;
    }

    // ---------------- TRAIN FARE ----------------
    double calculateTrainFare(String destination) {

        double fare = 0;

        switch (destination) {

            case "Mumbai":
                fare = 1000;
                break;

            case "Nagpur":
                fare = 800;
                break;

            case "Delhi":
                fare = 1200;
                break;

            case "Ahmedabad":
                fare = 900;
                break;

            case "Bhopal":
                fare = 700;
                break;

            case "Lucknow":
                fare = 1100;
                break;

            case "Patna":
                fare = 1300;
                break;

            case "Panaji":
                fare = 1500;
                break;

            case "Bengaluru":
                fare = 2000;
                break;

            case "Chennai":
                fare = 1800;
                break;

            case "Hyderabad":
                fare = 1700;
                break;

            case "Kolkata":
                fare = 2200;
                break;

            case "Jaipur":
                fare = 900;
                break;

            case "Agra":
                fare = 800;
                break;

            case "Chandigarh":
                fare = 1000;
                break;

            case "Amritsar":
                fare = 1100;
                break;

            case "Dehradun":
                fare = 1200;
                break;

            case "Srinagar":
                fare = 1300;
                break;

            case "Udaipur":
                fare = 1400;
                break;

            case "Jalgaon":
                fare = 1500;
                break;
        }

        return fare;
    }

    // ---------------- AIRWAY FARE ----------------
    double calculateAirwayFare(String destination) {

        double fare = 0;

        switch (destination) {

            case "Mumbai":
                fare = 5000;
                break;

            case "Nagpur":
                fare = 4000;
                break;

            case "Ahmedabad":
                fare = 6000;
                break;

            case "Lucknow":
                fare = 7000;
                break;

            case "Panaji":
                fare = 6500;
                break;

            case "Bengaluru":
                fare = 8000;
                break;

            case "Delhi":
                fare = 7500;
                break;

            case "Chennai":
                fare = 7000;
                break;

            case "Hyderabad":
                fare = 9000;
                break;

            case "Kolkata":
                fare = 8500;
                break;

            case "Jaipur":
                fare = 4500;
                break;

            case "Chandigarh":
                fare = 5000;
                break;

            case "Srinagar":
                fare = 5500;
                break;

            case "Kanpur":
                fare = 6000;
                break;

            case "Shimla":
                fare = 6500;
                break;

            case "Shillong":
                fare = 7000;
                break;

            case "Gangtok":
                fare = 7500;
                break;

            case "Aizawl":
                fare = 8000;
                break;
        }

        return fare;
    }
        // ---------------- DISCOUNT FOR FEMALE ----------------
    double DiscountForFemale(String passGender, double fare) {

        // 5% discount for female passengers
        if (passGender.trim().equalsIgnoreCase("Female")) {
            fare = fare - (fare * 0.05);
        }

        return fare;
    }

    // ---------------- DISCOUNT FOR SENIOR CITIZEN ----------------
    double DiscountForSeniorCitizen(int passAge, double fare) {

        // 5% discount for passengers above 60 years
        if (passAge > 60) {
            fare = fare - (fare * 0.05);
        }

        return fare;
    }

    // ---------------- DISCOUNT FOR STUDENT ----------------
    double DiscountForStudent(String passOccupation, double fare) {

        // 5% discount for students
        if (passOccupation.trim().equalsIgnoreCase("Student")) {
            fare = fare - (fare * 0.05);
        }

        return fare;
    }

    // ---------------- DISCOUNT FOR ROUND TRIP ----------------
    double DiscountForRoundTrip(String tripType, double fare) {

        // Round Trip = Double Fare - 10% Discount
        if (tripType.trim().equalsIgnoreCase("Round Trip")) {

            fare = fare * 2;
            fare = fare - (fare * 0.10);
        }

        return fare;
    }

    // ---------------- GROUP DISCOUNT ----------------
    double DiscountOnGroup(double totalFare, int noOfPassg) {

        // 15% discount for 4 or more passengers
        if (noOfPassg >= 4) {
            totalFare = totalFare - (totalFare * 0.15);
        }

        return totalFare;
    }

    // ---------------- TOTAL BUS FARE ----------------
    double calculateTotalBusFare(PersonDetails dt, String destination) {

        double totalFareBus = 0;

        for (int i = 0; i < dt.name.size(); i++) {

            double baseFare = calculateBusFare(destination);

            baseFare = DiscountForRoundTrip(dt.tripType.get(i), baseFare);
            baseFare = DiscountForFemale(dt.gender.get(i), baseFare);
            baseFare = DiscountForSeniorCitizen(dt.age.get(i), baseFare);
            baseFare = DiscountForStudent(dt.occupation.get(i), baseFare);

            totalFareBus += baseFare;
        }

        totalFareBus = DiscountOnGroup(totalFareBus, dt.name.size());

        return totalFareBus;
    }

    // ---------------- TOTAL TRAIN FARE ----------------
    double calculateTotalTrainFare(PersonDetails dt, String destination) {

        double totalFareTrain = 0;

        for (int i = 0; i < dt.name.size(); i++) {

            double baseFare = calculateTrainFare(destination);

            baseFare = DiscountForRoundTrip(dt.tripType.get(i), baseFare);
            baseFare = DiscountForFemale(dt.gender.get(i), baseFare);
            baseFare = DiscountForSeniorCitizen(dt.age.get(i), baseFare);
            baseFare = DiscountForStudent(dt.occupation.get(i), baseFare);

            totalFareTrain += baseFare;
        }

        totalFareTrain = DiscountOnGroup(totalFareTrain, dt.name.size());

        return totalFareTrain;
    }

    // ---------------- TOTAL AIRWAY FARE ----------------
    double calculateTotalAirwayFare(PersonDetails dt, String destination) {

        double totalFareAirway = 0;

        for (int i = 0; i < dt.name.size(); i++) {

            double baseFare = calculateAirwayFare(destination);

            baseFare = DiscountForRoundTrip(dt.tripType.get(i), baseFare);
            baseFare = DiscountForFemale(dt.gender.get(i), baseFare);
            baseFare = DiscountForSeniorCitizen(dt.age.get(i), baseFare);
            baseFare = DiscountForStudent(dt.occupation.get(i), baseFare);

            totalFareAirway += baseFare;
        }

        totalFareAirway = DiscountOnGroup(totalFareAirway, dt.name.size());

        return totalFareAirway;
    }
}