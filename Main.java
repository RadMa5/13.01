public class Main {
    public static void main(String[] args) {
        //Liskov substitution principle. Дочерние объекты Orange и Apple могут быть заменены родительским объектом Fruit
        Fruit ap1 = new Apple();
        Fruit ap2 = new Apple();
        Fruit or = new Orange();

        FruitBox.getFruitBox(ap1, or);
        FruitBox.printBox();

        FruitBox.getFruitBox(ap1, or, ap2);
        FruitBox.printBox();

        Orange or2 = new Orange();
        or2.makeJuice();
    }
}
