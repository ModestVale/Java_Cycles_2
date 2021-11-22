package ru.netology.stats;

public class StatsService {
    public long allSumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;

        }
        return sum;
    }

    public double meanSales(long[] sales) {
        long sum = allSumSales(sales);
        int count = sales.length;
        return sum / (double) count;
    }

    public int maхSales(long[] sales) {
        int maхMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maхMonth]) {
                maхMonth = month;
            }
            month = month + 1;
        }
        return maхMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int lowerMeanSales(long[] sales) {
        double mean = meanSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < mean) {
                count++;

            }
        }
        return count;
    }

    public int upperMeanSales(long[] sales) {
        double mean = meanSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > mean) {
                count++;

            }
        }
        return count;
    }
}
