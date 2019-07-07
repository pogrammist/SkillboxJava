package Bird;

public class Ostrich extends FlightlessBird {

    private void worm() {
        System.out.println("Target worm");
    }

    public void eat() {
        burrow();
        worm();
        super.eat();
    }

    @Override
    public void voice() {
        System.out.println("Whish Whish Whish");
    }

    @Override
    public void burrow() {
        System.out.println("Dig left Dig right");
    }
}
