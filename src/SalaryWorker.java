public class SalaryWorker extends Worker {
    private double annualSalary;

    public SalaryWorker(String ID, String firstName, String lastName, String title, int yearOfBirth, double hourlyPayRate, double annualSalary) {
        super(ID, firstName, lastName, title, yearOfBirth, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked) {
        return annualSalary / 52;
    }

    @Override
    public void displayWeeklyPay(double hoursWorked) {
        System.out.printf("%s\nWeekly Pay (Annual Salary): $%.2f\n\n", fullName(), calculateWeeklyPay(hoursWorked));
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + annualSalary;
    }

    public String toXML() {
        return String.format("<SalaryWorker><ID>%s</ID><FirstName>%s</FirstName><LastName>%s</LastName><Title>%s</Title><YearOfBirth>%d</YearOfBirth><AnnualSalary>%.2f</AnnualSalary></SalaryWorker>",
                getID(), getFirstName(), getLastName(), getTitle(), getYearOfBirth(), annualSalary);
    }

    public String toJSON() {
        return String.format("{\"ID\":\"%s\", \"FirstName\":\"%s\", \"LastName\":\"%s\", \"Title\":\"%s\", \"YearOfBirth\":%d, \"AnnualSalary\":%.2f}",
                getID(), getFirstName(), getLastName(), getTitle(), getYearOfBirth(), annualSalary);
    }
}
