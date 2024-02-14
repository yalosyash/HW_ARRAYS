package ru.netology.stats;

public class StatsService {

    public int sumOfAllSales(int [] arr){
        int sum = 0;
        for (int el: arr){
           sum += el;
        }
        return sum;
    }

    public int avgOfSales(int [] arr){
        return sumOfAllSales(arr) / (arr.length);
    }

    public int monthOfMaxSales(int [] arr){
        int monthOfMaxSales = 1;
        int max = arr[0];
        for (int month = 0; month <= arr.length - 1 ; month ++){
            if (arr[month] > max) {
                max = arr[month];
                monthOfMaxSales = month + 1;
            }
        }
        return monthOfMaxSales;
    }

    public int monthOfMinSales(int [] arr){
        int monthOfMinSales = 1;
        int min = arr[0];
        for (int month = 0; month <= arr.length - 1 ; month ++){
            if (arr[month] < min) {
                min = arr[month];
                monthOfMinSales = month + 1;
            }
        }
        return monthOfMinSales;
    }

    public int monthsUnderAvg(int [] arr){
        int monthsUnderAvg = 0;
        int avg = avgOfSales(arr);
        for (int month = 0; month <= arr.length - 1 ; month ++){
            if (arr[month] < avg) {
                monthsUnderAvg ++;
            }
        }
        return monthsUnderAvg;
    }

    public int monthsOverAvg(int [] arr){
        int monthsOverAvg = 0;
        int avg = avgOfSales(arr);
        for (int month = 0; month <= arr.length - 1 ; month ++){
            if (arr[month] > avg) {
                monthsOverAvg ++;
            }
        }
        return monthsOverAvg;
    }
}