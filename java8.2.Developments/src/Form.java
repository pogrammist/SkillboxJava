import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static java.awt.event.KeyEvent.VK_ENTER;

public class Form {

    private JPanel rootPanel;

    private JTextField textField1;
    private JTextField textField2;

    private JButton clickMe;
    private JButton onSecondForm;

    private JTextField surnameTextField;
    private JTextField nameTextField;
    private JTextField patronymicTextField;

    private ActionListener onSecondFormListener = null;

    public Form() {
        clickMe.addActionListener(actionEvent -> {
            int random = (int) Math.round(10 * Math.random());
            textField1.setText(Integer.toString(random));
            clickMe.setBackground(Color.cyan);
        });

        //  Как применить лямбда выражение,
        //  когда интерфейс имеет несколько методов?
        //  Если это возможно? Судя по всему невозможно
        textField1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Color color = Color.RED;
                clickMe.setBorderPainted(false);
                clickMe.setOpaque(true);
                clickMe.setBackground(color);
                clickMe.setText("Wow");
                textField1.setText("");
            }
        });

        textField1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                int length = textField1.getText().length();
                textField2.setText(Integer.toString(length));
            }
        });

        onSecondForm.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                renderSecondForm();
            }
        });

        //  Вопрос: Для задания со звездочкой
        //  как всегда держать в фокусе jframe/rootPanel,
        //  что бы переключаться с формы на форму
        //  по нажатих клавиш Ctrl + Enter?
        rootPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == VK_ENTER && e.isControlDown()) {
                    renderSecondForm();
                }
            }
        });
    }

    public void onSecondForm(ActionListener actionListener) {
        onSecondFormListener = actionListener;
    }

    private void renderSecondForm() {
        if (onSecondFormListener != null) {
            //Вот тут непонятно, где почитать?
            onSecondFormListener.actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "Form Switch"));
        }
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public void setSurnameTextField(String surname) {
        this.surnameTextField.setText(surname);
    }

    public String getSurnameTextField() {
        return this.surnameTextField.getText();
    }

    public void setNameTextField(String name) {
        this.nameTextField.setText(name);
    }

    public String getNameTextField() {
        return this.nameTextField.getText();
    }

    public void setPatronymicTextField(String patronymic) {
        this.patronymicTextField.setText(patronymic);
    }

    public String getPatronymicTextField() {
        return this.patronymicTextField.getText();
    }
}
