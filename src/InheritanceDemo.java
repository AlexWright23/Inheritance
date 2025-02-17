import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>();

        workers.add(new Worker("1234", "John", "Doe", "Mr.", 1985, 20.0));
        workers.add(new Worker("1235", "Jane", "Smith", "Ms.", 1998, 22.5));
        workers.add(new Worker("1269", "Pog", "Champ", "Mr.", 1997, 19.75));

        workers.add(new SalaryWorker("1125", "John", "Pork", "Dr.", 1975, 0, 52000));
        workers.add(new SalaryWorker("1456", "Tim", "Cheese", "Prof.", 1980, 0, 75000));
        workers.add(new SalaryWorker("1899", "Bill", "Ball", "Mr.", 1998, 0, 48000));

        int[] weeklyHours = {40, 50, 40};

        for (int week = 0; week < weeklyHours.length; week++) {
            System.out.printf("Week %d:\n", week + 1);
            for (Worker worker : workers) {
                worker.displayWeeklyPay(weeklyHours[week]);
            }
        }
    }
}
