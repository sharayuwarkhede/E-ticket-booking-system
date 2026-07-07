import java.util.*;

public class Details{
    ArrayList <String> name = new ArrayList <>();//to store name of passengers
    ArrayList <Integer> age = new ArrayList <>();//to store age of passengers
    ArrayList <String> contactNo = new ArrayList <>();//to store contact number of passengers
    ArrayList <String> gender = new ArrayList <>();//to store gender of passengers
    ArrayList <String> occupation = new ArrayList <>();//to store occupation of passengers
    ArrayList <String> tripType = new ArrayList <>();//to store trip type (One Way/Round Trip) for each passenger
    
    
    //DETAILS OF PASSENGERS
    void addDetails(String n,int a,String c,String g, String o, String t){
        name.add(n);
        age.add(a);
        contactNo.add(c);
        gender.add(g);
        occupation.add(o);
        tripType.add(t);
    }

}