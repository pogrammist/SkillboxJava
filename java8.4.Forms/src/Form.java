import javax.swing.*;
import java.awt.event.*;

import static java.awt.event.KeyEvent.VK_ENTER;
import static javax.swing.JOptionPane.*;

public class Form {

    private JPanel rootPanel;
    private JPanel jPNorth;
    private JPanel jPSouth;
    private JPanel jPWest;
    private JPanel jPEast;
    private JPanel jPCenter;

    private JButton button;

    private JTextField surnameTextField;
    private JTextField nameTextField;
    private JTextField patronymicTextField;

    public Form() {

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (surnameTextField.getText().equals("") || nameTextField.getText().equals("")) {
                    showMessageDialog(rootPanel, "Pleace enter surname and name", "Error", ERROR_MESSAGE);
                } else if (patronymicTextField.getText().equals("")) {
                    int option = showConfirmDialog(rootPanel, "Pleace enter patronymic", "Error", YES_NO_OPTION);
                    if (option == YES_OPTION) {
                        renderForm2();
                    } else {
                        patronymicTextField.requestFocus();
                    }
                } else {
                    renderForm2();
                }
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
