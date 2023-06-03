package ru.netology.stats.arrproject.services;


public class StatsService {

    public long sum(long[] sales) { //Метод №1 Сумма всех элементов
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public long average(long[] sales) { //Метод №2 Среднее арифметическое
        return sum(sales) / sales.length;
    }


    public int monthMaximumSale(long[] sales) { //Метод №3 Месяц с максимальными продажами
        int monthMaximum = 0;
        long saleMaximum = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= saleMaximum) {
                monthMaximum = i;
                saleMaximum = sales[i];
            }
        }
        return monthMaximum + 1;
    }



    public int getMinSales(int[] sales) { //Метод №4 Месяц с минимальными продажами
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int monthBelowAverage(long[] sales) { //Метод №5 Количество месяцев с продажами ниже среднего
        int counter = 0;
        for (long sale : sales) {
            if (sale < average(sales)){
                counter++;
            }
        }
        return counter;
    }

    public int monthHigherAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale > average(sales)){
                counter++;
            }
        }
        return counter;
    }
}




