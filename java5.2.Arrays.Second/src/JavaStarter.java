public class JavaStarter {
    public static void main(String[] args) {

        String colors[] = {"red", "orange", "yellow", "green", "cyan", "blue", "violet"};

//        Перебор половины массива
        for (int i = 0; i < colors.length / 2; i++) {
            String cache = colors[i];
            colors[i] = colors[colors.length - i - 1];
            colors[colors.length - i - 1] = cache;
        }

//        Вывод на печать
        for (String item : colors) {
            System.out.println(item);
        }
    }
}

