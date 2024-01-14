
public class FruitBox {
    protected static Box<Fruit> box = new Box<>();


    public static void getFruitBox(Fruit item){
        box.put(item);
    }

    public static void getFruitBox(Fruit item, Fruit it2){
        box.put(item);
        box.put(it2);
    }

     public static void getFruitBox(Fruit item, Fruit it2, Fruit it3){
        box.put(item);
        box.put(it2);
        box.put(it3);
    }

    public static void printBox(){
        for(int i = 0; i < box.size(); i ++){
            System.out.println(box.get(i));
        }
    }
}
