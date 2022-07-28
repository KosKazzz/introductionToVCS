public class Main {
    public static void main(String[] args) {
        SalesManager manager = new SalesManager(new long[]{550, 610, 400, 100, 132, 98, 556, 45});
        System.out.println("Best sale : " + manager.max());

    }
}
