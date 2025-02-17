package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalaryWorkerTest {
    @Test
    public void testCalculateWeeklyPay() {
        SalaryWorker salaryWorker = new SalaryWorker("1125", "John", "Pork", "Dr.", 1975, 0, 52000);
        Assertions.assertEquals(1000.0, salaryWorker.calculateWeeklyPay(40));
        Assertions.assertEquals(1000.0, salaryWorker.calculateWeeklyPay(50)); 
    }
}
