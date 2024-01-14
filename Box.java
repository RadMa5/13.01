import java.util.ArrayList;

public class Box<T extends Fruit>{
    private ArrayList<T> list = new ArrayList<>();

    public void put(T item){
        list.add(item);
    }

    public T get(int index){
        return list.get(index);
    }

    public int size(){
        return list.size();
    }

}