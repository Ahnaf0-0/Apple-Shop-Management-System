package project.subFrames;
import java.awt.event.*;
import javax.swing.*;
import project.entity.AdminPanel;
import project.entity.CustomerAccount;
import project.mainFrames.MainFrame;
import project.mainFrames.ShopFrame;


public class Login extends MainFrame {
    private JLabel loginLabel;
    private final String[] adminAppleIds;
    private final String[] adminPasswords;
    private CustomerAccount ac;
    public Login() {
        super(" LOG IN FRAME  ");
        adminAppleIds =new String[]{"23-53376-3", "23-53056-3", "23-53361-3"};
        adminPasswords = new String[]{"Ahnaf", "Ratul", "Sabekon"};
        appleIDLabel = new JLabel("AppleID");
        appleIDLabel.setBounds(30, 120, 100, 50);

        panel.add(appleIDLabel);
        textField = new JTextField();
        textField.setBounds(30, 160, 300, 22);
        panel.add(textField);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(30, 165, 100, 50);
        panel.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(30, 205, 300, 22);
        panel.add(passwordField);

        loginButton = new JButton(" LOG IN ");
        loginButton.setBounds(30, 232, 300, 35);
        loginButton.addActionListener(this);
        panel.add(loginButton);

        loginLabel = new JLabel(" LOG IN ");
        loginLabel.setBounds(228, 80, 85, 35);
        panel.add(loginLabel);

        registerButton = new JButton(" REGISTER ");
        registerButton.setBounds(45, 80, 105, 35);
        registerButton.addActionListener(this);
        panel.add(registerButton);

        forgetButton = new JButton(" Forget Password? ");
        forgetButton.setBounds(30, 272, 150, 28);
        forgetButton.addActionListener(this);
        panel.add(forgetButton);
    }
    public void actionPerformed(ActionEvent ae) {
        String appleID = textField.getText();
        String userPassword = new String(passwordField.getPassword());
        ac = new CustomerAccount();
        if (ae.getActionCommand().equals(" LOG IN ")) {
            if (appleID.isEmpty() && userPassword.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill up all Details");
            } else {
                boolean loginSuccessful = false;
                for (int i = 0; i < adminAppleIds.length; i++) {
                    if (appleID.equals(adminAppleIds[i]) && userPassword.equals(adminPasswords[i])) {
                        loginSuccessful = true;
                        break;
                    }
                }
                if (loginSuccessful) {
                     JOptionPane.showMessageDialog(null, "Welcome Admin");
                               AdminPanel admin = new AdminPanel();
                                     admin.setVisible(true);
                                      this.setVisible(false);
                }    else if (ac.UserLogIn(appleID, userPassword)==true) {
                     JOptionPane.showMessageDialog(null, "Log in Succesfully");
                                ShopFrame s = new Store();
                                s.setVisible(true);
                                this.setVisible(false);
                }
                else  {
                    JOptionPane.showMessageDialog(this, "AppleID or Password Incorrect ");
                }
            }
        }
        else if (ae.getActionCommand().equals(" Forget Password? ")) {
                           MainFrame f = new ForgotPassFrame();
                           f.setVisible(true);
                           this.setVisible(false);
            }
        else if (ae.getActionCommand().equals(" REGISTER ")) {
                MainFrame r = new Register();
                r.setVisible(true);
                this.setVisible(false);
            }
        }
    }
