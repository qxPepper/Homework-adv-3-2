public class Shop {
    private final long[] array;

    public Shop(int size, int maximum) {
        array = new long[size];
        for (int i = 0; i < size; i++) {
            long random = (long) (Math.random() * maximum);
            array[i] = random;
        }
    }

    public void totalSum() {
        for (long l : array) {
            Main.total.add(l);
        }
    }
}
