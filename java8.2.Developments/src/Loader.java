import javax.swing.*;

public class Loader {
    private static Frame frame = new Frame();

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                frame.setUpFirstForm();
            }
        });
    }
}
