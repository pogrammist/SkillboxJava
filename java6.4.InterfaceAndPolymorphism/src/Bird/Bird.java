package Bird;

public abstract class Bird implements Vertebrata, Comparable<Bird> {

    public double weight;

    public Bird(){
        weight = 10 + 100 * Math.random();
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

    public void voice() {
        System.out.println(weight);
    };
    public int compareTo(Bird bird) {
        return (int) (bird.weight - this.weight);
    };
}
