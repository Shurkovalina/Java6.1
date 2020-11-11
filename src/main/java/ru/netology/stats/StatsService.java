package ru.netology.stats;

public class StatsService {

    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public long calculateAverage(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum / purchases.length;
    }

    public long calculateMaxIndex(long[] purchases) {
        int numMax = 0;
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] > purchases[numMax]) {
                numMax = i;
            }
        }
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] == purchases[numMax])
                numMax = i;
        }
//        прибавляем 1, чтобы найти номер максимального элемента, а не его индекс
        return numMax + 1;
    }

    public long calculateMinIndex(long[] purchases) {
        int numMin = 0;
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] < purchases[numMin]) {
                numMin = i;
            }
        }
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] == purchases[numMin])
                numMin = i;
        }
//        прибавляем 1, чтобы найти номер максимального элемента, а не его индекс
        return numMin + 1;
    }

    public long belowAverage(long[] purchases) {
        long sum = 0;
        int num = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        long average = sum / purchases.length;
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] < average)
                num++;
        }
        return num;
    }

    public long aboveAverage(long[] purchases) {
        long sum = 0;
        int num = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        long average = sum / purchases.length;
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] > average)
                num++;
        }
        return num;
    }

}
