package project.subFrames;
import java.awt.*;
import javax.swing.*;
import project.mainFrames.Products;

public class IPhone14 extends Products{

    public IPhone14() {
   super("iPhone 14");

   String[] cols = new String[2];
   String[][] rows = new String[4][2];
   
   cols[0]="Details";
   cols[1]="Specification";

   rows[0][0]="Processor";
   rows[1][0]="Display";
   rows[2][0]="Battery";
   rows[3][0]="Camera";
    
   rows[0][1]="A15 Bionic, the same supersede chip that’s in iPhone 13 Pro.";
   rows[1][1]="6.1-inch durable design footnote 1 with Ceramic Shield and water and dust resistance.";
   rows[2][1]="All-day battery life with up to 20 hours of video playback.";
   rows[3][1]="A Pro-level Main camera and advanced image processing for sensational shots in all kinds of light";
   table = new JTable(rows, cols);
   table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            table.setRowHeight(30);
            table.getColumnModel().getColumn(0).setPreferredWidth(153);
            
            table.getColumnModel().getColumn(1).setPreferredWidth(423);
            table.setBounds(280,150,400,400);
            font=new Font("Calibri",Font.BOLD,15);
            table.setFont(font);
            scroll = new JScrollPane(table);
            scroll.setBounds(280,180,500,200);
            panel.add(scroll);

        img=new ImageIcon("project/picture/iphone14.png");
        picture=new JLabel (img);
        picture.setBounds(20,40,200,400);
        panel.add(picture);

        note=new JLabel("iPhone 14");
        note.setBounds(285,10,400,200);
        font=new Font("Calibri",Font.BOLD,30);
        note.setFont(font);
        panel.add(note);


        note=new JLabel("From $699or $29.12/mo.per month for 24 mo.months*");
        note.setBounds(285,60,800,200);
        note.setForeground(Color.BLACK);
        panel.add(note);
    
    }
    
}