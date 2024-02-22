package ru.netology.homework.cycleshmw.services;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.Assertions;


public class VacationMonthsServiceTest {

    @ParameterizedTest
    @CsvSource({
            "3, 10000, 3000, 20000",
            "2, 100000, 60000, 150000"
    })
    public void shouldCalcWhenIncomeOverExpenses(int expected, int income, int expenses, int threshold) {
        VacationMonthsService service = new VacationMonthsService();

        //int expected = 8;
        int actual = service.calcMonths(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}