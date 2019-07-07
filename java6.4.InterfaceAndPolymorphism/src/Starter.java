import Bird.*;
import java.util.ArrayList;
import java.util.Collections;

public class Starter {

    public static void addAnimals(ArrayList<Bird> animals) {
        animals.add(new Duck());
        animals.add(new Sparrow());
        animals.add(new Ostrich());
        animals.add(new Hen());
        animals.add(new Duck());
        animals.add(new Sparrow());
        animals.add(new Ostrich());
        animals.add(new Hen());
        animals.add(new Duck());
        animals.add(new Sparrow());
        animals.add(new Ostrich());
        animals.add(new Hen());
    }

    public static void main(String[] args) {

        ArrayList<Bird> animals = new ArrayList<>();
        addAnimals(animals);

        Collections.sort(animals);
        for (Bird animal : animals) {
            System.out.print(animal.getClass().getSimpleName() + " - ");
            animal.voice();
        }
    }
}
