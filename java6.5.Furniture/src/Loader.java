import core.Furniture;
import core.*;

public class Loader {

    public static void main(String[] args) {
        Furniture table = new Table();
        table.buy(10);
        table.compile(34);
        table.disassemble(23);
        table.sale(232);
        table.move(432432);

        System.out.println();

        Furniture chair = new Chair();
        chair.buy(10);
        chair.compile();
        chair.disassemble();
        chair.sale(232);
        chair.move(3443);
    }
}
