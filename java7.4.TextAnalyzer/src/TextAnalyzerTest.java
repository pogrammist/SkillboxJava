import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class TextAnalyzerTest {

    String text = "The the the Is is Are";
    TextAnalyzer textAnalyzer = new TextAnalyzer(text);

    @Test
    public void getWordsTest() {
        ArrayList<String> actualList = textAnalyzer.getWords();
        ArrayList<String> expectedList = new ArrayList<String>(Arrays.asList("the", "the", "the", "is", "is", "are"));
        Assert.assertEquals(expectedList, actualList);
    }

    @Test
    public void getMostFrequentWordTest() {
        String actualString = textAnalyzer.getMostFrequentWord();
        String expectString = "the";
        Assert.assertEquals(expectString, actualString);
    }

    @Test
    public void splitTextIntoFragmentsTest() {
//        String[] actualArrayString = textAnalyzer.O_o
//        Google говорит не проверять приватный метод!)
//        А что делать если очень хочется?
    }
}