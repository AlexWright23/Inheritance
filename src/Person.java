public class Person {
    private String firstName;
    private String lastName;
    private final String ID;
    private String title;
    private int yearOfBirth;

    public Person(String ID, String firstName, String lastName, String title, int yearOfBirth) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.yearOfBirth = yearOfBirth;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getTitle() { return title; }
    public int getYearOfBirth() { return yearOfBirth; }
    public String getID() { return ID; }

    public String fullName() { return firstName + " " + lastName; }
//    public String formalName() { return title + " " + fullName(); }

    public String toCSV() {
        return String.format("%s,%s,%s,%s,%d", ID, firstName, lastName, title, yearOfBirth);
    }
}
