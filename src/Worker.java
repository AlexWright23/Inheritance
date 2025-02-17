public class Worker extends Person {
    private double hourlyPayRate;

    public Worker(String ID, String firstName, String lastName, String title, int yearOfBirth, double hourlyPayRate) {
        super(ID, firstName, lastName, title, yearOfBirth);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked) {
        if (hoursWorked <= 40) {
            return hoursWorked * hourlyPayRate;
        } else {
            double overtimeHours = hoursWorked - 40;
            return (40 * hourlyPayRate) + (overtimeHours * hourlyPayRate * 1.5);
        }
    }

    public void displayWeeklyPay(double hoursWorked) {
        double regularHours = Math.min(40, hoursWorked);
        double overtimeHours = Math.max(0, hoursWorked - 40);
        double regularPay = regularHours * hourlyPayRate;
        double overtimePay = overtimeHours * hourlyPayRate * 1.5;

        System.out.printf("%s\nRegular Hours: %.2f, Regular Pay: $%.2f\nOvertime Hours: %.2f, Overtime Pay: $%.2f\nTotal Pay: $%.2f\n\n",
                fullName(), regularHours, regularPay, overtimeHours, overtimePay, regularPay + overtimePay);
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + hourlyPayRate;
    }

    public String toXML() {
        return String.format("<Worker><ID>%s</ID><FirstName>%s</FirstName><LastName>%s</LastName><Title>%s</Title><YearOfBirth>%d</YearOfBirth><HourlyPayRate>%.2f</HourlyPayRate></Worker>",
                getID(), getFirstName(), getLastName(), getTitle(), getYearOfBirth(), hourlyPayRate);
    }

    public String toJSON() {
        return String.format("{\"ID\":\"%s\", \"FirstName\":\"%s\", \"LastName\":\"%s\", \"Title\":\"%s\", \"YearOfBirth\":%d, \"HourlyPayRate\":%.2f}",
                getID(), getFirstName(), getLastName(), getTitle(), getYearOfBirth(), hourlyPayRate);
    }
}
