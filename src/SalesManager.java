public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long min() {
        long min = sales[0];
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public long truncatedMean() {
        long trMean = 0;
        boolean oneMaxFound = false;
        boolean oneMinFound = false;
        long maxSale = this.max();
        long minSale = this.min();
        for (long sale : sales) {
            if (sale == maxSale && !oneMaxFound) {
                oneMaxFound = true;
                continue;
            }
            if (sale == minSale && !oneMinFound) {
                oneMinFound = true;
                continue;
            }
            trMean += sale;
        }
        return trMean / (sales.length - 2);
    }
}
