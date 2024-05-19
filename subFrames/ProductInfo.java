package project.subFrames;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class ProductInfo extends JFrame {
    private final JTable table;
    private final DefaultTableModel model;
    private File file;
    private JButton deleteButton,insertButton;
    private FileWriter fwrite;
    private FileReader fileReader;
    private BufferedReader br;
    public ProductInfo() {
        setTitle("Cart Details");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        setLocationRelativeTo(null);
        this.setResizable(false);
        String[] columns = {"Product Name", "Product Price", "Product Type"};
        Object[][] data = {
                {"MackBook", "999 $", "Mac"},
        };
        model = new DefaultTableModel(data, columns);
        table = new JTable(model);
        table.setPreferredScrollableViewportSize(new Dimension(400, 200));
        table.setFillsViewportHeight(true);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

         deleteButton = new JButton("Delete Product");
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    model.removeRow(selectedRow);
                    saveProductsToFile();
                } else {
                    JOptionPane.showMessageDialog(ProductInfo.this, "Please select a row to delete.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

         insertButton = new JButton("Add New Product");
        insertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String productName = JOptionPane.showInputDialog("Enter product name:");
                String productPrice = JOptionPane.showInputDialog("Enter product price:");
                String productType = JOptionPane.showInputDialog("Enter product type:");
                model.addRow(new Object[]{productName, productPrice, productType});
                saveProductsToFile();
            }
        });
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(deleteButton);
        buttonPanel.add(insertButton);
        add(buttonPanel, BorderLayout.SOUTH);
        setVisible(true);
        loadProductsFromFile();
    }
    public void saveProductsToFile() {
        try {
            file = new File("project/data/products.txt");
            if (!file.exists()) {
                boolean newFile = file.createNewFile();
            }
            fwrite = new FileWriter(file, true);
            for (int i = 0; i < model.getRowCount(); i++) {
                for (int j = 0; j < model.getColumnCount(); j++) {
                    fwrite.write(model.getValueAt(i, j).toString() + ",");
                }
                fwrite.write("\n");
            }
            fwrite.flush();
            fwrite.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(ProductInfo.this, "Error saving products: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void loadProductsFromFile() {
        try {
            int counter = 0;
            fileReader = new FileReader("project/data/products.txt");
            br = new BufferedReader(fileReader);
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length == model.getColumnCount()) {
                    model.addRow(values);
                }
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(ProductInfo.this, "Error loading products: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }
}

