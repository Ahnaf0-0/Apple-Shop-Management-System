package project.subFrames;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import project.mainFrames.ShopFrame;

public class AirpodFrame extends ShopFrame {
public AirpodFrame(){
        super(" AirPods Frame  ");

        note= new JLabel(" Store AirPods ");
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

        img=new ImageIcon("project/picture/gen3.png");
        picture=new JLabel (img);
        picture.setBounds(195,250,190,150);
        panel.add(picture);

        button = new JButton(" AirPods 3rd Gen ");
        button.setBounds(200, 400, 180, 30);
        button.addActionListener(this);
        panel.add(button);

        img=new ImageIcon("project/picture/pro.png");
        picture=new JLabel (img);
        picture.setBounds(510,240,200,150);
        panel.add(picture);

        button = new JButton(" AirPods Pro 2nd Gen ");
        button.setBounds(520, 400, 180, 30);
        button.addActionListener(this);
        panel.add(button);

        img=new ImageIcon("project/picture/gen2.png");
        picture=new JLabel (img);
        picture.setBounds(860,240,200,150);
        panel.add(picture);

        button = new JButton(" AirPods 2nd Gen ");
        button .setBounds(870, 400, 180, 30);
        button.addActionListener(this);
        panel.add(button );


        img=new ImageIcon("project/picture/max.png");
        picture=new JLabel (img);
        picture.setBounds(330,480,200,150);
        panel.add(picture);

        button  = new JButton(" Airpods Max ");
        button.setBounds(340, 640, 180, 30);
        button.addActionListener(this);
        panel.add(button);

        img=new ImageIcon("project/picture/gen1.png");
        picture=new JLabel (img);
        picture.setBounds(680,480,200,150);
        panel.add(picture);

        button  = new JButton(" AirPod ");
        button.setBounds(690,640,180, 30);
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
        else if ( ae.getActionCommand().equals( " Watch " )) {
            WatchFrame watch =new WatchFrame();
                watch.setVisible(true);
            this.setVisible(false);
        }
        else if ( ae.getActionCommand().equals( " iPad " )) {
            IPadFrame ipad =new IPadFrame();
            ipad.setVisible(true);
            this.setVisible(false);
        }
        else if (ae.getActionCommand().equals( " Vision " )) {
            VisionFrame vision =new VisionFrame();
            vision.setVisible(true);
            this.setVisible(false);
    }
        else if (ae.getActionCommand().equals( " AirPod " )) {
            Airpod a1 =new Airpod();
            a1.setVisible(true);
            this.setVisible(false);
        }
        else if (ae.getActionCommand().equals( " AirPods 3rd Gen " )) {
            Airpod2 a2 =new Airpod2();
            a2.setVisible(true);
            this.setVisible(false);
        }
        else if (ae.getActionCommand().equals( " Airpods Max " )) {
            Airpod2Pro a2p =new Airpod2Pro();
            a2p.setVisible(true);
            this.setVisible(false);
        }
        else if (ae.getActionCommand().equals( " AirPods 2nd Gen " )) {
            Airpod3 a3 =new Airpod3();
            a3.setVisible(true);
            this.setVisible(false);
        }
        else if (ae.getActionCommand().equals( " AirPods Pro 2nd Gen " )) {
            AirMax max =new AirMax();
            max.setVisible(true);
            this.setVisible(false);
        }


    }
}
