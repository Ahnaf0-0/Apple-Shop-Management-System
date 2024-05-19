package project.subFrames;
import java.awt.*;
import javax.swing.*;
import project.mainFrames.Products;

public class Xdr extends Products{
    private final String []cols;
    private final String [][]rows;
    public Xdr() {
        super("Pro Display XDR");

        cols=new String [2];
        rows=new String[4][2];

        cols[0]="Details";
        cols[1]="Specification";

        rows[0][0]="Display";
        rows[1][0]="XDR";
        rows[2][0]="Picture Quality";
        rows[3][0]="Color Contrast";

        rows[0][1]="32-inch 6K Retina displayFootnote1 provides astoundingly sharp and detailed imagery";
        rows[1][1]="1,000,000:1 contrast ratio and stunningly real XDR imagery";
        rows[2][1]="Three studio-quality mics and six-speaker sound system with Spatial Audio for more immersive calls, movies, and music";
        rows[3][1]="P3 wide color gamut and 10-bit color depth for the highest-quality color possible";
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

        img=new ImageIcon("project/picture/xdr.png");
        picture=new JLabel (img);
        picture.setBounds(20,40,200,400);
        panel.add(picture);

        note=new JLabel("Pro Display XDR");
        note.setBounds(285,10,400,200);
        font=new Font("Calibri",Font.BOLD,30);
        note.setFont(font);
        panel.add(note);

        note=new JLabel("$4999 or $416.58/mo. per month for 12 mo. months Footnote *");
        note.setBounds(285,60,800,200);
        note.setForeground(Color.BLACK);
        panel.add(note);

    }

}
