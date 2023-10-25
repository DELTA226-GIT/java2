import javax.swing.*;
import java.awt.*;

public class LabelExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Label Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel tab1Panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc1 = new GridBagConstraints();
        gbc1.gridx = 0;
        gbc1.gridy = 0;
        gbc1.anchor = GridBagConstraints.WEST;

        JLabel label1 = new JLabel("Label 1 in Tab 1:");
        tab1Panel.add(label1, gbc1);
        
        gbc1.gridy = 1;
        JLabel label2 = new JLabel("Label 2 in Tab 1:");
        tab1Panel.add(label2, gbc1);

        tabbedPane.addTab("Tab 1", tab1Panel);

        JPanel tab2Panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc2 = new GridBagConstraints();
        gbc2.gridx = 0;
        gbc2.gridy = 0;
        gbc2.anchor = GridBagConstraints.WEST;

        JLabel label3 = new JLabel("Label 1 in Tab 2:");
        tab2Panel.add(label3, gbc2);
        
        gbc2.gridy = 1;
        JLabel label4 = new JLabel("Label 2 in Tab 2:");
        tab2Panel.add(label4, gbc2);

        tabbedPane.addTab("Tab 2", tab2Panel);

        frame.add(tabbedPane);
        frame.setVisible(true);
    }
}
