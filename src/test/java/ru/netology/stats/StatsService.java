package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class StatsService {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data.csv")
    public void test () {
        int expected = 0;
        int actual = 0;
        Assertions.assertEquals();
    }
}
