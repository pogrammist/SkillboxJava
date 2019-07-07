import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Loader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TreeMap<String, String> phoneBook = new TreeMap<>();

        String trueNumber = "\\+?\\d{1}\\s?\\d{3}\\s?\\d{3}-?\\d{2}-?\\d{2}";
        String trueName = "[^+]\\D+\\d*";

        //Sample      +0 123 456-78-90
        //Проверка
        String saga = "+0 123 456-78-90";
        String sara = "+1234567890";
        String gaga = "+01234567890";
        if (saga.matches(trueNumber)) {
            phoneBook.put("SAGA", saga);
        }
        if (sara.matches(trueNumber)) {
            phoneBook.put("SARA", sara);
        }
        if (gaga.matches(trueNumber)) {
            phoneBook.put("GAGA", gaga);
        }
        //System.out.println(phoneBook.keySet());

        //Пора бы создать отдельный класс с методами..
        for (; ; ) {
            System.out.println("Please, type telephone number or name:");
            String input = reader.readLine().trim().toUpperCase();

            if (input.equals("LIST")) {
                for (String name : phoneBook.keySet()) {
                    System.out.println(name + " => " + phoneBook.get(name));
                }

            } else if (input.matches("\\s*")) {
                System.out.println("You entered an incorrect data");

            } else if (phoneBook.get(input) != null) {
                //Номер обнаружен по имени
                System.out.println(input + " => " + phoneBook.get(input));

            } else if (input.matches(trueName)) {
                //Новый абонент
                System.out.println("\n" + "You have entered a new abonent name. Please, type phone number:");
                String number = reader.readLine().trim();
                if (number.matches(trueNumber)) {
                    phoneBook.put(input, number);
                    System.out.println("Name and number saved\n");
                } else {
                    System.out.println("You entered an incorrect number\n");
                }

            } else if (input.matches(trueNumber)) {
                //Не нашел более лаконичного решения
                int find = 0;
                for (String name : phoneBook.keySet()) {
                    //Абонент обнаружен по номеру
                    if (input.replaceAll("[^0-9]", "").equals(phoneBook.get(name).replaceAll("[^0-9]", ""))) {
                        System.out.println(name + " <= " + phoneBook.get(name));
                        find++;
                    }
                }
                if (find == 0) {
                    //Новый номер
                    System.out.println("\n" + "You have entered a new phone number. Please, type abonent name:");
                    String inputName = reader.readLine().trim().toUpperCase();
                    if (phoneBook.get(inputName) == null) {
                        phoneBook.put(inputName, input);
                        System.out.println("Name and number saved\n");
                    } else {
                        System.out.println("You entered an incorrect name\n");
                    }
                }
            }
        }
    }
}

