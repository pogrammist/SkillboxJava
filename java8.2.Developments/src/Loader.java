import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Loader {
    public static void main(String[] args) {

        JFrame frame = new JFrame();

        Form form = new Form();
        frame.setContentPane(form.getRootPanel());

//        frame.setLayout(new FlowLayout());
//        JButton button = new JButton();
//        button.setText("Click me");
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                frame.getContentPane().setBackground(Color.RED);
//            }
//        });
//        frame.add(button);

        frame.setTitle("GUI Basics");
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

