import javax.swing.*;
import java.awt.event.*;

public class Form2 {

    private JPanel rootPanel;

    private JTextField fullNameTextField;

    private JButton onFirstForm;

    private JLabel message;

    private ActionListener onNextFormListener = null;

    public Form2() {

        onFirstForm.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                rendeFirstrForm();
            }
        });

        rootPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                rendeFirstrForm();
            }
        });
    }

//    private void renderForm() {
//        try {
//            Form form = new Form();
//            String[] fullName = fullNameTextField.getText().split(" ");
//            form.setSurnameTextField(fullName[0]);
//            form.setNameTextField(fullName[1]);
//            form.setPatronymicTextField(fullName[2]);
//            Loader.renderJFrame(form.getRootPanel());
//        } catch (Exception e1) {
//            message.setText("Enter full name please");
//        }
//    }

    public void onFirstForm(ActionListener actionListener) {
        onNextFormListener = actionListener;
    }

    private void rendeFirstrForm() {
        if (onNextFormListener != null) {
            onNextFormListener.actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "Form Switch"));
        }
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public String[] getFullNameTextField() {
        return this.fullNameTextField.getText().split(" ");
    }

    public void setFullNameTextField(String fullName) {
        this.fullNameTextField.setText(fullName);
    }

    public void setMessage(String message) {
        this.message.setText(message.toString());
    }
}
