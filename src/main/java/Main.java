import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        long[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println("Сумма всех продаж " + service.sumOfAllSales(arr)); // ------------------------ expect 180
        System.out.println("Средняя сумма продаж " + service.avgOfSales(arr)); // ------------------------ expect 15
        System.out.println("Пик продаж в " + service.monthOfMaxSales(arr) + " месяце"); // --------------- expect 6
        System.out.println("Минимум продаж в " + service.monthOfMinSales(arr) + " месяце"); // ----------- expect 9
        System.out.println("Месяцев с продажами ниже среднего " + service.monthsUnderAvg(arr)); // ------- expect 5
        System.out.println("Месяцев с продажами выше среднего " + service.monthsOverAvg(arr)); // -------- expect 5
    }
}