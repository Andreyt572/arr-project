package ru.netology.stats.arrproject.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.arrproject.services.StatsService;

public class StatsServiceTest {

    @Test
    public void testSum() { //Метод №1 Сумма всех элементов
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.sum(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverage() { //Метод №2 Среднее арифметическое
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.average(sales);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testMaximum() { //Метод №3 Месяц с максимальными продажами
        StatsService service = new StatsService();
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.monthMaximumSale(sales);
        long expected = 8;
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldFindMinSales() { //МЕТОД №4 Месяц с минимальными продажами
        StatsService service = new StatsService();

        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinMonth = 9;
        int actualMinMonth = service.getMinSales(sales);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void testBelowAverage() {
        StatsService service = new StatsService();
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.monthBelowAverage(sales);
        long expected = 5;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testHigherAverage() {
        StatsService service = new StatsService();
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.monthHigherAverage(sales);
        long expected = 5;
        Assertions.assertEquals(expected, actual);

    }
}
