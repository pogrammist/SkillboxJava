import java.nio.file.Files;
import java.nio.file.Paths;

public class Loader {
    public static void main(String[] args) throws Exception {
        //Reading file to the String
        String text = new String(Files.readAllBytes(Paths.get("res/text_01.txt")));

        TextAnalyzer analyzer = new TextAnalyzer(text);
        System.out.println("Most frequent word: " + analyzer.getMostFrequentWord());
    }
}