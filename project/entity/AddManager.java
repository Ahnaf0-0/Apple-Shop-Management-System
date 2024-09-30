package project.entity;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import project.subFrames.Store;

public class AddManager extends JFrame {

    
    JPanel panel;
    JLabel l1,name, cyanBar, gearIcon, hom_lbl, nam_lbl, pass_lbl, email_lbl, phn_lbl,imagelabel;
    JButton adUsr_btn, adAdmi_btn, shoInfo_btn, delUsr_btn, delAdmi_btn,bck2home_btn, add;
    JTextArea textArea;
    JTextField nameField, emailfield, phnfield;
    JPasswordField passField;
        
    ImageIcon cyanbar, gearIco, homeIco, atlasIco_img,apple; 
    Font font_large, font_sml, font_mid;
    Color cyan ;
            

     // the common Layout       
    
    public AddManager(){

            super ("Add Manager");
		    this.setBounds(100,60,1000,638);
            this.setLocationRelativeTo(null);
            this.setResizable(false);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    panel=new JPanel();
		    panel.setLayout(null);
		    panel.setBackground(Color.WHITE);

          
		atlasIco_img=new ImageIcon("Images/atlasICO.png");
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setIconImage(atlasIco_img.getImage());

            this.setLocationRelativeTo(null);

            font_large= new Font("Cambria",Font.BOLD,30);
            font_sml=new Font("Arial", Font.PLAIN, 12);
            
            

            gearIco=new ImageIcon("project/picture/gear.png");
            homeIco=new ImageIcon("project/picture/bck2home.png");
            atlasIco_img=new ImageIcon("project/picture/atlasICO.png");

            this.setLocationRelativeTo(null);
            this.setResizable(false);
            this.setIconImage(atlasIco_img.getImage());


            name=new JLabel("Admin Panel");
            name.setBounds(76,160,219,30);
            name.setFont(font_large);
            //name.setOpaque(true);
            name.setForeground(Color.WHITE);

            panel.add(name);
		

            //-----------------F O R M -----------------------------------------

	        nam_lbl=new JLabel("Name :");
            nam_lbl.setBounds(500,135,133,23);
            nam_lbl.setFont(new Font("Arial", Font.PLAIN, 12));
            nam_lbl.setForeground(Color.BLACK);
            nam_lbl.setOpaque(false);	
            panel.add(nam_lbl);

            nameField= new JTextField();
            nameField.setBounds(600,135,250,25);
          //nameField.setOpaque(false);
            nameField.setBorder(BorderFactory.createEmptyBorder());
            nameField.setBackground(new Color(203,203,203));
            panel.add(nameField);


            email_lbl=new JLabel("Email:");
            email_lbl.setBounds(500,205,133,23);
            email_lbl.setFont(new Font("Arial", Font.PLAIN, 12));
            email_lbl.setForeground(Color.BLACK);
            email_lbl.setOpaque(false);	
            panel.add(email_lbl);

            emailfield= new JTextField();
            emailfield.setBounds(550+50,205,250,25);
          //nameField.setOpaque(false);
          emailfield.setBorder(BorderFactory.createEmptyBorder());
          emailfield.setBackground(new Color(203,203,203));
            panel.add(emailfield);

            pass_lbl=new JLabel("Password:");
            pass_lbl.setBounds(500,290,133,23);
            pass_lbl.setFont(new Font("Arial", Font.PLAIN, 12));
            pass_lbl.setForeground(Color.BLACK);
            pass_lbl.setOpaque(false);	
            panel.add(pass_lbl);

            passField=new JPasswordField();
		    passField.setBounds(550+50,290,250,25);
            passField.setBackground(new Color(203,203,203));
            passField.setBorder(null);
		    passField.setEchoChar('*');
		    panel.add(passField);

            phn_lbl=new JLabel("Phone Number:");
            phn_lbl.setBounds(500,370,133,23);
            phn_lbl.setFont(new Font("Arial", Font.PLAIN, 12));
            phn_lbl.setForeground(Color.BLACK);
            phn_lbl.setOpaque(false);	
            panel.add(phn_lbl);

            phnfield= new JTextField();
            phnfield.setBounds(550+50,370,250,25);
          //nameField.setOpaque(false);
          phnfield.setBorder(BorderFactory.createEmptyBorder());
          phnfield.setBackground(new Color(203,203,203));
            panel.add(phnfield);

            add=new JButton("Add");
            add.setBounds(500,440,365,40);
            add.setBackground(Color.BLACK);
            add.setForeground(Color.WHITE);
            // add.addActionListener(this);
            panel.add(add);


            //--------------------- E N D --------------------------------------------


            adUsr_btn=new JButton("add User");
            adUsr_btn.setFont(font_sml);
            adUsr_btn.setBounds(142,238,100,34);
            adUsr_btn.setOpaque(true);
            adUsr_btn.setBorderPainted(false);
            adUsr_btn.setBackground(Color.BLACK);
            adUsr_btn.setForeground(Color.WHITE);
            // adUsr_btn.addActionListener(this);
            panel.add(adUsr_btn);

                      
//            adAdmi_btn=new JButton("add Admin");
//            adAdmi_btn.setBounds(142,298,100,34);
//            adAdmi_btn.setOpaque(true);
//            // turn on or off border
//            adAdmi_btn.setBorderPainted(false);
//            adAdmi_btn.setBackground(Color.BLACK);
//            adAdmi_btn.setForeground(Color.WHITE);
//            adAdmi_btn.setFont(font_sml);
//            adAdmi_btn.revalidate();
//            // adAdmi_btn.addActionListener(this);
//            panel.add(adAdmi_btn);


//            shoInfo_btn=new JButton("show info");
//            shoInfo_btn.setFont(font_sml);
//            shoInfo_btn.setBounds(142,359,100,34);
//            shoInfo_btn.setOpaque(true);
//            shoInfo_btn.setBackground(Color.BLACK);
//            shoInfo_btn.setForeground(Color.WHITE);
//            // shoInfo_btn.addActionListener(this);
//            panel.add(shoInfo_btn);

//            bck2home_btn=new JButton(homeIco);
//            bck2home_btn.setSize(68,22);
//            bck2home_btn.setLocation(852, 42);
//            //turn on or off border
//            bck2home_btn.setBorder(null);
//            bck2home_btn.setContentAreaFilled(false);
//            bck2home_btn.setOpaque(false);
//            bck2home_btn.setBorderPainted(false);
//            // bck2home_btn.addActionListener(this);
//            panel.add( bck2home_btn);
            

           gearIcon =new JLabel(gearIco);
           gearIcon.setBounds(161,98,48,48);
           panel.add(gearIcon);

           cyanbar=new ImageIcon("project/picture/ibar1.png");
           cyanBar=new JLabel(cyanbar);
           cyanBar.setBounds(15,0,350,600);
           panel.add(cyanBar);

            l1 = new JLabel("project/picture/Apple");
            l1.setBounds(460,30,140,40);
            l1.setFont(new Font("Calibri",Font.BOLD,39));
            panel.add(l1);

           apple =new ImageIcon("project/picture/apple1.png");
           imagelabel = new JLabel(apple);
           imagelabel.setBounds(400,15,60,50);
           panel.add(imagelabel);



            // Add the panel to the frame
            this.add(panel);

              }

