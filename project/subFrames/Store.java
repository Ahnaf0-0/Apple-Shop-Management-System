package project.subFrames;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import project.mainFrames.MainFrame;
import project.mainFrames.ShopFrame;
public class Store extends ShopFrame {
    public Store(){
    	super(" Mac Frame  ");

			note= new JLabel(" Store. ");
			note.setBounds(60,50,400,200);
			myFont = new Font("Calibri", Font.BOLD, 50);
			note.setFont(myFont);
			panel.add(note);

			note= new JLabel(" The best way to buy the ");
			note.setBounds(190,50,800,200);
			note.setForeground(Color.LIGHT_GRAY);
			myFont = new Font("Calibri",Font.BOLD, 50);
			note.setFont(myFont);
			panel.add(note);

			note= new JLabel(" product you love. ");
			note.setBounds(60,100,400,200);
			note.setForeground(Color.LIGHT_GRAY);
			myFont = new Font("Calibri",Font.BOLD, 50);
			note.setFont(myFont);
			panel.add(note);

            
    		img = new ImageIcon("project/picture/mac.png");

			mac= new JButton(img);
			mac.setBounds(78,290,136,85);
			mac.setBackground(Color.WHITE);
			mac.addActionListener(this);
			panel.add(mac);

			mac= new JButton(" Mac ");
			mac.setBounds(110,390,68,30);
			mac.addActionListener(this);
			panel.add(mac);

			img = new ImageIcon("project/picture/iphone.png");
			iPhone= new JButton(img);
			iPhone.setBounds(267,290,136,85);
			iPhone.setBackground(Color.WHITE);
			iPhone.addActionListener(this);
			panel.add(iPhone);

			iPhone= new JButton(" iPhone ");
			iPhone.setBounds(291,390,90,30);
			iPhone.addActionListener(this);
			panel.add(iPhone);

			img = new ImageIcon("project/picture/iPad.png");
			

			iPad= new JButton(img);
			iPad.setBounds(458,290,136,83);
			iPad.setBackground(Color.WHITE);
			iPad.addActionListener(this);
			panel.add(iPad);

			iPad= new JButton(" iPad ");
			iPad.setBounds(480,390,90,30);
			iPad.addActionListener(this);
			panel.add(iPad);

			img =new ImageIcon("project/picture/watch.png");
			
			appleWatch= new JButton(img);
			appleWatch.setBounds(648,290,136,83);
			appleWatch.setBackground(Color.WHITE);
			appleWatch.addActionListener(this);
			panel.add(appleWatch);

			appleWatch= new JButton(" Apple Watch ");
			appleWatch.setBounds(658,390,120,30);
			appleWatch.addActionListener(this);
			panel.add(appleWatch);
			
			img = new ImageIcon("project/picture/airpods.png");
			
			airPods= new JButton(img);
			airPods.setBounds(838,290,136,85);
			airPods.setBackground(Color.WHITE);
			airPods.addActionListener(this);
			panel.add(airPods);

			airPods= new JButton(" AirPods ");
			airPods.setBounds(863,390,90,30);
			airPods.addActionListener(this);
			panel.add(airPods);

			img = new ImageIcon("project/picture/vr.png");
			

			vision= new JButton(img);
			vision.setBounds(1053,290,136,83);
			vision.setBackground(Color.WHITE);
			vision.addActionListener(this);
			panel.add(vision);

			vision= new JButton(" Apple Vision Pro ");
			vision.setBounds(1050,390,140,30);
			vision.addActionListener(this);
			panel.add(vision);



			note= new JLabel(" The Apple Store difference. ");
			note.setBounds(60,390,580,200);
			note.setForeground(Color.RED);

			myFont = new Font("Calibri", Font.BOLD, 30);
			note.setFont(myFont);
			panel.add(note);

			note= new JLabel(" Even more reasons to shop with us. ");
			note.setBounds(405,390,590,200);
			note.setForeground(Color.LIGHT_GRAY);

			myFont = new Font("Calibri",Font.BOLD, 30);
			note.setFont(myFont);
			panel.add(note);

			note= new JLabel(" product you love. ");
			note.setBounds(60,100,400,200);
			note.setForeground(Color.LIGHT_GRAY);

			myFont = new Font("Calibri",Font.BOLD, 50);
			note.setFont(myFont);
			panel.add(note);

			img = new ImageIcon("project/picture/delivary.png");

			details1= new JButton(img);
			details1.setBounds(125,550,229,145);
			details1.setForeground(Color.white);
			panel.add(details1);

			img = new ImageIcon("project/picture/pay.png");

			details2= new JButton(img);
			details2.setBounds(525,550,229,145);
			details2.setForeground(Color.white);
			panel.add(details2);

			img = new ImageIcon("project/picture/trade.png");

			details3= new JButton(img);
			details3.setBounds(925,550,229,145);
			details3.setForeground(Color.white);
			panel.add(details3);
    }
    		public  void actionPerformed(ActionEvent ae){
    
            if (ae.getActionCommand().equals(" Mac ")) {
				ShopFrame mac =new MacFrame();
                mac.setVisible(true);
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
			
			
			
    }
}
