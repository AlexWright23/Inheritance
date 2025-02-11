package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorkerTest {
    @Test
    public void testCalculateWeeklyPay() {
        Worker worker = new Worker("1234", "John", "Doe", "Mr.", 1985, 20.0);
        Assertions.assertEquals(800.0, worker.calculateWeeklyPay(40));
        Assertions.assertEquals(950.0, worker.calculateWeeklyPay(45));
    }
}

