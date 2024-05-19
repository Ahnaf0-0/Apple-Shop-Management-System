package project.subFrames;
import java.awt.*;
import javax.swing.*;
import project.mainFrames.Products;

public class IPhoneSE extends Products {

    public IPhoneSE() {
   super("MacBook Air M3");

        String[] cols = new String[2];
        String[][] rows = new String[4][2];

    cols[0]="Details";
    cols[1]="Specification";

    rows[0][0]="Portable design";
    rows[1][0]="Get more done faster";
    rows[2][0]="A brilliant display";
    rows[3][0]="Look sharp,sound great";
    
    rows[0][1]="Lightweight and under half an inch thin,so you can go anywhere.";
    rows[1][1]="The powerful 8-core CPU to 12-core GPU  running smoothly.";
    rows[2][1]="15.3-inch Liquid Retina display supports 2 billion colors.";
    rows[3][1]="1080p HD camera, four mics, four speakers with Audio.";
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

        img=new ImageIcon("project/picture/A2.png");
        picture=new JLabel (img);
        picture.setBounds(20,40,200,400);
        panel.add(picture);

        note=new JLabel("MacBook Air M3");
        note.setBounds(285,10,400,200);
        font=new Font("Calibri",Font.BOLD,30);
        note.setFont(font);
        panel.add(note);

        note=new JLabel("15-inch with M3 chip");
        note.setBounds(285,30,800,200);
        note.setForeground(Color.BLACK);
        font=new Font("Calibri",Font.BOLD,20);
        note.setFont(font);
        panel.add(note);

        note=new JLabel("From $1299or $108.25/mo.for 12 mo.*");
        note.setBounds(285,60,800,200);
        note.setForeground(Color.BLACK);
        panel.add(note);
    
    }
    
}
