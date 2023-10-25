import javax.swing.*;
import java.awt.*;

public class TabbedExample {
    public static void main(String[] args) {
        // Create a JFrame (window) to hold the tabs
        JFrame frame = new JFrame("Tabbed Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a JTabbedPane to hold the tabs
        JTabbedPane tabbedPane = new JTabbedPane();
       
        // Create the content for the tabs
        JPanel tab1 = new JPanel(new GridBagLayout());
        GridBagConstraints gbc1 = new GridBagConstraints();
        gbc1.gridx = 0;
        gbc1.gridy = 0;
        gbc1.anchor = GridBagConstraints.WEST;

        JLabel label1 = new JLabel("Drive Name : ");
        tab1.add(label1);
        JTextField textField1 = new JTextField(10);
        tab1.add(textField1);
       
        gbc1.gridy = 1;
        JLabel label2 = new JLabel("Divice Type: Universal Serial Bus Drive");
        tab1.add(label2, gbc1);


        gbc1.gridy = 2;
        JLabel label3 = new JLabel("File System: NT File System (NTFS)");
        tab1.add(label3, gbc1);

       
        tabbedPane.addTab("Tab 1", tab1);
        
        
        JPanel tab2 = new JPanel();
        tab2.add(new JLabel("This is Tab 2"));

        JPanel tab3 = new JPanel();
        tab3.add(new JLabel("This is Tab 3"));
        
        JPanel tab4 = new JPanel();
        tab4.add(new JLabel("This is Tab 4"));

        // Add the tabs to the JTabbedPane
        tabbedPane.addTab("Tab 1", tab1);
        tabbedPane.addTab("Tab 2", tab2);
        tabbedPane.addTab("Tab 3", tab3);
        tabbedPane.addTab("Tab 4", tab4);

        // Add the JTabbedPane to the JFrame
        frame.add(tabbedPane);
       

        // Make the JFrame visible
        frame.setVisible(true);
    }
}
