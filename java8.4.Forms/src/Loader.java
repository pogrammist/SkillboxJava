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
        System.out.println("Swing это боль! Еще 20 лет назад в Delphi события создавались даблкликом!)");
        System.out.println("Работа с формами примитивна, установка размеров элементов в редакторе ни на что не влияет");
        System.out.println("Как производить установку размеров элементов? В классе? прописывать все размеры?");
        System.out.println("Swing точно не устарела?");
    }
}

