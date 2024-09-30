package project.subFrames;
import java.awt.*;
import javax.swing.*;
import project.mainFrames.Products;

public class IPhone15ProMax extends Products{
    private final String []cols;
    private final String [][]rows;
    public IPhone15ProMax() {
        super(" iPhone 15 Pro Max ");

        cols=new String [2];
        rows=new String[4][2];

        cols[0]="Details";
        cols[1]="Specification";

        rows[0][0]="Proccesor";
        rows[1][0]="Ports ";
        rows[2][0]="Design ";
        rows[3][0]="Display";

        rows[0][1]="A17 Pro chip delivers a massive leap in graphics performance, transforming mobile gaming";
        rows[1][1]="USB-C connector with USB 3 for up to 20x faster transfer speeds footnote ² and new pro workflows";
        rows[2][1]="Strong and light titanium design with Action button — a fast track to your favorite feature";
        rows[3][1]="6.7-inch Super Retina XDR display footnote ¹ featuring ProMotion, Always-On, and Dynamic Island";
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

        img=new ImageIcon("project/picture/iphone15proMax.png");
        picture=new JLabel (img);
        picture.setBounds(20,40,200,400);
        panel.add(picture);

        note=new JLabel("iPhone 15 Pro Max");
        note.setBounds(285,10,400,200);
        font=new Font("Calibri",Font.BOLD,30);
        note.setFont(font);
        panel.add(note);

        note=new JLabel("From $1199or $49.95/mo.per month for 24 m. *");
        note.setBounds(285,60,800,200);
        note.setForeground(Color.BLACK);
        panel.add(note);

    }

}
