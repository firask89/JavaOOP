import java.util.Calendar;
import java.util.Date;

public class Person {
    int counter;
    String firstName;
    String lastName;
    String address;
    int dateOfBirth;
    String nationality;
    String city;
    int weight;
    double height; // should be cm
    boolean isMale ;

    public Person (){
        this.counter = 0;
        this.firstName ="sonia";
        this.lastName = "kaboor";
        this.address = "Bollywood";
        this.dateOfBirth =1980;
        this.nationality ="indian";
        this.city ="Mombi";
        this.weight =50;
        this.height =165;
        this.isMale =false;
    }
    public Person(int counter, String firstName, String lastName, String address, int dateOfBirth, String nationality, String city, int weight, double height, boolean isMale){
        this.counter =counter;
        this.firstName =firstName;
        this.lastName =lastName;
        this.address =address;
        this.dateOfBirth =dateOfBirth;
        this.nationality=nationality;
        this.city =city;
        this.weight =weight;
        this.height =height;
        this.isMale =isMale;
    }
    public String getFullName(){
//        System.out.println();
        return firstName+ " " + lastName;
    }
    public double getHeightInFeet(){
        return height/30.48;
    }
    public int getAge (){
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int year = cal.get(Calendar.YEAR);
        return year - dateOfBirth;
    }
}
