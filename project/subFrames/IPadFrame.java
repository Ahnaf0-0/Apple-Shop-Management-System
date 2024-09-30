package project.subFrames;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import project.mainFrames.ShopFrame;

public class IPadFrame extends ShopFrame {
public IPadFrame(){
        super(" iPad Frame  ");

        note= new JLabel(" Store iPad ");
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
        img=new ImageIcon("project/picture/3.png");
        picture=new JLabel (img);
        picture.setBounds(180,250,200,150);
        panel.add(picture);

        button = new JButton(" iPad Pro M4 ");
        button.setBounds(190, 420, 180, 30);
        button.addActionListener(this);
        panel.add(button);
        //2
        img=new ImageIcon("project/picture/pad.png");
        picture=new JLabel (img);
        picture.setBounds(510,250,200,150);
        panel.add(picture);
        
        button = new JButton("iPad Pro M3");
        button.setBounds(520, 420, 180, 30);
        button.addActionListener(this);
        panel.add(button);
        //3
        img=new ImageIcon("project/picture/1.png");
        picture=new JLabel (img);
        picture.setBounds(860,250,200,150);
        panel.add(picture);
        
        button = new JButton("iPad Pro");
        button .setBounds(870, 420, 180, 30);
        button.addActionListener(this);
        panel.add(button );
        
        img=new ImageIcon("project/picture/Padpro.png");
        picture=new JLabel (img);
        picture.setBounds(180,480,200,150);
        panel.add(picture);
        //1
        button = new JButton(" iPad Air M3 ");
        button.setBounds(190, 650, 180, 30);
        button.addActionListener(this);
        panel.add(button);
        
        img=new ImageIcon("project/picture/2.png");
        picture=new JLabel (img);
        picture.setBounds(510,480,200,150);
        panel.add(picture);
        //2
        button = new JButton(" iPad Air ");
        button.setBounds(520, 650, 180, 30);
        button.addActionListener(this);
        panel.add(button);
        
        img=new ImageIcon("project/picture/padmini.png");
        picture=new JLabel (img);
        picture.setBounds(860,480,200,150);
        panel.add(picture);
        //3
        button = new JButton(" iPad Mini");
        button.setBounds(870,650,180, 30);
        button.addActionListener(this);
        panel.add(button);
    }
    
    public  void actionPerformed(ActionEvent ae){
        if (ae.getActionCommand().equals(" Store ")) {
            Store s=new Store();
            s.setVisible(true);
            this.setVisible(false);
        }
        else if (ae.getActionCommand().equals(" Mac ")) {
            MacFrame mac=new MacFrame();
            mac.setVisible(true);
            this.setVisible(false);
    }
    else if (ae.getActionCommand().equals(" iPhone ")) {
        IPhoneFrame phone=new IPhoneFrame();
        phone.setVisible(true);
        this.setVisible(false);
    }
    else if (ae.getActionCommand().equals(" AirPods ")) {
        AirpodFrame pod =new AirpodFrame();
        pod.setVisible(true);
        this.setVisible(false);
    }
    else if ( ae.getActionCommand().equals( " Watch " )) {
        WatchFrame watch =new WatchFrame();
            watch.setVisible(true);
            this.setVisible(false);
    }
    if (ae.getActionCommand().equals( " Vision " )) {
        VisionFrame vision =new VisionFrame();
        vision.setVisible(true);
        this.setVisible(false);
}
        if (ae.getActionCommand().equals( " Vision " )) {
            IPadA1 a1 =new IPadA1();
            a1.setVisible(true);
            this.setVisible(false);
        }
        if (ae.getActionCommand().equals( " Vision " )) {
            IPadA1 vision =new IPadA1();
            vision.setVisible(true);
            this.setVisible(false);
        }
        if (ae.getActionCommand().equals( " Vision " )) {
            IPadA1 vision =new IPadA1();
            vision.setVisible(true);
            this.setVisible(false);
        }
        if (ae.getActionCommand().equals( " Vision " )) {
            VisionFrame vision =new VisionFrame();
            vision.setVisible(true);
            this.setVisible(false);
        }
        if (ae.getActionCommand().equals( " Vision " )) {
            VisionFrame vision =new VisionFrame();
            vision.setVisible(true);
            this.setVisible(false);
        }
        if (ae.getActionCommand().equals( " Vision " )) {
            VisionFrame vision =new VisionFrame();
            vision.setVisible(true);
            this.setVisible(false);
        }
    }
}