package project.subFrames;
import project.entity.CustomerAccount;
import project.mainFrames.MainFrame;

import javax.swing.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class Register extends MainFrame {
    private JLabel name,phoneNumber,note1,note2,registerLabel;
    private JTextField nameField,phoneField;
    private JPasswordField passField;
    private JButton createAccount;

    public Register(){
        super(" REGISTER ");
        this.setSize(375, 550);
        this.setLocation(450, 80);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        name=new JLabel("Name*");
        name.setBounds(30,165,100,50);
        panel.add(name);

        nameField=new JTextField();
        nameField.setBounds(30,205,300,22);
        panel.add(nameField);

        appleIDLabel =new JLabel("AppleID*");
        appleIDLabel.setBounds(30,210,100,50);
        panel.add(appleIDLabel);

        textField=new JTextField("i@icloud.com");
        textField.setBounds(30,250,300,22);
        panel.add(textField);

        phoneNumber =new JLabel("Phone Number*");
        phoneNumber.setBounds(30,255,100,50);
        panel.add(phoneNumber);

        phoneField=new JTextField("01319972304");
        phoneField.setBounds(30,295,300,22);
        panel.add(phoneField);

        passwordLabel =new JLabel("Password*");
        passwordLabel.setBounds(30,300,100,50);
        panel.add(passwordLabel);

        passField=new JPasswordField();
        passField.setBounds(30,340,300,22);;
        panel.add(passField);

        JLabel confirmPassword=new JLabel("Confirm Password*");
        confirmPassword.setBounds(30,345,200,50);
        panel.add(confirmPassword);

        passwordField = new JPasswordField();
        passwordField.setBounds(30,385,300,22);
        panel.add(passwordField);

        loginButton = new JButton(" LOG IN ");
        loginButton.setBounds(228,80,85,35);
        loginButton.addActionListener(this);
        panel.add(loginButton);

        createAccount = new JButton(" CREATE ACCOUNT ");
        createAccount.setBounds(30, 420, 300,40);
        createAccount.addActionListener(this);
        panel.add(createAccount);

        registerLabel = new JLabel(" REGISTER ");
        registerLabel.setBounds(45,80,105,35);
        panel.add(registerLabel);

        note1=new JLabel("By creating an account you agree to Apple.com");
        note1.setBounds(35,465,400,200);
        panel.add(note1);

        note2=new JLabel("Privacy Policy and Conditions");
        note2.setBounds(85,480,400,200);
        panel.add(note2);

    }
    public void actionPerformed(ActionEvent ae) {
        String username = nameField.getText().trim();
        String userphone = phoneField.getText().trim();
        String userAppleID = textField.getText().trim();
        String userPassword = passField.getText().trim();
        long phoneNumber = 0;
        int count = 0;
        try {
            phoneNumber = Integer.parseInt(userphone);
            if (userphone.length() != 11) {
                count++;}
            }
        catch(Exception ex){
                count = 1;
            }
        if(ae.getActionCommand().equals(" LOG IN ")) {
                MainFrame logIn = new Login();
                logIn.setVisible(true);
                this.setVisible(false);
            }
        else if(ae.getActionCommand().equals(" CREATE ACCOUNT ")){
            if(username.isEmpty()||userphone.isEmpty()||userAppleID.isEmpty()||userPassword.isEmpty()){
                showMessageDialog(this, "Please fill up all");
            }
             if (count > 0) {
                showMessageDialog(null, "Invalid Phone Number", " Error!", JOptionPane.WARNING_MESSAGE);
             }
             else{
                 CustomerAccount account = new CustomerAccount(username,userphone,userAppleID,userPassword);
                 account.addusraccount();
                 showMessageDialog(this, "Account created successfully");
             }
             }
        }
    }