             public void actionPerformed (ActionEvent ae) {

                 String username = nameField.getText().trim();
                 String userEmail = emailfield.getText().trim();
                 String userPassword = new String(passField.getPassword());
                 String userPhone = phnfield.getText().trim();


                 if (ae.getSource() == bck2home_btn) {
                     Store f1 = new Store();
                     f1.setVisible(true);
                     this.setVisible(false);
                 } else if (ae.getSource() == shoInfo_btn) {
                     AddManager showInfo = new AddManager();
                     showInfo.setVisible(true);
                     this.setVisible(false);
                 }
             }
//
//                 if(ae.getSource() == add) {
//
//                     if(username.isEmpty() || userEmail.isEmpty() || userPassword.isEmpty() || userPhone.isEmpty()){
//
//                         JOptionPane.showMessageDialog(this,"Fill UP All");
//                     }
//                     //pass information to account
//                     else {
//                         adminAcount adaccount = new adminAcount(username, userEmail, userPassword, userPhone);
//                         adaccount.addadminaccount();
//                         JOptionPane.showMessageDialog(this, "Inserted");
//                     }
//                 }
//                 else if(ae.getSource()==adUsr_btn){
//                     addUsr a1 = new addUsr();
//                     a1.setVisible(true);
//                     this.setVisible(false);
//                 }
                 }





              



            



              
