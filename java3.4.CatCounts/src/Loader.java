
public class Loader {
    public static void main(String[] args) {

        //Caterpillar
        Cat tank = new Cat();
        System.out.println("Коты: " + Cat.getCount() + " шт.");
        System.out.println(tank.getStatus());
        System.out.println();

        //Drinker
        Cat drinker = new Cat();
        System.out.println("Коты: " + Cat.getCount() + " шт.");
        System.out.println(drinker.getStatus());
        System.out.println();

        //Rocker
        Cat rocker = new Cat();
        System.out.println("Коты: " + Cat.getCount() + " шт.");
        rocker.feed(678.1321);
        rocker.drink(789.823);
        System.out.println(rocker.getStatus());
        System.out.println();

        //FlashCat
        Cat stinky = new Cat();
        System.out.println("Коты: " + Cat.getCount() + " шт.");
        /**
         * Не очень удачный цикл со сравнением текущего веса и значения 9000
         * Но используя в цикле условие stinky.getStatus() != "Exploded"
         * я получаю минус два кота
         */
        while (stinky.getWeight() < 9000)
        {
            stinky.feed(9.99 * Math.random());
        }
        System.out.println(stinky.getStatus());
        System.out.println();

        //Meow!
        Cat zyxel = new Cat();
        System.out.println("Коты: " + Cat.getCount() + " шт.");
        /**
         * При использовании цикла for тоже получаю минус два кота,
         * из-за того что итерация цикла происходит 1 лишний раз
         * и 1 лишний раз происходит вызов метода zyxel.getStatus()
         * в котором реализован декремент
         */
        for (int i = 0; zyxel.getStatus() != "Dead"; ++i)
        {
            zyxel.meow();
        }
        System.out.println(zyxel.getStatus());
        System.out.println();
        System.out.println("Коты: " + Cat.getCount() + " шт.");
        System.out.println();
        System.out.println("Выжило: " + Cat.getCount());
    }
}