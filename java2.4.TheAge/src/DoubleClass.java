public class DoubleClass {
    public static int min(int a, int b, int c) {
        //напишите тут ваш код
        int x = 0;
        if (a <= b && a <= c) {
            return x = a;
        } else if (b <= a && b <= c) {
            return x = b;
        } else if (c <= a && c <= b) {
            return x = c;
        }
        return x;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }

}