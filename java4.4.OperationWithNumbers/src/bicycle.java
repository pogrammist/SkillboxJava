import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bicycle {
    public static void main(String[] args) throws IOException {

        System.out.println("\nВведите количество контейнеров для отправки");

        int boxs = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
        int containers = (int) Math.ceil(boxs / 27.0);
        int trucks = (int) Math.ceil(containers / 16.0);

//        System.out.println(containers);
//        System.out.println(trucks);

        for (int truck = 1; truck <= trucks; truck++) {
            System.out.println("\nГрузовик " + truck + ":");
            for (int container = 1; container <= 16 && containers >= 1; container++, containers--) {
                System.out.println("\nКонтейнер " + container + ":");
                for (int box = 1; box <= 27 && boxs >= 1; box++, boxs--) {
                    System.out.println("\nЯщик " + box);
                }
            }
        }
    }
}

