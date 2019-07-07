package Bird;

public class Hen extends FlightlessBird {

    private void dabGrains() {
        System.out.println("Target grains");
    }

    public void eat() {
        burrow();
        dabGrains();
        super.eat();
    }

    @Override
    public void voice() {
        System.out.println("Ko-ko-ko, Ko-ko-ko");
    }

    @Override
    public void burrow() {
        System.out.println("Dig down");
    }
}
