package project.mainFrames;
import java.awt.event.*;
import javax.swing.*;
public abstract class MainFrame extends JFrame implements ActionListener {
    protected JPanel panel;
    protected JLabel appleIDLabel,passwordLabel,imageLabel;
    protected JTextField textField;
    protected ImageIcon imageIcon;
    protected JPasswordField passwordField;
    protected JButton loginButton, registerButton, forgetButton;
    public MainFrame(String title) {
        super(title);
        this.setSize(375, 350);
        this.setLocation(450, 80);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
        panel.setLayout(null);

        imageIcon = new ImageIcon("project/mainFrames/logo.png");
		imageLabel = new JLabel(imageIcon);
		imageLabel.setBounds(115,10,128,64);
		panel.add(imageLabel);
        super.add(panel);
    }
    public abstract void actionPerformed(ActionEvent ae);
}
    
