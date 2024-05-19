package project.subFrames;
import java.awt.*;
import javax.swing.*;
import project.mainFrames.Products;

public class IPhone14Plus extends Products{
    private final String []cols;
    private final String [][]rows;
    public IPhone14Plus() {
        super("Mac Mini");

        cols=new String [2];
        rows=new String[4][2];

        cols[0]="Details";
        cols[1]="Specification";

        rows[0][0]="Proccesor";
        rows[1][0]="Feather ";
        rows[2][0]="Ports ";
        rows[3][0]="Connectivity";

        rows[0][1]="Do more and do it faster with the next-generation M2 or M2 Pro chip";
        rows[1][1]="Mac mini turns any desk into a powerful workstation, so you can create, code and collaborate";
        rows[2][1]="Customize your setup using Mac mini’s two or four Thunderbolt 4 ports, two USB-A ports, HDMI, and Gigabit Ethernet";
        rows[3][1]="Complete your system with Studio Display and Magic accessories";
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

        img=new ImageIcon("project/picture/iphone14plus.png");
        picture=new JLabel (img);
        picture.setBounds(20,40,200,400);
        panel.add(picture);


        note=new JLabel("From $1999or $166.58/mo. per month for 12 mo. months  *");
        note.setBounds(285,60,800,200);
        note.setForeground(Color.BLACK);
        panel.add(note);

    }

}
