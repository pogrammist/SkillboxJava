import javax.swing.*;

public class Frame {
    private static JFrame frame;
    private static Form firstForm;
    private static Form2 secondForm;

    Frame() {
        frame = new JFrame();

        firstForm = new Form();
        firstForm.onSecondForm(actionEvent -> {
            Form sourceForm = (Form) actionEvent.getSource();
            String fullName = sourceForm.getSurnameTextField() + " " + sourceForm.getNameTextField() + " " + sourceForm.getPatronymicTextField();
            secondForm.setFullNameTextField(fullName);
            Frame.renderJFrame(secondForm.getRootPanel());
        });

        secondForm = new Form2();
        secondForm.onFirstForm(actionEvent -> {
            Form2 sourceForm = (Form2) actionEvent.getSource();
            try {
                String[] fullName = sourceForm.getFullNameTextField();
                firstForm.setSurnameTextField(fullName[0]);
                firstForm.setNameTextField(fullName[1]);
                firstForm.setPatronymicTextField(fullName[2]);
                Frame.renderJFrame(firstForm.getRootPanel());
            } catch (Exception e1) {
                secondForm.setMessage("Enter full name please");
            }
        });
    }

    private static void renderJFrame(JPanel jPanel) {
        frame.setContentPane(jPanel);
        frame.setTitle("GUI Basics");
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getRootPane().grabFocus();
        frame.setVisible(true);
    }

    public void setUpFirstForm() {
        Frame.renderJFrame(firstForm.getRootPanel());
    }
}

