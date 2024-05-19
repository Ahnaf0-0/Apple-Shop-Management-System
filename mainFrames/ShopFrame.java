package project.mainFrames;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public abstract class ShopFrame extends JFrame implements ActionListener{
    protected JPanel panel,miniPanel;
    protected JLabel note,picture;
    protected ImageIcon img;
    protected JButton details1,store,logOut,home,button,details2,details3,mac,iPad,iPhone,appleWatch,vision,airPods,cart;
    protected Font myFont;

    public ShopFrame(String title){
        super(title);
        this.setSize(1280,780);
        this.setLocation(0,0);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        miniPanel=new JPanel();
        miniPanel.setBackground(Color.LIGHT_GRAY);
        miniPanel.setBounds(0,0,1280,36);

        
        panel=new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);

        img=new ImageIcon("applelogo.png");
        
        home=new JButton(img);
        home.setBounds(286,30,85,30);
        home.setBackground(Color.WHITE);
        home.addActionListener(this);
        miniPanel.add(home);


        store= new JButton(" Store ");
        store.setBounds(350,30,68,30);
        store.setBackground(Color.WHITE);
        store.addActionListener(this);
        miniPanel.add(store);

        mac= new JButton(" Mac ");
        mac.setBounds(432,30,68,20);
        mac.setBackground(Color.WHITE);
        mac.addActionListener(this);
        miniPanel.add(mac);

        iPhone= new JButton(" iPhone ");
        iPhone.setBounds(500,30,100,20);
        iPhone.setBackground(Color.WHITE);
        iPhone.addActionListener(this);
        miniPanel.add(iPhone);

        iPad= new JButton(" iPad ");
        iPad.setBounds(600,30,100,20);
        iPad.setBackground(Color.WHITE);
        iPad.addActionListener(this);
        miniPanel.add(iPad);

        appleWatch= new JButton(" Watch ");
        appleWatch.setBounds(700,30,100,20);
        appleWatch.setBackground(Color.WHITE);
        appleWatch.addActionListener(this);
        miniPanel.add(appleWatch);

        airPods= new JButton(" AirPods ");
        airPods.setBounds(800,30,100,20);
        airPods.setBackground(Color.WHITE);
        airPods.addActionListener(this);
        miniPanel.add(airPods);
        
        vision= new JButton(" Vision ");
        vision.setBounds(900,30,100,20);
        vision.setBackground(Color.WHITE);
        vision.addActionListener(this);
        miniPanel.add(vision);

        cart= new JButton(" Cart ");
        cart.setBounds(1000,30,100,20);
        cart.setBackground(Color.WHITE);
        
        cart.addActionListener(this);
        miniPanel.add(cart);

        logOut= new JButton(" Log Out ");
        logOut.setBounds(1100,30,100,20);
        logOut.setBackground(Color.WHITE);
        
        logOut.addActionListener(this);
        miniPanel.add(logOut);

        note= new JLabel(" Visit an apple Store ");
        note.setBounds(1050,80,400,200);

        myFont = new Font("Calibri", Font.BOLD, 20);
        note.setFont(myFont);
        panel.add(note);

        details1=new JButton(" Find one near you > ");
        details1.setBounds(1050,188,170,25);
        details1.setBackground(Color.WHITE);
        details1.setForeground(Color.BLUE);
        panel.add(details1);

        super.add(miniPanel);
        super.add(panel);
    }
    public abstract void actionPerformed(ActionEvent ae);
}