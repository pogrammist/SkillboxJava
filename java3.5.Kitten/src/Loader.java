
public class Loader {
    public static void main(String[] args) {
        Cat cat = new Cat(Math.random() * 10000.0);
        System.out.println(cat.getWeight());

        Cat kitten = getKitten();
        System.out.println(kitten.getWeight());
    }

    public static Cat getKitten() {
        Double minWeight = 100.0;
        Double maxWeight = 200.0;
        Double weight = Math.random() * (maxWeight - minWeight) + minWeight;
        Cat kitten = new Cat(weight);
        return kitten;
    }
}