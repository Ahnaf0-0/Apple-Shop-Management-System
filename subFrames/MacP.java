package project.subFrames;
import java.awt.*;
import javax.swing.*;
import project.mainFrames.Products;

public class MacP extends Products {
    private final String []cols;
    private final String [][]rows;
    public MacP() {
        super("Mac Pro");

        cols=new String [2];
        rows=new String[4][2];

        cols[0]="Details";
        cols[1]="Specification";

        rows[0][0]="Proccesor";
        rows[1][0]="Feather ";
        rows[2][0]="Ports ";
        rows[3][0]="Connectivity";

        rows[0][1]="Supercharged by M2 Ultra, our most powerful and capable chip";
        rows[1][1]="PCIe gen 4 expansion slots provide up to twice the bandwidth for specialized workflows";
        rows[2][1]="Connect all your accessories with high-performance I/O, including eight Thunderbolt 4, two HDMI, and two 10Gb Ethernet ports";
        rows[3][1]="Comes with Magic accessories. Complete your setup with Pro Display XDR.";
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

        img=new ImageIcon("project/picture/macPro.png");
        picture=new JLabel (img);
        picture.setBounds(20,40,200,400);
        panel.add(picture);

        note=new JLabel("Mac Pro");
        note.setBounds(285,10,400,200);
        font=new Font("Calibri",Font.BOLD,30);
        note.setFont(font);
        panel.add(note);

        note=new JLabel("From $6999or $583.25/mo. per month for 12 mo. months  *");
        note.setBounds(285,60,800,200);
        note.setForeground(Color.BLACK);
        panel.add(note);

    }

}
