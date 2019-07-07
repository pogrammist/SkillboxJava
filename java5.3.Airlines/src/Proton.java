import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Proton {

    //Полетели!!!
    public static void main(String[] args) throws IOException {
        System.out.println("Введите опозновательный номер самолета:");

        BufferedReader inputNumber = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> ships = new ArrayList<>();

        for (; ; ) {
            String airplane = inputNumber.readLine().trim();

            if ((airplane.equals("exitAll") || airplane.equals("exitLast")) && ships.size() == 0) {
            } else if (airplane.equals("exitLast")) {
                System.out.println("Самолет №" + ships.remove(ships.size() - 1) + " улетел");
            } else if (airplane.equals("exitAll")) {
                for (int item = ships.size() - 1; item >= 0; item--) {
                    System.out.println("Самолет №" + ships.get(item));
                    ships.remove(item);
                }
            } else if (ships.size() >= 5) {
                System.out.println("Ангар полный. Въезд запрещен");
            } else if (airplane.matches("\\s*")) {
                System.out.println("Повторите ввод");
            } else {
                ships.add(airplane);
            }
        }
    }
}
