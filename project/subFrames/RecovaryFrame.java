package project.subFrames;
import project.mainFrames.MainFrame;
import javax.swing.*;
import java.awt.event.*;

public class RecovaryFrame extends MainFrame {
    private JLabel newPassword,confirmPassword;
    private JButton ConfirmButton;
    public RecovaryFrame(){
        super(" Create New Password ");
        this.setSize(375, 300);
        this.setLocation(450, 80);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
            newPassword =new JLabel(" Enter Your New Password* ");
			newPassword.setBounds(27,90,200,50);
			panel.add(newPassword);
            
            textField = new JTextField();
			textField.setBounds(30,130,300,22);
            panel.add(textField);

            confirmPassword  =new JLabel(" Confirm Your New Password* ");
			confirmPassword.setBounds(27,136,200,50);
			panel.add(confirmPassword);

            passwordField = new JPasswordField();
			passwordField.setBounds(30,175,300,22);
			panel.add(passwordField);

            ConfirmButton = new JButton(" CONFIRM ");
			ConfirmButton.setBounds(103,205,150,35);
			ConfirmButton.addActionListener(this);
			panel.add(ConfirmButton);

            loginButton = new JButton(" LOG IN ");
            loginButton.setBounds(230,75,83,35);
            loginButton.addActionListener(this);
            panel.add(loginButton);
            

}
            public void actionPerformed(ActionEvent ae) {
                if (ae.getActionCommand().equals(" LOG IN ")) {
                    MainFrame logIn = new Login();
                    logIn.setVisible(true);   
                    this.setVisible(false);  
    }
}
}

