import javax.swing.*;

public class Loader {

    public static JFrame frame = new JFrame();

    public static void renderJFrame(JPanel jPanel) {

        //  Вопрос: как всегда держать в фокусе панель?
        //  Либо существует иной способ создать глобальный слушатель?
        jPanel.setFocusable(true);

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

        //  Вопрос: как слушатель привязать ко всему фрейму для переключения форм через клавиши?
        //  setFocusable костыль!
    }
}

