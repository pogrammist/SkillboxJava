import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TextAnalyzerTest {

    String text = "Are are are The the the Is is Is";
    TextAnalyzer textAnalyzer = new TextAnalyzer(text);

    //  Тесты переделал, но незначительно, изменил проверяемый массив, добавил конкурентные слова.
    //  Но тест на самое частое слово по сути не изменился.
    //  Из конкурентных слов всегда будет выводиться первое,
    //  так как TreeMap<String, Integer> wordCounts наполняется последовательно,
    //  а на его основании происходит сортировка исходного списка ArrayList<String> words.
    //  Возможно есть другой метод тестирования конкурентных слов, но я не нахожу его.

    @Test
    public void analyzer_will_return_compare_two_array_words() {
        ArrayList<String> actualList = textAnalyzer.getWords();
        List<String> expectedList = Arrays.asList("are", "are", "are", "the", "the", "the", "is", "is", "is");
        Assert.assertEquals(expectedList, actualList);
    }

    @Test
    public void analyzer_will_return_first_most_frequent_word_out_of_any_else_frequent_words() {
        String actualString = textAnalyzer.getMostFrequentWord();
        String expectString = "are";
        Assert.assertEquals(actualString, expectString);
    }

    @Test
    public void analyzer_will_return_fail() {
        try {
            TextAnalyzer nullTextAnalyzer = new TextAnalyzer(null);
            nullTextAnalyzer.getMostFrequentWord();
            Assert.fail("Exception was expected for null input");
        } catch (NullPointerException e) {
        }
        try {
            TextAnalyzer nullTextAnalyzer = new TextAnalyzer("");
            nullTextAnalyzer.getMostFrequentWord();
            Assert.fail("Exception was expected for null input");
        } catch (IndexOutOfBoundsException e) {
        }
    }

    @Test
    public void splitTextIntoFragmentsTest() {
//        String[] actualArrayString = textAnalyzer.O_o
//        Google говорит не проверять приватный метод!)
//        А что делать если очень хочется?
    }
}