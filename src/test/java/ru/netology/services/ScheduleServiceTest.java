package ru.netology.services;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class ScheduleServiceTest {
    @Test
    void shouldCalculateForIncome10() {
        ScheduleService service = new ScheduleService();
        int expected = 3;
        int actual = service.calculate(10_000, 3000, 20_000);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForIncome100() {
        ScheduleService service = new ScheduleService();
        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);
        Assertions.assertEquals(expected, actual);
    }
}
