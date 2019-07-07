import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FireStarter {
    public static void main(String[] args) throws IOException {
        System.out.println("\nВведите рандомное ФИО через пробелы");
        String inputName = (new BufferedReader(new InputStreamReader(System.in))).readLine();

        String[] fullName = inputName.split("\\s+");
        System.out.println("Фамилия: " + fullName[0] + "\nИмя: " + fullName[1] + "\nОтчество: " + fullName[2]);
    }
}
