package project.subFrames;
import java.awt.event.*;
import javax.swing.*;
import project.mainFrames.MainFrame;
public class ForgotPassFrame extends MainFrame {
	private JLabel note,otp;
    private JButton continueButton;

    public ForgotPassFrame(){
        super("  Forgot Your Password? ");
		this.setSize(375, 300);
		this.setLocation(450, 80);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        note =new JLabel(" Enter Your Phone/E-Mail * ");
		note.setBounds(27,90,200,50);
        panel.add(note);
        textField = new JTextField();
        textField.setBounds(30,130,300,22);
        panel.add(textField);

        otp  =new JLabel(" Enter Your OTP* ");
		otp.setBounds(27,136,200,50);
        panel.add(otp);

        passwordField = new JPasswordField();
        passwordField.setBounds(30,175,300,22);
        panel.add(passwordField);

        continueButton = new JButton(" CONTINUE ");
		continueButton.setBounds(103,205,150,35);
        continueButton.addActionListener(this);
        panel.add(continueButton);
}
public void actionPerformed(ActionEvent ae) {
    if (ae.getActionCommand().equals(" CONTINUE ")) {
        MainFrame Rf = new RecovaryFrame();
        Rf.setVisible(true);
        this.setVisible(false);
    
    }
}
}
