package project.mainFrames;
import project.subFrames.Store;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
abstract public  class Products extends JFrame implements ActionListener {
    protected JPanel panel;
    protected JLabel note,picture;
    protected ImageIcon img;
    protected JButton button;
    protected Font font;
    protected JTable table;
    protected JScrollPane scroll;
   
    public Products(String title){
        super(title);
        this.setSize(800,500);
        this.setLocation(200,200);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel=new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);

        button = new JButton(" BUY ");
		button.setBounds(680, 120, 70, 30);
		font=new Font("Calibri",Font.BOLD,20);
		button.setForeground(Color.BLUE);
        button.addActionListener(this);
		panel.add(button);

        button = new JButton(" Add To Cart ");
        button.setBounds(560, 120, 120, 30);
        font=new Font("Calibri",Font.BOLD,20);
        button.setForeground(Color.BLUE);
        button.addActionListener(this);
        panel.add(button);

        super.add(panel);
                

    }
    public  void actionPerformed(ActionEvent ae){
        if (ae.getActionCommand().equals(" BUY ")) {
            Store s=new Store();
            s.setVisible(true);
            this.setVisible(false);
        }
        else if (ae.getActionCommand().equals(" Add To Cart ")) {
            Store s=new Store();
            s.setVisible(true);
            this.setVisible(false);
        }
    }
}

        
        













       