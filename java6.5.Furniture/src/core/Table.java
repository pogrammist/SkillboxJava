package core;

public class Table extends Furniture {

    @Override
    public void buy(int money) {
        System.out.println("Pay " + money + "$");
    }

    @Override
    public void compile(int min) {
        System.out.println("Compile " + min + " min");
    }

    @Override
    public void disassemble(int min) {
        System.out.println("Disassemble " + min + " min");
    }

    @Override
    public void compile() {

    }

    @Override
    public void disassemble() {

    }

    @Override
    public void sale(int money) {
        System.out.println("It is do not to sale! Take away your " + money + "$");
    }

    @Override
    public void move(int meter) {
        System.out.println("Do not move! It is my Table! Getout to " + meter + " meter");
    }
}
