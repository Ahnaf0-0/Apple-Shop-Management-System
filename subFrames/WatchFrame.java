package project.subFrames;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import project.mainFrames.Products;
import project.mainFrames.ShopFrame;
public class WatchFrame extends ShopFrame {
public WatchFrame(){
        super(" Watch Frame  ");

        note= new JLabel(" Store Watch ");
        note.setBounds(60,50,406,200);

        myFont = new Font("Calibri", Font.BOLD, 50);
        note.setFont(myFont);
        panel.add(note);

        note= new JLabel(" All Models ");
        note.setBounds(68,100,406,200);
        panel.add(note);

        myFont = new Font("Calibri", Font.BOLD, 20);
        note.setFont(myFont);
        panel.add(note);
//1
        img=new ImageIcon("project/picture/w8.png");
        picture=new JLabel (img);
        picture.setBounds(180,250,200,150);
        panel.add(picture);

        button = new JButton("Apple Watch Series 8");
        button.setBounds(190, 420, 180, 30);
        button.addActionListener(this);
        panel.add(button);
        //2
        img=new ImageIcon("project/picture/w9.png");
        picture=new JLabel (img);
        picture.setBounds(510,250,200,150);
        panel.add(picture);
        
        button = new JButton("Apple Watch Series 9");
        button.setBounds(520, 420, 180, 30);
        button.addActionListener(this);
        panel.add(button);
        //3
        img=new ImageIcon("project/picture/ultra.png");
        picture=new JLabel (img);
        picture.setBounds(860,250,200,150);
        panel.add(picture);
        
        button = new JButton("Apple Watch Ultra 1");
        button .setBounds(870, 420, 180, 30);
        button.addActionListener(this);
        panel.add(button );
        
        img=new ImageIcon("project/picture/ultra2.png");
        picture=new JLabel (img);
        picture.setBounds(180,480,200,150);
        panel.add(picture);
        //1
        button = new JButton(" Apple Watch Ultra 2 ");
        button.setBounds(190, 650, 180, 30);
        button.addActionListener(this);
        panel.add(button);
        
        img=new ImageIcon("project/picture/se.png");
        picture=new JLabel (img);
        picture.setBounds(510,480,200,150);
        panel.add(picture);
        //2
        button = new JButton(" Apple Watch SE ");
        button.setBounds(520, 650, 180, 30);
        button.addActionListener(this);
        panel.add(button);
        
        img=new ImageIcon("project/picture/w7.png");
        picture=new JLabel (img);
        picture.setBounds(860,480,200,150);
        panel.add(picture);
        //3
        button = new JButton("Apple Watch Hermès");
        button.setBounds(870,650,180, 30);
        button.addActionListener(this);
        panel.add(button);
    }
    
    public  void actionPerformed(ActionEvent ae){
        if (ae.getActionCommand().equals(" Store ")) {
            ShopFrame s=new Store();
            s.setVisible(true);
            this.setVisible(false);
        }
        else if (ae.getActionCommand().equals(" Mac ")) {
            ShopFrame mac=new MacFrame();
            mac.setVisible(true);
            this.setVisible(false);
        }
        else if (ae.getActionCommand().equals(" iPhone ")) {
            ShopFrame phone=new IPhoneFrame();
            phone.setVisible(true);
            this.setVisible(false);
        }
        else if (ae.getActionCommand().equals(" AirPods ")) {
            ShopFrame pod =new AirpodFrame();
            pod.setVisible(true);
            this.setVisible(false);
        }
        else if ( ae.getActionCommand().equals( " iPad " )) {
            ShopFrame ipad =new IPadFrame();
            ipad.setVisible(true);
            this.setVisible(false);
        }
        else if (ae.getActionCommand().equals( "Apple Watch Series 8" )) {
            Products series8 =new WatchSeries8();
            series8.setVisible(true);
            this.setVisible(false);
    }
        else if (ae.getActionCommand().equals( "Apple Watch Series 9" )) {
            Products series9 =new WatchSeries9();
            series9.setVisible(true);
            this.setVisible(false);
        }

        else if (ae.getActionCommand().equals( " Apple Watch Ultra 1 " )) {
            Products ultra1 =new WatchUltra1();
            ultra1.setVisible(true);
            this.setVisible(false);
        }
        else if (ae.getActionCommand().equals( " Apple Watch Ultra 2 " )) {
            Products ultra2 =new WatchUltra2();
            ultra2.setVisible(true);
            this.setVisible(false);
        }
        else if (ae.getActionCommand().equals( "Apple Watch Hermès" )) {
            Products harmes =new WatchHarmes();
            harmes.setVisible(true);
            this.setVisible(false);
        }
        else if (ae.getActionCommand().equals( " Apple Watch SE " )) {
            Products watch =new WatchSe();
            watch.setVisible(true);
            this.setVisible(false);
        }
    }
}
