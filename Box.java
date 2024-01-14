import java.util.ArrayList;

public class Box<T extends Fruit>{
    private ArrayList<T> list = new ArrayList<>();

    public void put(T item){
        list.add(item);
    }

    public T get(int index){
        return list.get(index);
    }

    public static void printBox(Box<? extends Fruit> box){
        System.out.println(box.toString());
    }
}