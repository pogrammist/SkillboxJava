public class Starter {
    public static void main(String[] args) {

        String chess[][] = new String[8][8];

//        String chars[] = new String[8];
//        int numbers[] = new int[8];
//
//        for (int i = 0; i < chars.length; i++) {
//            chars[i] = String.valueOf((char) (65 + i));
//            System.out.println(chars[i]);
//        }
//
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = 1 + i;
//            System.out.println(numbers[i]);
//        }
//
//        for (int i = 0; i < chess.length; i++) {
//            for (int s = 0; s < chess.length; s++) {
//                chess[s][i] = String.valueOf((char) (65 + s)) + (1 + i);
//                System.out.print(chess[s][i] + " ");
//            }
//            System.out.println();
//        }

        //Обратный порядок
        for (int i = chess.length - 1; i >= 0; i--) {
            for (int s = 0; s < chess.length; s++) {
                chess[s][i] = String.valueOf((char) ('A' + s)) + (1 + i);
                System.out.print(chess[s][i] + " ");
            }
            System.out.println();
        }
    }
}
