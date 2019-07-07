import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class ModelY {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        TreeSet<String> allDrugs = new TreeSet<>();
        for (; ; ) {
            System.out.println("Введите название лекарства:");
            String drug = input.readLine().trim();
//            if (drug.equals("LIST") && allDrugs.isEmpty()) {
//            } else
            if (drug.equals("LIST")) {
                for (String item : allDrugs) {
                    System.out.println(item);
                }
            } else if (drug.matches("\\s*")) {
            } else {
                allDrugs.add(drug);
            }
        }
    }
}
