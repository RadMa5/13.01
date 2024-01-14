public class Main {
    public static void main(String[] args) {
        Apple ap1 = new Apple();
        Apple ap2 = new Apple();
        Orange or = new Orange();

        FruitBox.getFruitBox(ap1, or);
        FruitBox.printBox();

        FruitBox.getFruitBox(ap1, or, ap2);
        FruitBox.printBox();
    }
}
