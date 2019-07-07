package core;

public abstract class Furniture {

//    Как создавать методы
//    которые могут принимать 0 и более аргументов?
//    Чтобы не было дублирования методов

    public abstract void buy(int money);

    public abstract void compile(int min);

    public abstract void disassemble(int min);

    public abstract void compile();

    public abstract void disassemble();

    public abstract void sale(int money);

    public abstract void move(int meter);
}