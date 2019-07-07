package core;

public class Chair extends Furniture{

    @Override //Насколько важна эта строка?
    public void buy(int money) {
        System.out.println("Do not " + money + "$. Is free!");
    }

    @Override
    public void compile(int min) {

    }

    @Override
    public void disassemble(int min) {

    }

    @Override
    public void compile() {
        System.out.println("This is finished furniture");
    }

    @Override
    public void disassemble() {
        System.out.println("This furniture is not collapsible");
    }

    @Override
    public void sale(int money) {
        System.out.println("Saled " + money + "$");
    }

    @Override
    public void move(int meter) {
        System.out.println("Moved " + meter + " meter");
    }
}
