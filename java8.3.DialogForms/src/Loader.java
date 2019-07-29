import javax.swing.*;

public class Loader {

    public static JFrame frame = new JFrame();

    public static void renderJFrame(JPanel jPanel) {

        jPanel.setFocusable(true); //Вывел отдельно

        frame.setContentPane(jPanel);
        frame.setTitle("GUI Basics");
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Form form = new Form();
        renderJFrame(form.getRootPanel());
    }
}

