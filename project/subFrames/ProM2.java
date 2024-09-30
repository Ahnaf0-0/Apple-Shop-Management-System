package project.subFrames;
import java.awt.*;
import javax.swing.*;
import project.mainFrames.Products;

public class ProM2 extends Products{
    private final String []cols;
    private final String [][]rows;
    public ProM2() {
    super("MacBook Pro M2");

        cols=new String [2];
    rows=new String[4][2];
        
    cols[0]="Details";
    cols[1]="Specification";

    rows[0][0]="Proccesor";
    rows[1][0]="Get more done faster";
    rows[2][0]="A brilliant display";
    rows[3][0]="Look sharp,sound great";
        
    rows[0][1]="With M1 our most advanced chips for personal computer.";
    rows[1][1]="The powerful 8-core CPU to 12-core GPU  running smoothly.";
    rows[2][1]="Liquid Retina XDR display is the best ever in a laptop.";
    rows[3][1]="Look sharp and sound clear anywhere with the 1080p FaceTime HDcamera,three studio-quality mics, and six speakers with Spatial Audio";
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

        img=new ImageIcon("project/picture/m3.png");
        picture=new JLabel (img);
        picture.setBounds(20,40,200,400);
        panel.add(picture);

        note=new JLabel("MacBook Pro M2");
        note.setBounds(285,10,400,200);
        font=new Font("Calibri",Font.BOLD,30);
        note.setFont(font);
        panel.add(note);

        note=new JLabel("MacBook Pro 15-inch");
        note.setBounds(285,30,800,200);
        note.setForeground(Color.BLACK);
        font=new Font("Calibri",Font.BOLD,20);
        note.setFont(font);
        panel.add(note);

        note=new JLabel("From $1699or $143.25/mo.for 12 mo.*");
        note.setBounds(285,60,800,200);
        note.setForeground(Color.BLACK);
        panel.add(note);
    
    }
    
}
