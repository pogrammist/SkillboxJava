
public class Loader {
    public static void main(String[] args) {

        //CATerpillar
        Cat tank = new Cat("КОТ");

        System.out.println(tank.getWeight());
        tank.meow();
        System.out.println(tank.getWeight());
        tank.feed(5000.0);

        //Задание №1
        System.out.println("Вес еды с вычетом мяу!) " + tank.getFalseFeed());
        System.out.println("Вес еды " + tank.getFeed());
        System.out.println();

        //Задание №2
        tank.toilet();
    }
}