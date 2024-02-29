public class CanteenDemo {
    public static void main(String[] args) {
        Item[] makanan = new Item[3];

        makanan[0] = new Item("Rice Bowl", 20000, 20);
        makanan[1] = new Item("lychee tea", 10000, 25);
        makanan[2] = new Item("Roti Maryam", 4000, 30);

        Item item = new Item();
        item.displayInfo(makanan);
    }
}