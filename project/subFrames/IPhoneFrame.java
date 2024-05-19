package project.subFrames;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import project.mainFrames.Products;
import project.mainFrames.ShopFrame;

public class IPhoneFrame extends ShopFrame {
        IPhoneFrame(){
        super(" Mac Frame  ");
        note= new JLabel(" Store iPhone ");
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

        img=new ImageIcon("project/picture/iphone15.png");
        picture=new JLabel (img);
        picture.setBounds(5,250,200,150);
        panel.add(picture);
        
        button = new JButton("iPhone 15");
        button.setBounds(30, 410, 130, 30);
        button.addActionListener(this);
        panel.add(button);
        
        img=new ImageIcon("project/picture/iphone15pro.png");
        picture=new JLabel (img);
        picture.setBounds(215,250,200,150);
        panel.add(picture);
        
        button = new JButton("iPhone 15 Pro");
        button.setBounds(250, 410, 130, 30);
        button.addActionListener(this);
        panel.add(button);
        
        img=new ImageIcon("project/picture/iphone15proMax.png");
        picture=new JLabel (img);
        picture.setBounds(430,250,200,150);
        panel.add(picture);
        
        button = new JButton("iPhone 15 Pro Max");
        button.setBounds(455, 410, 150, 30);
        button.addActionListener(this);
        panel.add(button);
        
        img=new ImageIcon("project/picture/iphone15plus.png");
        picture=new JLabel (img);
        picture.setBounds(645,250,195,150);
        panel.add(picture);
        
        button = new JButton("iPhone 15 Plus");
        button .setBounds(668, 410, 150, 30);
        button.addActionListener(this);
        panel.add(button );
        
        img=new ImageIcon("project/picture/iphone14.png");
        picture=new JLabel (img);
        picture.setBounds(875,260,195,150);
        panel.add(picture);


        button = new JButton("iPhone 14 ");
        button.setBounds(887, 410,150 , 30);
        button.addActionListener(this);
        panel.add(button);
        
        img=new ImageIcon("project/picture/iphone14pro.png");
        picture=new JLabel (img);
        panel.add(picture);
        picture.setBounds(1065,250,195,150);
        panel.add(picture);

        button = new JButton("iPhone 14 Pro ");
        button.setBounds(1093, 410, 150, 30);
        button.addActionListener(this);
        panel.add(button);
        
        img=new ImageIcon("project/picture/iphone14proMax.png");
        picture=new JLabel (img);
        picture.setBounds(5,475,200,150);
        panel.add(picture);
        
        button = new JButton("iPhone 14 Pro Max ");
        button.setBounds(30, 635, 150, 30);
        button.addActionListener(this);
        panel.add(button);
        
        img=new ImageIcon("project/picture/iphone14plus.png");
        picture=new JLabel (img);
        picture.setBounds(215,475,200,150);
        panel.add(picture);
        
        button = new JButton("iPhone 14 Plus ");
        button.setBounds(250, 635, 130, 30);
        button.addActionListener(this);
        panel.add(button);
        
        img=new ImageIcon("project/picture/iphone13.png");
        picture=new JLabel (img);
        picture.setBounds(430,475,200,150);
        panel.add(picture);
        
        button = new JButton("iPhone 13");
        button.setBounds(470, 635, 130, 30);
        button.addActionListener(this);
        panel.add(button);
        
        img=new ImageIcon("project/picture/iphone13promax.png");
        picture=new JLabel (img);
        picture.setBounds(645,475,195,150);
        panel.add(picture);
        
        button = new JButton("iPhone 13 Pro");
        button .setBounds(675, 635, 130, 30);
        button.addActionListener(this);
        panel.add(button );
        
        
        img=new ImageIcon("project/picture/iphone13mini.png");
        picture=new JLabel (img);
        picture.setBounds(855,475,195,150);
        panel.add(picture); 
        
        button = new JButton("iPhone 13 mini");
        button.setBounds(893, 635,130 , 30);
        button.addActionListener(this);
        panel.add(button);
        
        img=new ImageIcon("project/picture/iphoneSe.png");
        picture=new JLabel (img);
        picture.setBounds(1065,475,195,150);
        panel.add(picture);
        
        button = new JButton("iPhone SE");
        button.setBounds(1105, 635, 130, 30);
        button.addActionListener(this);
        panel.add(button);
}
public  void actionPerformed(ActionEvent ae){
        if (ae.getActionCommand().equals(" Store ")) {
                ShopFrame s=new Store();
                button = new JButton("iPhone 14 ");
                s.setVisible(true);
                this.setVisible(false);
        }
        else if (ae.getActionCommand().equals(" Mac ")) {
                ShopFrame mac=new MacFrame();
                mac.setVisible(true);
                this.setVisible(false);
        }
        else if (ae.getActionCommand().equals(" AirPods ")) {
                ShopFrame pod =new AirpodFrame();
                pod.setVisible(true);
                this.setVisible(false);
        }
        else if (ae.getActionCommand().equals( " Watch " )) {
                ShopFrame watch =new WatchFrame();
                watch.setVisible(true);
                this.setVisible(false);
                
        }
        else if ( ae.getActionCommand().equals( " iPad " )) {
                ShopFrame ipad =new IPadFrame();
                ipad.setVisible(true);
                this.setVisible(false);
            }
            else if (ae.getActionCommand().equals( " Vision " )) {
                VisionFrame vision =new VisionFrame();
                vision.setVisible(true);
                this.setVisible(false);
        }
        else if (ae.getActionCommand().equals( "iPhone 15" )) {
                Products ip15 =new IPhone15();
                ip15.setVisible(true);
                this.setVisible(false);
        }
        else if (ae.getActionCommand().equals( "iPhone 15 Pro" )) {
                Products ip15p =new IPhone15Pro();
                ip15p.setVisible(true);
                this.setVisible(false);
        }
        else if (ae.getActionCommand().equals( "iPhone 15 Pro Max" )) {
                Products ip15pm =new IPhone15ProMax();
                ip15pm.setVisible(true);
                this.setVisible(false);
        }
        else if (ae.getActionCommand().equals( "iPhone 15 Plus" )) {
                IPhone15Plus ip15pl =new IPhone15Plus();
                ip15pl.setVisible(true);
                this.setVisible(false);
        }
        else if (ae.getActionCommand().equals( "iPhone 14 " )) {
                Products ip14 =new IPhone14();
                ip14.setVisible(true);
                this.setVisible(false);
        }
        else if (ae.getActionCommand().equals( "iPhone 14 Pro" )) {
                IPhone14Pro ip14p =new IPhone14Pro();
                ip14p.setVisible(true);
                this.setVisible(false);
        }
        else if (ae.getActionCommand().equals( "iPhone 14 Pro Max" )) {
                Products ip14p =new IPhone14Pro();
                ip14p.setVisible(true);
                this.setVisible(false);
        }
        else if (ae.getActionCommand().equals( "iPhone 14 Plus" )) {
                Products ip14pl =new IPhone14Plus();
                ip14pl.setVisible(true);
                this.setVisible(false);
        }
        else if (ae.getActionCommand().equals( "iPhone 14 Plus" )) {
                Products ip13 =new IPhone13();
                ip13.setVisible(true);
                this.setVisible(false);
        }
        else if (ae.getActionCommand().equals( "iPhone 14 Plus" )) {
                Products ip13p =new IPhone13Pro();
                ip13p.setVisible(true);
                this.setVisible(false);
        }
        else if (ae.getActionCommand().equals( "iPhone 14 Plus" )) {
                Products ip13m =new IPhone13Mini();
                ip13m.setVisible(true);
                this.setVisible(false);
        }
        else if (ae.getActionCommand().equals( "iPhone SE" )) {
                Products s =new IPhoneSE();
                s.setVisible(true);
                this.setVisible(false);
        }
}
}
