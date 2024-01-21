public class Orange extends Fruit implements OrangeJuice{
    //Single responsibility principle. У метода только одна функция 
    @Override
    public String toString(){
        //Open closed principle. Данный класс расширяет класс Fruit без изменения его
        return "Orange";
    }

    @Override
    public void makeJuice() {
        //Inteface segregation principle. Интерфейс Orange Juice имплементирован только в классе Orange

        //Dependency inversion principle. Класс makeJuice не зависит от класса Fruit
        System.out.println("You made a tasty juice");
    }
    
}
