public class JavaStarter {
    public static void main(String[] args) {

        String colors[] = {"red", "orange", "yellow", "green", "cyan", "blue", "violet"};

        String twistColors[] = new String[colors.length];

//        System.out.println(twistColors.length);

        for (int i = 0; i < colors.length; i++) {
            twistColors[i] = colors[colors.length - i - 1];
//            System.out.println(twistColors[i]);
        }

        for (int i = 0; i < colors.length; i++) {
            colors[i] = twistColors[i];
            System.out.println(colors[i]);
        }
    }
}

