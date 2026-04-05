package ru.netology.statistic;

public class Main {
    public static void main(String[] args) {
        StatisticsService service = new StatisticsService();

        long[] incomes1 = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long max1 = service.findMax(incomes1);
        System.out.println("Максимальный доход: " + max1);

        long[] incomes2 = {12, 5, 8, 20, 5, 3, 8, 6, 11, 11, 12};
        long max2 = service.findMax(incomes2);
        System.out.println("Максимальный доход: " + max2);
    }
}