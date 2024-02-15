package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTests {
    @Test
    public void shouldCalcSumOfAllSales() {
        StatsService service = new StatsService();
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.sumOfAllSales(arr);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcAvgOfSales() {
        StatsService service = new StatsService();
        int[] arr = {8, 34, 13, 15, 17, 20, 20, 2, 7, 14, 14, 8};
        int expected = 14;
        int actual = service.avgOfSales(arr);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcMonthOfMaxSales() {
        StatsService service = new StatsService();
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 34, 18};
        int expected = 11;
        int actual = service.monthOfMaxSales(arr);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcMonthOfMinSales() {
        StatsService service = new StatsService();
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.monthOfMinSales(arr);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcMonthsUnderAvg() {
        StatsService service = new StatsService();
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.monthsUnderAvg(arr);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcMonthsOverAvg() {
        StatsService service = new StatsService();
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.monthsOverAvg(arr);

        Assertions.assertEquals(expected, actual);
    }
}