package project.subFrames;
import java.awt.*;
import javax.swing.*;
import project.mainFrames.Products;

public class Airpod extends Products{
    private final String []cols;
    private final String [][]rows;
    public Airpod() {
        super("A");

        cols=new String [2];
        rows=new String[4][2];

        cols[0]="Details";
        cols[1]="Specification";

        rows[0][0]="Accessibility";
        rows[1][0]="Battery ";
        rows[2][0]="Dimention ";
        rows[3][0]="Connection";

        rows[0][1]="Quick access to Siri with a double-tap";
        rows[1][1]=" More than 24 hours listening time,3 up to 11 hours talk time6";
        rows[2][1]=" 0.65 by 0.71 by 1.59 inches (16.5 by 18.0 by 40.5 mm)";
        rows[3][1]="Lightning connector";
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

        img=new ImageIcon("project/picture/gen1.png");
        picture=new JLabel (img);
        picture.setBounds(20,40,200,400);
        panel.add(picture);

        note=new JLabel("A");
        note.setBounds(285,10,400,200);
        font=new Font("Calibri",Font.BOLD,30);
        note.setFont(font);
        panel.add(note);

        note=new JLabel(" $200 *");
        note.setBounds(285,60,800,200);
        note.setForeground(Color.BLACK);
        panel.add(note);

    }

}

