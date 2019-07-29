import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static java.awt.event.KeyEvent.VK_ENTER;

public class Form {

    private JPanel rootPanel;

    private JTextField textField1;
    private JTextField textField2;

    private JButton button1;
    private JButton button2;

    private JTextField surnameTextField;
    private JTextField nameTextField;
    private JTextField patronymicTextField;

    public Form() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int random = (int) Math.round(10 * Math.random());
                textField1.setText(Integer.toString(random));
                button1.setBackground(Color.cyan);
            }
        });

        textField1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Color color = Color.RED;
                button1.setBackground(color);        //У меня в mac os не работает (Вроде проект сгенерировался без ошибок)
                button1.setText("Wow");
                textField1.setText("");
            }
        });

        textField1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                int length = textField1.getText().length();
                textField2.setText(Integer.toString(length));
//                textField2.setText(textField.getText());
            }
        });

        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                renderForm2();
            }
        });

        rootPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == VK_ENTER && e.isControlDown()) {
                    renderForm2();
                }
            }
        });
    }

    private void renderForm2() {
        Form2 form2 = new Form2();
        String fullName = surnameTextField.getText() + " " + nameTextField.getText() + " " + patronymicTextField.getText();
        form2.setFullNameTextField(fullName);
        Loader.renderJFrame(form2.getRootPanel());
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public void setSurnameTextField(String surname) {
        this.surnameTextField.setText(surname);
    }

    public void setNameTextField(String name) {
        this.nameTextField.setText(name);
    }

    public void setPatronymicTextField(String patronymic) {
        this.patronymicTextField.setText(patronymic);
    }
}
