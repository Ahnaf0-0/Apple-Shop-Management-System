package project.subFrames;
import java.awt.*;
import javax.swing.*;
import project.mainFrames.Products;

public class AirMax extends Products{
    private final String []cols;
    private final String [][]rows;
    public AirMax() {
   super("ApMax");

   cols=new String [2];
   rows=new String[4][2];
   
    cols[0]="Details";
    cols[1]="Specification";

    rows[0][0]="Accessibility";
    rows[1][0]="Battery";
    rows[2][0]="Airpods Sensor";
    rows[3][0]="Connection";
    
    rows[0][1]="Live Listen audio , Headphone levels and Headphone Accommodations";
    rows[1][1]="Up to 20 hours of listening time on a single charge with Active Noise Cancellation or Transparency mode enabled3";
    rows[2][1]="Optical sensor,Position sensor and Case-detect sensor";
    rows[3][1]="Bluetooth 5.0 wireless technology";
    table = new JTable(rows,cols);
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

        img=new ImageIcon("project/picture/max.png");
        picture=new JLabel (img);
        picture.setBounds(20,40,200,400);
        panel.add(picture);

        note=new JLabel("MacBook Pro M1");
        note.setBounds(285,10,400,200);
        font=new Font("Calibri",Font.BOLD,30);
        note.setFont(font);
        panel.add(note);

        note=new JLabel("ApMax");
        note.setBounds(285,30,800,200);
        note.setForeground(Color.BLACK);
        font=new Font("Calibri",Font.BOLD,20);
        note.setFont(font);
        panel.add(note);

        note=new JLabel(" $549* "); 
        note.setBounds(285,60,800,200);
        note.setForeground(Color.BLACK);
        panel.add(note);
    
    }
    
}
