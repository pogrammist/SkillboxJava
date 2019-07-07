public class Hen extends FlightlessBird {

    public void dabGrains() {
        System.out.println("Target grains");
    }

    public void eat() {
        dabGrains();
        super.eat();
    }
}
