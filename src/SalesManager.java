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

    public int truncatedMean() {
        int trMean = 0;
        boolean oneMaxFound = false;
        boolean oneMinFound = false;
        for (long sale : sales) {
           /* if (sale == this.max() || sale == this.min()) {
                continue;
            }*/
            if(sale == this.max() && !oneMaxFound){
                oneMaxFound = true;
                continue;
            }
            if(sale == this.min() && !oneMinFound){
                oneMinFound = true;
                continue;
            }
            trMean += sale;
        }
        return trMean / (sales.length - 2);

    }

}
