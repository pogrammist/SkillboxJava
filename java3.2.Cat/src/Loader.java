
public class Loader {
    public static void main(String[] args) {

        //Caterpillar
        Cat tank = new Cat();
        System.out.println(tank.getWeight());
        tank.meow();
        System.out.println(tank.getWeight());
        tank.feed(-342.34);
        System.out.println(tank.getWeight());
        System.out.println(tank.getStatus());
        System.out.println();

        //Drinker
        Cat drinker = new Cat();
        System.out.println(drinker.getWeight());
        drinker.drink(-123 * Math.random());
        System.out.println(drinker.getWeight());
        drinker.drink(1234 * Math.random());
        System.out.println(drinker.getWeight());
        System.out.println(drinker.getStatus());
        System.out.println();

        //Rocker
        Cat rocker = new Cat();
        System.out.println(rocker.getWeight());
        rocker.feed(678.1321);
        System.out.println(rocker.getWeight());
        rocker.drink(-7789.823);
        System.out.println(rocker.getWeight());
        rocker.drink(890.213);
        System.out.println(rocker.getWeight());
        System.out.println(rocker.getStatus());
        System.out.println();

        //FlashCat
        Cat stinky = new Cat();
        do {
            //System.out.println(stinky.getClass().getSimpleName() + ", do you fine?");
            stinky.feed(9.99 * Math.random());
        }
        while (stinky.getStatus() != "Exploded");
        System.out.println(stinky.getStatus());
        System.out.println();

        //SpecialMeow! Be or no to be!
        Cat zyxel = new Cat();
        for (int i = 0; i < zyxel.getWeight(); i++) {
            /**
             * Не удалось обратиться к коту по имени,
             * т.к. переменная zyxel является лишь ссылкой на объект типа Cat,
             * у которого нет свойства name, способного хранить имя кота
             */
            //System.out.println(zyxel.getClass().getName() + ", what is up?");
            zyxel.meow();
            if (zyxel.getStatus() == "Dead") {
                break;
            }
        }
        System.out.println(zyxel.getStatus());
    }
}