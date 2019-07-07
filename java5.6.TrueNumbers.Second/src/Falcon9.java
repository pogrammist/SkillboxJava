import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class Falcon9 {

    private String chars[] = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
    private ArrayList<String> carNumbers = new ArrayList<>();

    private Falcon9() {
        for (int a = 0; a < chars.length; a++) {
            for (int num = 1; num < 1000; num++) {
                for (int reg = 1; reg <= 95; reg++) {
                    carNumbers.add(chars[a] + String.format("%03d", num) + chars[a] + chars[a] + String.format("%02d", reg) + "RUS");
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Falcon9 checker = new Falcon9();
        System.out.println("Введите регистрационный номер автомобиля в формате \"а123вс45rus\":");
        BufferedReader inputNumber = new BufferedReader(new InputStreamReader(System.in));
        for (; ; ) {
            String currentNumber = inputNumber.readLine().trim().toUpperCase();
            checker.getTrueNumber(currentNumber);
            checker.getTrueNumberBinarySearch(currentNumber);
            checker.getTrueNumberHashSet(currentNumber);
            checker.getTrueNumberTreeSet(currentNumber);
        }
    }

    private void getTrueNumber(String currentNumber) {
        boolean find = false;
        long startTime = System.nanoTime();
        for (String item : carNumbers) {
            if (currentNumber.equals(item)) {
                System.out.printf("true (%tL ms)\n", System.nanoTime() - startTime);
                find = true;
                break;
            }
        }
        if (find != true) {
            System.out.printf("false (%tL ms)\n", System.nanoTime() - startTime);
        }
    }

    private void getTrueNumberBinarySearch(String currentNumber) {
        Collections.sort(carNumbers);
        long startTime = System.nanoTime();
        int find = Collections.binarySearch(carNumbers, currentNumber);
        if (find > 0) {
            System.out.printf("true (%tL ms)\n", System.nanoTime() - startTime);
        } else {
            System.out.printf("false (%tL ms)\n", System.nanoTime() - startTime);
        }
    }

    private void getTrueNumberHashSet(String currentNumber) {
        HashSet<String> carNumbersHashSet = new HashSet<>(carNumbers);
        long startTime = System.nanoTime();
        if (carNumbersHashSet.contains(currentNumber)) {
            System.out.printf("true (%tL ms)\n", System.nanoTime() - startTime);
        } else {
            System.out.printf("false (%tL ms)\n", System.nanoTime() - startTime);
        }
    }

    private void getTrueNumberTreeSet(String currentNumber) {
        TreeSet carNumbersTreeSet = new TreeSet(carNumbers);
        long startTime = System.nanoTime();
        if (carNumbersTreeSet.contains(currentNumber)) {
            System.out.printf("true (%tL ms)\n", System.nanoTime() - startTime);
        } else {
            System.out.printf("false (%tL ms)\n", System.nanoTime() - startTime);
        }
    }
}