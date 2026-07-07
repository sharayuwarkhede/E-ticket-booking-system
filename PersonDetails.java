import java.util.ArrayList;

class PersonDetails {

    ArrayList<String> journeyDate = new ArrayList<>();
    ArrayList<String> journeyTime = new ArrayList<>();

    ArrayList<String> name = new ArrayList<>();
    ArrayList<Integer> age = new ArrayList<>();
    ArrayList<String> contactNo = new ArrayList<>();
    ArrayList<String> gender = new ArrayList<>();
    ArrayList<String> occupation = new ArrayList<>();
    ArrayList<String> tripType = new ArrayList<>();

    void addDetails(
            String n,
            int a,
            String c,
            String g,
            String o,
            String t,
            String date,
            String time) {

        name.add(n);
        age.add(a);
        contactNo.add(c);
        gender.add(g);
        occupation.add(o);
        tripType.add(t);

        journeyDate.add(date);
        journeyTime.add(time);
    }
}