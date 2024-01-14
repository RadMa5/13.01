public class Fruit {
    protected String name;
    protected Box<Fruit> box = new Box<>()

    public String toString(){
        return name;
    }

    public static void getFruitBox(){
        Box<Fruit> box = new Box<>();
    }

    public static void getFruitBox(Fruit item){
        Box<Fruit> box = new Box<>();
        box.put(item);
    }

    public static void printBox(){
        Box.printBox(box);
    }
}
