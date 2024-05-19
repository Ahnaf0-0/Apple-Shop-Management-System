package project.subFrames;
import java.awt.*;
import javax.swing.*;
import project.mainFrames.Products;

public class IPadA1 extends Products{
    private final String []cols;
    private final String [][]rows;
    public IPadA1() {
        super("IPadA1");

        cols=new String [2];
        rows=new String[4][2];

        cols[0]="Details";
        cols[1]="Specification";

        rows[0][0]="Procecor";
        rows[1][0]="Storage";
        rows[2][0]="Display";
        rows[3][0]="Camera";

        rows[0][1]="Apple M1";
        rows[1][1]="256 GB";
        rows[2][1]="Liquid Retina IPS LCD, 500 nits";
        rows[3][1]="12 Mp.";
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

        img=new ImageIcon("project/picture/1.png");
        picture=new JLabel (img);
        picture.setBounds(20,40,200,400);
        panel.add(picture);

        note=new JLabel("iPad Air M1");
        note.setBounds(285,10,400,200);
        font=new Font("Calibri",Font.BOLD,30);
        note.setFont(font);
        panel.add(note);

        note=new JLabel("399$ *");
        note.setBounds(285,60,800,200);
        note.setForeground(Color.BLACK);
        panel.add(note);

    }

}
