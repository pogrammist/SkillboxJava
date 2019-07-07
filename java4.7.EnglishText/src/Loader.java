import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Loader {
    public static void main(String[] args) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get("./src/strings.txt")));

        String[] words = content.replaceAll("[^a-zA-Z\\s+]", "").split("\\s+");

        for (int count = 0; count < words.length; count++) {
            System.out.println(words[count]);
        }
    }
}