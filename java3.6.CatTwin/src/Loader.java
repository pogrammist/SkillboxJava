
public class Loader {
    public static void main(String[] args) {
        Cat tom = new Cat();
        Cat tomy = tom.createTwinCat();

        System.out.println(tom.getWeight());
        System.out.println(tom.getStatus());
        System.out.println(tomy.getWeight());
        System.out.println(tomy.getStatus());

        tom.feed(1000.0);

        System.out.println();
        System.out.println(tom.getWeight());
        System.out.println(tom.getStatus());
        System.out.println(tomy.getWeight());
        System.out.println(tomy.getStatus());
    }
}