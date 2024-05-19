package project.subFrames;
import java.awt.*;
import javax.swing.*;
import project.mainFrames.Products;

public class Studio extends Products{
    private final String []cols;
    private final String [][]rows;
    public Studio() {
        super("Mac Studio");

        cols=new String [2];
        rows=new String[4][2];

        cols[0]="Details";
        cols[1]="Specification";

        rows[0][0]="Proccesor";
        rows[1][0]="Ports ";
        rows[2][0]="Design ";
        rows[3][0]="Display";

        rows[0][1]="Supercharged by the M2 Max or M2 Ultra chip — our most powerful chips yet";
        rows[1][1]="A wide array of high-performance ports allows you to build the studio of your dreams";
        rows[2][1]="Stunningly compact design fits right on your desk";
        rows[3][1]="Pairs perfectly with Studio Display — or up to eight displays";
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

        img=new ImageIcon("project/picture/MacStudio.png");
        picture=new JLabel (img);
        picture.setBounds(20,40,200,400);
        panel.add(picture);

        note=new JLabel("Mac Studio");
        note.setBounds(285,10,400,200);
        font=new Font("Calibri",Font.BOLD,30);
        note.setFont(font);
        panel.add(note);

        note=new JLabel("From $1999or $166.58/mo. per month for 12 mo. months  *");
        note.setBounds(285,60,800,200);
        note.setForeground(Color.BLACK);
        panel.add(note);

    }

}
