package Bird;

public class Duck extends FlyingBird {

    public void eat() {
        swim();
        catchFish();
        System.out.println("Om-Nom-nom");
    }

    @Override
    public void voice() {
        System.out.println("Quack Quack Quack");
    }

    private void catchFish() {
        System.out.println("Hunt Up");
    }

    public void swim() {
        System.out.println("Dive Up Dive Up Dive Up");
    }
}
