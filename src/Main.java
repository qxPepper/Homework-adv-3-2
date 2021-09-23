import java.util.concurrent.atomic.LongAdder;

public class Main {
    public static LongAdder total = new LongAdder();

    public static void main(String[] args) throws InterruptedException {
        Shop shop_1 = new Shop(10, 100);
        Shop shop_2 = new Shop(15, 500);
        Shop shop_3 = new Shop(17, 300);

        Thread t1 = new Thread(shop_1::totalSum, "t1");
        Thread t2 = new Thread(shop_2::totalSum, "t2");
        Thread t3 = new Thread(shop_3::totalSum, "t3");

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
        t3.join();

        System.out.println("Суммарная выручка с 3-х магазинов равна " + total.longValue() + ".");
    }
}
