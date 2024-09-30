package project.subFrames;
import java.awt.*;
import javax.swing.*;
import project.mainFrames.Products;

public class ProM3 extends Products{
    private final String []cols;
    private final String [][]rows;
    public ProM3() {
   super("MacBook Pro M3");
   cols=new String [2];
   rows=new String[4][2];
   
    cols[0]="Details";
    cols[1]="Specification";

    rows[0][0]="Proccesor";
    rows[1][0]="Get more done faster";
    rows[2][0]="A brilliant display";
    rows[3][0]="Ports ";
    
    rows[0][1]="With M1 our most advanced chips for personal computer.";
    rows[1][1]="8-Core CPU 10-Core GPU 8GB Unified Memory 1TB SSD Storage¹";
    rows[2][1]="Liquid Retina XDR display is the best ever in a laptop, with Extreme Dynamic Range, incredible contrast, and true-to-life colors.";
    rows[3][1]="Connect everything you need with up to three Thunderbolt 4 ports, an SDXC card slot, an HDMI port, a MagSafe 3 port, and a headphone jack";
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

        img=new ImageIcon("project/picture/macBook.png");
        picture=new JLabel (img);
        picture.setBounds(20,40,200,400);
        panel.add(picture);

        note=new JLabel("MacBook Pro M3");
        note.setBounds(285,10,400,200);
        font=new Font("Calibri",Font.BOLD,30);
        note.setFont(font);
        panel.add(note);

        note=new JLabel("MacBook Pro 16-inch");
        note.setBounds(285,30,800,200);
        note.setForeground(Color.BLACK);
        font=new Font("Calibri",Font.BOLD,20);
        note.setFont(font);
        panel.add(note);

        note=new JLabel("From $149.91/mo.per month for 12 mo.*");
        note.setBounds(285,60,800,200);
        note.setForeground(Color.BLACK);
        panel.add(note);
    
    }
    
}