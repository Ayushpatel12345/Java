public class OOPs1ref {
    public static void main(String[] args) {
        OOPs1 item = new OOPs1("drink","abc",1.5);
        item.printItem();
        item.setSize("LARGE");
        item.printItem();

        OOPs1 item1 = new OOPs1("topping","xyz",1.5);
        item1.printItem();
    }
}
