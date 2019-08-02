import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TextAnalyzerTest {

    String text = "Are are are The the the Is is Is";
    TextAnalyzer textAnalyzer = new TextAnalyzer(text);

    @Test
    public void analyzer_will_return_compare_two_array_words() {
        ArrayList<String> actualList = textAnalyzer.getWords();
        List<String> expectedList = Arrays.asList("are", "are", "are", "the", "the", "the", "is", "is", "is");
        Assert.assertEquals(expectedList, actualList);
    }

    //  CodeCoverage в IntelliJ Idea показывает
    //  100% на класса Loader и TextAnalyzer
    //  0% на TextAnalyzerTest вполне логично
    //  Но в классе Loader остались серые участки
    //  Поэтому создал еще один тест,
    //  который ни на что не повлиял

    @Test(expected = NoSuchFileException.class)
    public void analyzer_will_return_fail_if_read_file_is_absent() throws IOException {
        //  Создаю и удаляю временную папку,
        //  чтобы наверняка читать несуществующий файл
        //  Возможно есть более лаконичное решение исключения одноименного файла
        Path tmpDir = Files.createTempDirectory("tmp");
        tmpDir.toFile().delete();
        String text = new String(Files.readAllBytes(Paths.get("tmp/text_01.txt")));
    }

    @Test(expected = NullPointerException.class)
    public void analyzer_will_return_fail_if_input_text_is_null() throws IOException {
        TextAnalyzer nullTextAnalyzer = new TextAnalyzer(null);
        nullTextAnalyzer.getMostFrequentWord();
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void analyzer_will_return_fail_if_input_text_is_empty() throws IOException {
        TextAnalyzer nullTextAnalyzer = new TextAnalyzer("");
        nullTextAnalyzer.getMostFrequentWord();
    }

    @Test
    public void analyzer_will_return_first_most_frequent_word_out_of_any_else_frequent_words() {
        String actualString = textAnalyzer.getMostFrequentWord();
        String expectString = "are";
        Assert.assertEquals(actualString, expectString);
    }

    @Test
    public void splitTextIntoFragmentsTest() {
//        String[] actualArrayString = textAnalyzer.O_o
//        Google говорит не проверять приватный метод!)
//        А что делать если очень хочется?
    }
}