package Bird;

public abstract class Bird {

    public Bird(){
        System.out.println(getClass().getSimpleName());
    }

    public void eat() {
        System.out.println("Peck Peck Peck");
    }

    public void walk() {
        System.out.println("Flip Flop");
    }

    public void run() {
        System.out.println("Flip Flop Flip Flop Flip Flop");
    }

    public abstract void voice();
}
