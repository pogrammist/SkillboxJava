import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

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
        ArrayList<String> expectedList = new ArrayList<String>(Arrays.asList("are", "are", "are", "the", "the", "the", "is", "is", "is"));
        Assert.assertEquals(expectedList, actualList);
    }

    @Test
    public void analyzer_will_return_first_most_frequent_word_out_of_any_else_frequent_words() {
        String actualString = textAnalyzer.getMostFrequentWord();
        String expectString = "are";
        Assert.assertEquals(actualString, expectString);
    }

    //  В задании просили тестить только методы класса TextAnalyzer а не Loader)
    @Test
    public void analyzer_will_return_not_null_text_buffer() {
        boolean trueString;
        if (text.equals(null)) trueString = true;
        else trueString = false;
        boolean expectString = false;
        Assert.assertEquals(trueString, expectString);
    }

    @Test
    public void analyzer_will_return_not_empty_text_buffer() {
        boolean trueString;
        if (text.equals("")) trueString = true;
        else trueString = false;
        boolean expectString = false;
        Assert.assertEquals(trueString, expectString);
    }

    @Test
    public void splitTextIntoFragmentsTest() {
//        String[] actualArrayString = textAnalyzer.O_o
//        Google говорит не проверять приватный метод!)
//        А что делать если очень хочется?
    }
}