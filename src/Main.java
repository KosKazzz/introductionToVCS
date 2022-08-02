public class Main {
    public static void main(String[] args) {
        SalesManager manager = new SalesManager(new long[]{610,550, 610,45, 400, 100, 132, 98, 556, 45}); //2491+610+45=3146
        System.out.println("Best sale : " + manager.max());

        System.out.println("Worse sale : " + manager.min());
        System.out.println("Truncated sales value : " + manager.truncatedMean());

    }
}
