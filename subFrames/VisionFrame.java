package project.subFrames;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import project.mainFrames.ShopFrame;
public class VisionFrame extends ShopFrame {
    
public VisionFrame(){
        super(" Watch Frame  ");

        note= new JLabel(" Apple Vision Pro ");
        note.setBounds(40,10,406,200);

        myFont = new Font("Calibri", Font.BOLD, 50);
        note.setFont(myFont);
        panel.add(note);

        img = new ImageIcon("project/picture/v4.png");
        picture=new JLabel(img);
        picture.setBounds(380, 240, 350, 300);
        panel.add(picture);
        
        img =new ImageIcon("project/picture/v3.png");
        picture=new JLabel(img);
        picture.setBounds(0, 300, 380, 180);
        panel.add(picture);

        img =new ImageIcon("project/picture/v.png");
        picture=new JLabel(img);
        picture.setBounds(800, 300, 450, 180);
        panel.add(picture);




}
public  void actionPerformed(ActionEvent ae){
    if (ae.getActionCommand().equals(" Mac ")) {
                MacFrame mac =new MacFrame();
                mac.setVisible(true);
                this.setVisible(false);
            }
			else if (ae.getActionCommand().equals(" iPhone ")) {
                IPhoneFrame phone =new IPhoneFrame();
                phone.setVisible(true);
                this.setVisible(false);
            }

			else if (ae.getActionCommand().equals( " Watch " )) {
				WatchFrame watch =new WatchFrame();
					watch.setVisible(true);
                    this.setVisible(false);
			}
			
			else if (ae.getActionCommand().equals(" iPad ")) {
			
				IPadFrame ipad =new IPadFrame();
                ipad.setVisible(true);
                this.setVisible(false);
            }
			if (ae.getActionCommand().equals( " Store " )) {
					Store vision =new Store();
					vision.setVisible(true);
                    this.setVisible(false);
			}
			else if (ae.getActionCommand().equals(" AirPods ")) {
                AirpodFrame pod =new AirpodFrame();
                pod.setVisible(true);
                this.setVisible(false);
            }
			else if (ae.getActionCommand().equals(" Log Out ")) {
				Login logIn = new Login();
				logIn.setVisible(true); 
                this.setVisible(false);
            }
        
        }
    }


