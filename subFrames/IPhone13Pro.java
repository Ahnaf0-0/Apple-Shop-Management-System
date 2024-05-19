package project.subFrames;
import java.awt.*;
import javax.swing.*;
import project.mainFrames.Products;

public class IPhone13Pro extends Products{

    public IPhone13Pro() {
        super("MacBook Air M1");

        String[] cols = new String[2];
        String[][] rows = new String[4][2];

        cols[0]="Details";
        cols[1]="Specification";

        rows[0][0]="Performance";
        rows[1][0]="Get more done faster";
        rows[2][0]="A brilliant display";
        rows[3][0]="Look sharp,sound great";

        rows[0][1]="Supercharged by the Apple M3 chip, so everything you do on your iMac is incredibly fast and responsive.";
        rows[1][1]="The powerful 8-core CPU to 10-core GPU  running smoothly.";
        rows[2][1]="Immersive 24-inch 4.5K Retina display Footnote Strikingly thin all-in-one desktop in seven vibrant colors";
        rows[3][1]="Look sharp and sound clear great with the 1080p FaceTime HD camera,three -mic array, and six speakers with Spatial Audio.";
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

        img=new ImageIcon("project/picture/iphone13pro.png");
        picture=new JLabel (img);
        picture.setBounds(20,40,200,400);
        panel.add(picture);

        note=new JLabel("From $1299or $108.25/mo. per month for 12 mo. months  *");
        note.setBounds(285,60,800,200);
        note.setForeground(Color.BLACK);
        panel.add(note);

    }

}
