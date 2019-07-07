
public class Loader {
    public static void main(String[] args) {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

        int vasya = Integer.parseInt(text.substring(15, text.indexOf("руб")).trim());
        int masha = Integer.parseInt(text.substring(text.lastIndexOf("-") + 1, text.lastIndexOf("руб")).trim());

        System.out.println(vasya + masha);
    }
}