package project.subFrames;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
abstract public  class CartFrame extends JFrame implements ActionListener {
    private JPanel panel;
    private JLabel note, picture;
    private JButton button;
    private Font font;
    private JTable table;
    private JScrollPane scroll;


    public CartFrame() {
        super("Cart");
        this.setSize(800, 600);
        this.setLocation(200, 200);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        String[] cols = new String[2];

        String[][] rows = new String[2][1];

        panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);


        cols[0] = "Pruduct Name ";
        cols[1] = "Product Price ";

        rows[0][0] = "Procecor";
        rows[1][0] = "Storage";
        rows[0][1] = "Apple M1";

        table = new JTable(rows, cols);
        scroll = new JScrollPane(table);
        scroll.setBounds(280, 180, 500, 200);
        panel.add(scroll);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals(" BUY ")) {
            Store s = new Store();
            s.setVisible(true);
            this.setVisible(false);
        } else if (ae.getActionCommand().equals(" Add To Cart ")) {
            Store s = new Store();
            s.setVisible(true);
            this.setVisible(false);
        }
    }
}





