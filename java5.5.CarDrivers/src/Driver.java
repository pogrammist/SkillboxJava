import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Driver {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, String> carDrivers = new HashMap<>();
//        Sample е001ее001rus
        String template = "[АВЕКМНОРСТУХ]\\d{3}(?<!000)[АВЕКМНОРСТУХ]{2}\\d{2,3}(?<!00)(?<!000)(RUS)";
        for (; ; ) {
            System.out.println("Please, type car number:");
            String inputNumber = reader.readLine().trim().toUpperCase();
            if (inputNumber.matches(template) && carDrivers.get(inputNumber) == null) {
                System.out.println("You have entered a new number. Please, type name driver:");
                String driver = reader.readLine().trim().toUpperCase();
                if (!driver.matches("\\s*")) {
                    carDrivers.put(inputNumber, driver);
                } else {
                    System.out.println("You entered an incorrect driver name");
                }
            } else if (inputNumber.matches(template)) {
//                It is true
                System.out.printf("%s => %s %n%n", inputNumber, carDrivers.get(inputNumber));

//                It is not true
//                for (String number : carDrivers.keySet()) {
//                    if (inputNumber.equals(number)) {
//                        System.out.println(inputNumber + " => " + carDrivers.get(number) + "\n");
//                    }
//                }
            }
        }
    }
}

