import java.util.ArrayList;
import java.util.Arrays;

// CLASS TO SHOW DESTINATIONS
class DestinationDetails {

    ArrayList<String> destinationList = new ArrayList<>();
    ArrayList<String> busJourney = new ArrayList<>();
    ArrayList<String> trainJourney = new ArrayList<>();
    ArrayList<String> airwayJourney = new ArrayList<>();

    // Display all available destinations
    public void destinationDetails() {

        destinationList.addAll(Arrays.asList(
                "Mumbai", "Nagpur", "Sambhajinagar", "Thane",
                "Delhi", "Ahmedabad", "Surat", "Bhopal",
                "Indore", "Lucknow", "Patna", "Panaji",
                "Bengaluru", "Chennai", "Hyderabad", "Kolkata",
                "Jaipur", "Agra", "Chandigarh", "Coimbatore",
                "Gwalior", "Amritsar", "Dehradun", "Srinagar",
                "Udaipur", "Raipur", "Kanpur", "Satara",
                "Kolhapur", "Solapur", "Nashik", "Sangli",
                "Latur", "Dhule", "Buldhana", "Jalgaon",
                "Jalna", "Amaravati", "Shimla", "Shillong",
                "Gangtok", "Aizawl"
        ));

        System.out.println("\n\n------------------ Available Destinations -----------------");
        System.out.println("\n" + destinationList);
    }

    // Store destinations available for each transport
    public void availabledestinations() {

        // Bus Destinations
        busJourney.addAll(Arrays.asList(
                "Mumbai", "Nagpur", "Sambhajinagar", "Thane",
                "Ahmedabad", "Surat", "Indore", "Lucknow",
                "Panaji", "Bengaluru", "Chennai", "Hyderabad",
                "Kolkata", "Jaipur", "Satara", "Kolhapur",
                "Solapur", "Nashik", "Sangli", "Latur",
                "Dhule", "Buldhana", "Jalgaon",
                "Jalna", "Amaravati"
        ));

        // Train Destinations
        trainJourney.addAll(Arrays.asList(
                "Mumbai", "Nagpur", "Delhi", "Ahmedabad",
                "Bhopal", "Lucknow", "Patna", "Panaji",
                "Bengaluru", "Chennai", "Hyderabad", "Kolkata",
                "Jaipur", "Agra", "Chandigarh", "Amritsar",
                "Dehradun", "Srinagar", "Udaipur",
                "Jalgaon", "Latur", "Dhule", "Shimla"
        ));

        // Airway Destinations
        airwayJourney.addAll(Arrays.asList(
                "Mumbai", "Nagpur", "Ahmedabad", "Lucknow",
                "Panaji", "Bengaluru", "Delhi", "Chennai",
                "Hyderabad", "Kolkata", "Jaipur",
                "Chandigarh", "Srinagar", "Kanpur",
                "Shimla", "Shillong", "Gangtok", "Aizawl"
        ));
    }
}
