package project.entity;
import project.subFrames.Login;
import project.subFrames.ProductInfo;
import project.mainFrames.MainFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class AdminPanel extends JFrame implements ActionListener {

    JPanel panel;

    JLabel l1, imagelabel;
    JButton b1, b2, b3, b4;

    Color mycolor;
    Font myfont;
    ImageIcon img;

    public AdminPanel() {
        super("Admin Panel");
        this.setSize(1000, 700);
        this.setLocation(100, 60);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);

        l1 = new JLabel("Apple");
        l1.setBounds(120, 65, 140, 40);
        l1.setFont(new Font("Calibri", Font.BOLD, 39));
        panel.add(l1);


        b1 = new JButton(" Products Info ");
        b1.setBounds(200, 300, 150, 40);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setOpaque(true);
        b1.addActionListener(this);
        panel.add(b1);

        b2 = new JButton("Manager Info");
        b2.setBounds(450, 300, 120, 40);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setOpaque(true);
        b1.addActionListener(this);
        panel.add(b2);

        b3 = new JButton("Sells Info");
        b3.setBounds(700, 300, 120, 40);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setOpaque(true);
        b3.addActionListener(this);
        panel.add(b3);

        b4 = new JButton("Sign out");
        b4.setBounds(450, 450, 120, 40);
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setOpaque(true);
        b4.addActionListener(this);
        panel.add(b4);

        img = new ImageIcon("project/picture/apple1.png");
        imagelabel = new JLabel(img);
        imagelabel.setBounds(60, 50, 60, 50);
        panel.add(imagelabel);

        img = new ImageIcon("project/picture/products.png");
        imagelabel = new JLabel(img);
        imagelabel.setBounds(160, 150, 196, 150);
        panel.add(imagelabel);

        // img = new ImageIcon("products.png");
        // imagelabel = new JLabel(img);
        // imagelabel.setBounds(160,150,196,150);
        // panel.add(imagelabel);

        img = new ImageIcon("project/picture/manager.png");
        imagelabel = new JLabel(img);
        imagelabel.setBounds(415, 150, 196, 150);
        panel.add(imagelabel);

        img = new ImageIcon("project/picture/sells.png");
        imagelabel = new JLabel(img);
        imagelabel.setBounds(665, 150, 196, 150);
        panel.add(imagelabel);

        img = new ImageIcon("project/picture/admin.png");
        imagelabel = new JLabel(img);
        imagelabel.setBounds(800, 0, 196, 150);
        panel.add(imagelabel);


        this.add(panel);


    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals(" Products Info ")) {
            ProductInfo product = new ProductInfo();
             product.setVisible(true);
             this.setVisible(false);
        }
//        else if (ae.getActionCommand().equals("Sells Info")) {
//            SellsInfo sells = new SellsInfo();
//            sells.setVisible(true);
//            this.setVisible(false);
//        }
//        else if (ae.getActionCommand().equals("Sells Info")) {
//            SellsInfo sells = new SellsInfo();
//            sells.setVisible(true);
//            this.setVisible(false);
//        }
        else if (ae.getActionCommand().equals("Sells Info")) {
            AddManager sells = new AddManager();
            sells.setVisible(true);
            this.setVisible(false);
        }
        else if (ae.getActionCommand().equals("Sign out")) {
                MainFrame login = new Login();
                     login.setVisible(true);
                     this.setVisible(false);
        }
    }
}