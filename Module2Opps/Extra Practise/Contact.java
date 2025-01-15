import java.time.LocalDate;
import java.time.Period;

public class Contact {

    private String name;
    private String phoneNumber;
    private String birthDate;
    private int age;

    //yyyy-mm-dd
    public Contact(String name, String phoneNumber, String birthDate) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.age=toAge(birthDate);
       // System.out.println(toAge(birthDate));
        
    }
    
    //copy constructor
    public Contact(Contact source){
        this.name = source.name;
        this.phoneNumber = source.phoneNumber;
        this.birthDate = source.birthDate;
        this.age = source.age;
    }


    private int toAge(String birthDate) {
        LocalDate dateOfBirth = LocalDate.parse(birthDate);        // Get the current date
        LocalDate currentDate = LocalDate.now();      
        // Calculate age
        int age = Period.between(dateOfBirth, currentDate).getYears();
        return age;
        // 1. Convert birthDate String to LocalDate
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
        setAge(toAge(birthDate));
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Name: " + this.name + "\n" +
            "Phone number: " + this.phoneNumber + "\n" +
            "Birth Date: " + this.birthDate + "\n" +
            "Age: " + this.age + " year old\n";
    }

}