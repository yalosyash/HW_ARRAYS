package ru.netology.stats;

public class StatsService {

    public long sumOfAllSales(long[] arr) {
        long sum = 0;
        for (long el : arr) {
            sum += el;
        }
        return sum;
    }

    public long avgOfSales(long[] arr) {return sumOfAllSales(arr) / (arr.length);}

    public int monthOfMaxSales(long[] arr) {
        int monthOfMaxSales = 1;
        long max = arr[0];
        for (int month = 0; month <= arr.length - 1; month++) {
            if (arr[month] > max) {
                max = arr[month];
                monthOfMaxSales = month + 1;
            }
        }
        return monthOfMaxSales;
    }

    public int monthOfMinSales(long[] arr) {
        int monthOfMinSales = 1;
        long min = arr[0];
        for (int month = 0; month <= arr.length - 1; month++) {
            if (arr[month] < min) {
                min = arr[month];
                monthOfMinSales = month + 1;
            }
        }
        return monthOfMinSales;
    }

    public int monthsUnderAvg(long[] arr) {
        int monthsUnderAvg = 0;
        long avg = avgOfSales(arr);
        for (int month = 0; month <= arr.length - 1; month++) {
            if (arr[month] < avg) {
                monthsUnderAvg++;
            }
        }
        return monthsUnderAvg;
    }

    public int monthsOverAvg(long[] arr) {
        int monthsOverAvg = 0;
        long avg = avgOfSales(arr);
        for (int month = 0; month <= arr.length - 1; month++) {
            if (arr[month] > avg) {
                monthsOverAvg++;
            }
        }
        return monthsOverAvg;
    }
}
