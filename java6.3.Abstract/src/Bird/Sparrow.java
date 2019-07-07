package Bird;

public class Sparrow extends FlyingBird {

    private void bug() {
        System.out.println("Target bug");
    }

    public void eat() {
        fly();
        bug();
        super.eat();
    }

    public void fly() {
        System.out.println("Rocket Up Rocket Up Rocket Up");
    }

    @Override
    public void voice() {
        System.out.println("Trill Trill Trill");
    }
}
