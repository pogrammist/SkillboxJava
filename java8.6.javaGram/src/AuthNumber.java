import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Auth {

    private JPanel rootPanel;
    private JPanel headerPanel;
    private JButton exitButton;
    private JButton lowButton;
    private JPanel bodyPanel;
    private JTextPane helpPane;
    private JFormattedTextField formatNamberTextField;
    private JPanel logoPanel;
    private JButton button1;

    public Auth() {

        bodyPanel.setLayout(new BoxLayout(bodyPanel, BoxLayout.Y_AXIS));

        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                AuthCode authCode = new AuthCode();
                Javagram.frame.
            }
        });

    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public void setBodyPanel(JPanel bodyPanel) {
        this.bodyPanel = bodyPanel;
    }
}
