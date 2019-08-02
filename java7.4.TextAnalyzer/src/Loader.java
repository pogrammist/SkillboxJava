import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

public class Loader {
    public static void main(String[] args) throws Exception {
        //Reading file to the String

        //  Ловлю исключения на случай отсутствия файла
        String text = null;
        try {
            text = new String(Files.readAllBytes(Paths.get("res/text_01.txt")));
        } catch (NoSuchFileException e){
            System.out.println(e.toString());
        }

        TextAnalyzer analyzer = new TextAnalyzer(text);
        //  Ловлю исключения на случай пустого файла
        try {
            System.out.println("Most frequent word: " + analyzer.getMostFrequentWord());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}