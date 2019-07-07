public class Loader {
    public static void main(String[] args) {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

        String[] money = text.replaceAll("[^0-9\\s+]", "").replaceAll(" +", " ").trim().split("\\s+");

        int sum = 0;
        for (int count = 0; count < money.length; count++) {
            sum = Integer.parseInt(money[count]) + sum;
        }
        System.out.println(sum);
    }
}