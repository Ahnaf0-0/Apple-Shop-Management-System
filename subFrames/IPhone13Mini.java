package project.subFrames;
import java.awt.*;
import javax.swing.*;
import project.mainFrames.Products;

public class IPhone13Mini extends Products{
    private final String []cols;
    private final String [][]rows;
    public IPhone13Mini() {
        super("Studio Display");

        cols=new String [2];
        rows=new String[4][2];

        cols[0]="Details";
        cols[1]="Specification";

        rows[0][0]="Display";
        rows[1][0]="Camera";
        rows[2][0]="Sound Quality";
        rows[3][0]="Connectivity";

        rows[0][1]="27-inch 5K Retina display draws you in with 14.7 million pixels and one billion colors";
        rows[1][1]="12MP Ultra Wide camera with Center Stage — powered by Apple silicon — allows for more engaging video calls";
        rows[2][1]="Three studio-quality mics and six-speaker sound system with Spatial Audio for more immersive calls, movies, and music";
        rows[3][1]="Pairs perfectly with any Mac, including the all-new Mac Studio. Add new matching Magic accessories to complete your studio.";
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

        img=new ImageIcon("project/picture/iphone13mini.png");
        picture=new JLabel (img);
        picture.setBounds(20,40,200,400);
        panel.add(picture);

        note=new JLabel("Iphone 13 Mini");
        note.setBounds(285,10,400,200);
        font=new Font("Calibri",Font.BOLD,30);
        note.setFont(font);
        panel.add(note);

        note=new JLabel("From $1299or $108.25/mo. per month for 12 mo. months  *");
        note.setBounds(285,60,800,200);
        note.setForeground(Color.BLACK);
        panel.add(note);

    }

}
