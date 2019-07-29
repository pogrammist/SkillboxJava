import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AuthProfile {
    private JPanel headerPanel;
    private JButton lowButton;
    private JButton exitButton;
    private JPanel bodyPanel;
    private JPanel logoPanel;
    private JTextPane helpPane;
    private JButton saveButton;
    private JTextField nameField;
    private JTextField surnameField;
    private JPanel rootPanel;

    public AuthProfile() {

        bodyPanel.setLayout(new BoxLayout(bodyPanel, BoxLayout.Y_AXIS));
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}
