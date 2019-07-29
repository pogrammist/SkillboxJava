import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AuthCode {
    private JPanel headerPanel;
    private JButton lowButton;
    private JButton exitButton;
    private JPanel bodyPanel;
    private JPanel logoPanel;
    private JTextPane helpPane;
    private JButton button1;
    private JTextPane numberPane;
    private JPasswordField codePasswordField;
    private JPanel rootPanel;

    public AuthCode() {

        bodyPanel.setLayout(new BoxLayout(bodyPanel, BoxLayout.Y_AXIS));

        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                AuthProfile authProfile = new AuthProfile();
                Javagram.renderJFrame(authProfile.getRootPanel());
            }
        });

    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}
