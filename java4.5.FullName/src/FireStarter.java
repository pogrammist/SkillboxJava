import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FireStarter {
    public static void main(String[] args) throws IOException {
        System.out.println("\nВведите рандомное ФИО через пробелы");
        String inputName = (new BufferedReader(new InputStreamReader(System.in))).readLine();

        String surname = "Фамилия: " + inputName.substring(0, inputName.indexOf(" "));
        String name = "Имя:" + inputName.substring(inputName.indexOf(" "), inputName.lastIndexOf(" "));
        String patronymic = "Отчество:" + inputName.substring(inputName.lastIndexOf(" "));

        System.out.println(surname + "\n" + name + "\n" + patronymic);
    }
}
