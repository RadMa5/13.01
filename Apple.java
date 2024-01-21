public class Apple extends Fruit {
    //Single responsibility principle. У метода только одна функция 
    @Override
    public String toString(){
        //Open closed principle. Данный класс расширяет класс Fruit без изменения его
        return "Apple";
    }
}
