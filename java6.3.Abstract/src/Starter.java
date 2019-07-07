import Bird.*;

import javax.xml.crypto.Data;

public class Starter {

    public static void main(String[] args) {

        Duck duck = new Duck();
        duck.eat();
        duck.swim();
        duck.walk();
        duck.voice();
        duck.run();
        duck.fly();
        System.out.println();

        Sparrow sparrow = new Sparrow();
        sparrow.eat();
        sparrow.walk();
        sparrow.run();
        sparrow.voice();
        sparrow.fly();
        System.out.println();

        Ostrich ostrich = new Ostrich();
        ostrich.eat();
        ostrich.walk();
        ostrich.run();
        ostrich.voice();
        System.out.println();

        Hen hen = new Hen();
        hen.eat();
        hen.walk();
        hen.run();
        hen.voice();
    }
}
