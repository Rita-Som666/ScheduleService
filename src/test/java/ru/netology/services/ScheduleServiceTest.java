package ru.netology.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class ScheduleServiceTest {
    @ParameterizedTest
    // @CsvSource({

    // })
    @CsvFileSource(files = "src/test/resources/Schedule.csv")
    void shouldCalculateForIncome(int expected, int income, int expenses, int threshold) {
        ScheduleService service = new ScheduleService();
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }

    // @Test
    // void shouldCalculateForIncome100() {
    //   ScheduleService service = new ScheduleService();
    //   int expected = 2;
    // int actual = service.calculate(100_000, 60_000, 150_000);
    // Assertions.assertEquals(expected, actual);
    // }
}
