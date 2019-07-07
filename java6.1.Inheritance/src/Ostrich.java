public class Ostrich extends FlightlessBird {

    public void worm() {
        System.out.println("Target worm");
    }

    public void eat() {
        worm();
        super.eat();
    }
}
