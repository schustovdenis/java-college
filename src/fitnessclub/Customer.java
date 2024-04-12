package fitnessclub;

public class Customer {
    private String firstName;
    private String lastName;
    private int yearOfBirth;

    public Customer(String firstName, String lastName, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return firstName + " " + lastName;
    }
}
