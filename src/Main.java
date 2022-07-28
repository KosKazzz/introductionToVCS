public class Main {
    public static void main(String[] args) {
        SalesManager manager = new SalesManager(new int[]{550, 610, 400, 100, 132, 98, 556, 45});
        System.out.println("Best sale : " + manager.max());

        System.out.println("Worse sale : " + manager.min());
        System.out.println("Truncated sales value : " + manager.truncatedMean());

    }
}
