public class Duck extends FlyingBird {

    public void swim() {
        System.out.println("Dive Up Dive Up Dive Up");
    }

    public void catchFish(){
        System.out.println("Hunt Up");
    }

    public void eat() {
        catchFish();
        super.eat();
    }

    public void sing() {
        System.out.println("Quack Quack Quack");
    }
}
