package project.subFrames;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import project.mainFrames.MainFrame;
import project.mainFrames.Products;
import project.mainFrames.ShopFrame;
public class MacFrame extends ShopFrame {
    MacFrame(){
        super(" Mac Frame  ");

        note= new JLabel(" Store Mac ");
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

        img=new ImageIcon("project/picture/macbookair1.png");
        picture=new JLabel (img);
        picture.setBounds(5,250,200,150);
        panel.add(picture);
        
        button = new JButton(" MacBook Air M1 ");
        button.setBounds(30, 410, 150, 30);
        button.addActionListener(this);
        panel.add(button);
        
        img=new ImageIcon("project/picture/macbookair2.png");
        picture=new JLabel (img);
        picture.setBounds(215,250,200,150);
        panel.add(picture);
        
        button = new JButton("MacBook Air M2");
        button.setBounds(250, 410, 130, 30);
        button.addActionListener(this);
        panel.add(button);
        
        img=new ImageIcon("project/picture/macbookair3.png");
        picture=new JLabel (img);
        picture.setBounds(430,250,200,150);
        panel.add(picture);
        
        button = new JButton("MacBook Air M3");
        button.setBounds(470, 410, 130, 30);
        button.addActionListener(this);
        panel.add(button);
        
        img=new ImageIcon("project/picture/macbookPro1.png");
        picture=new JLabel (img);
        picture.setBounds(645,250,195,150);
        panel.add(picture);
        
        button = new JButton("MacBook Pro M1");
        button .setBounds(675, 410, 150, 30);
        button.addActionListener(this);
        panel.add(button );
        
        img=new ImageIcon("project/picture/macbookPro2.png");
        picture=new JLabel (img);
        picture.setBounds(855,250,195,150);
        panel.add(picture);
        
        button = new JButton("MacBook Pro M2");
        button.setBounds(885, 410,150 , 30);
        button.addActionListener(this);
        panel.add(button);
        
        img=new ImageIcon("project/picture/macbookPro3.png");
        picture=new JLabel (img);
        picture.setBounds(1065,250,195,150);
        panel.add(picture);
        
        button = new JButton("MacBook Pro M3");
        button.setBounds(1093, 410, 150, 30);
        button.addActionListener(this);
        panel.add(button);
        
        img=new ImageIcon("project/picture/macMonitor.png");
        picture=new JLabel (img);
        picture.setBounds(5,475,200,150);
        panel.add(picture);
        
        button = new JButton("iMac");
        button.setBounds(30, 635, 130, 30);
        button.addActionListener(this);
        panel.add(button);
        
        img=new ImageIcon("project/picture/macMini.png");
        picture=new JLabel (img);
        picture.setBounds(215,475,200,150);
        panel.add(picture);
        
        button = new JButton("Mac mini");
        button.setBounds(250, 635, 130, 30);
        button.addActionListener(this);
        panel.add(button);
        
        img=new ImageIcon("project/picture/MacStudio.png");
        picture=new JLabel (img);
        picture.setBounds(430,475,200,150);
        panel.add(picture);
        
        button = new JButton("Mac Studio");
        button.setBounds(470, 635, 130, 30);
        button.addActionListener(this);
        panel.add(button);
        
        img=new ImageIcon("project/picture/macPro.png");
        picture=new JLabel (img);
        picture.setBounds(645,475,195,150);
        panel.add(picture);
        
        button = new JButton("Mac pro");
        button .setBounds(675, 635, 130, 30);
        button.addActionListener(this);
        panel.add(button );
        
        img=new ImageIcon("project/picture/display.png");
        picture=new JLabel (img);
        picture.setBounds(855,475,195,150);
        panel.add(picture); 
        
        button = new JButton("Studio Display");
        button.setBounds(893, 635,130 , 30);
        button.addActionListener(this);
        panel.add(button);
        
        img=new ImageIcon("project/picture/xdr.png");
        picture=new JLabel (img);
        picture.setBounds(1065,475,195,150);
        panel.add(picture);
        
        button = new JButton("Pro Display XDR");
        button.setBounds(1105, 635, 130, 30);
        button.addActionListener(this);
        panel.add(button);
        
        
        
}
public  void actionPerformed(ActionEvent ae){
    if (ae.getActionCommand().equals(" Store ")) {
        ShopFrame  s =new Store();
        s.setVisible(true);
        this.setVisible(false);
    }
    else if (ae.getActionCommand().equals(" iPhone ")) {
        ShopFrame phone =new IPhoneFrame();
        phone.setVisible(true);
        this.setVisible(false);
    }

    else if (ae.getActionCommand().equals( " Apple Watch " ) || ae.getActionCommand().equals( " Watch " )) {
        ShopFrame watch =new WatchFrame();
            watch.setVisible(true);
            this.setVisible(false);
    }
    
    else if (ae.getActionCommand().equals(" iPad ")) {

        ShopFrame ipad =new IPadFrame();
        ipad.setVisible(true);
        this.setVisible(false);
    }
    else if (ae.getActionCommand().equals( " Apple Vision Pro " ) || ae.getActionCommand().equals( " Vision " )) {
        ShopFrame vision =new VisionFrame();
            vision.setVisible(true);
            this.setVisible(false);
    }
    else if (ae.getActionCommand().equals(" AirPods ")) {
        ShopFrame pod =new AirpodFrame();
        pod.setVisible(true);
        this.setVisible(false);
    }
    else if (ae.getActionCommand().equals(" Log Out ")) {
        MainFrame logIn = new Login();
        logIn.setVisible(true); 
        this.setVisible(false);
    }
     else if (ae.getActionCommand().equals(" MacBook Air M1 ")) {
                Products air1 = new AirM1();
                    air1.setVisible(true);
                    this.setVisible(false);
       }
       else if (ae.getActionCommand().equals("MacBook Air M2")) {
        Products air2 = new AirM2();
                    air2.setVisible(true);
                    this.setVisible(false);
       }
       else if (ae.getActionCommand().equals("MacBook Air M3")) {
        Products air3 = new AirM3();
                    air3.setVisible(true);
                    this.setVisible(false);
    }
    else if (ae.getActionCommand().equals("MacBook Pro M1")) {
        Products pro1 = new ProM1();
        pro1.setVisible(true);
        this.setVisible(false);
       }
       else if (ae.getActionCommand().equals("MacBook Pro M2")) {
        Products pro2 = new ProM2();
        pro2.setVisible(true);
        this.setVisible(false);
       }
       else if (ae.getActionCommand().equals("MacBook Pro M3")) {
        Products pro3 = new ProM3();
        pro3.setVisible(true);
        this.setVisible(false);
       }
    else if (ae.getActionCommand().equals("iMac")) {
        Products imac = new Imac();
        imac.setVisible(true);
        this.setVisible(false);
    }
    else if (ae.getActionCommand().equals("Mac mini")) {
        Products mini = new Mini();
        mini.setVisible(true);
        this.setVisible(false);
    }
    else if (ae.getActionCommand().equals("Mac Studio")) {
        Products studio = new Studio();
        studio.setVisible(true);
        this.setVisible(false);
    }
    else if (ae.getActionCommand().equals("Mac pro")) {
        Products macPro = new MacP();
        macPro.setVisible(true);
        this.setVisible(false);
    }
    else if (ae.getActionCommand().equals("Studio Display")) {
        Products display = new Display();
        display.setVisible(true);
        this.setVisible(false);
    }
    else if (ae.getActionCommand().equals("Pro Display XDR")) {
        Products xdr = new Xdr();
        xdr.setVisible(true);
        this.setVisible(false);
    }

    }

}
