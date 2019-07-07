public class Starter {

    public static void main(String[] args) {

        Duck duck = new Duck();
        duck.walk();
        duck.run();
        duck.eat();
        duck.sing();
        duck.swim();
        duck.fly();
        System.out.println();

        Sparrow sparrow = new Sparrow();
        sparrow.sing();
        System.out.println();

        Ostrich ostrich = new Ostrich();
        ostrich.eat();
        System.out.println();

        Hen hen = new Hen();
        hen.eat();
    }
}
