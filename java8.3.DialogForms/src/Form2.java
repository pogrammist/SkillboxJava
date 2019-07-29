import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Form2 {

    private JPanel rootPanel;

    private JTextField fullNameTextField;

    private JButton gotoFormButton;

    private JLabel Message;


    public Form2() {

        gotoFormButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                renderForm();
            }
        });

        rootPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                renderForm();
            }
        });
    }

    private void renderForm() {
        try {
            Form form = new Form();
            String[] fullName = fullNameTextField.getText().split(" ");
            form.setSurnameTextField(fullName[0]);
            form.setNameTextField(fullName[1]);
            form.setPatronymicTextField(fullName[2]);
            Loader.renderJFrame(form.getRootPanel());
        } catch (Exception e1) {
            Message.setText("Enter full name please");
        }
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public void setFullNameTextField(String fullName) {
        this.fullNameTextField.setText(fullName);
    }
}
