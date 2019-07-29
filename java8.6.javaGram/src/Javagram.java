import javax.swing.*;

public class Javagram {

    private static JFrame jFrame = new JFrame();

    public static void renderJFrame(JPanel jPanel) {

        jFrame.setContentPane(jPanel);
        jFrame.setTitle("Javagram");
        jFrame.setSize(800, 600);
        jFrame.setLocationRelativeTo(null);
//        jFrame.setUndecorated(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {

        AuthNumber authNumber = new AuthNumber();
        renderJFrame(authNumber.getRootPanel());
    }
}
