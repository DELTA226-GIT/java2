import javax.swing.*;
import java.awt.*;

public class TabbedExample1 {
	public static void main(String[] args) {
		// Create a JFrame (window) to hold the tabs
		JFrame frame = new JFrame("Drive F: Properties");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);

		// Create a JTabbedPane to hold the tabs
		JTabbedPane tabbedPane = new JTabbedPane();

		// Create the content for the tabs
		// Tab 1 Starts
		JPanel tab1 = new JPanel(new GridBagLayout());
		GridBagConstraints gbc1 = new GridBagConstraints();
		gbc1.gridy = 0;
		gbc1.gridx = 1;
		gbc1.anchor = GridBagConstraints.WEST;

		JLabel label1 = new JLabel("Drive Name : ");
		label1.setHorizontalAlignment(JLabel.LEFT);
		tab1.add(label1);
		JTextField textField1 = new JTextField(20);
		tab1.add(textField1);

		gbc1.gridy = 1;
		JLabel label2 = new JLabel("Divice Type: Universal Serial Bus Drive");
		tab1.add(label2, gbc1);

		gbc1.gridy = 2;
		JLabel label3 = new JLabel("File System: NT File System (NTFS)");
		tab1.add(label3, gbc1);

		gbc1.gridy = 3;
		JLabel labelimg = new JLabel(new ImageIcon(
				"C:/Users/ahmad/OneDrive/Desktop/SEM 5/DFP50273 - INTEGRATIVE PROGRAMMING AND TECHNOLOGIES/driveimg.png"));
		tab1.add(labelimg, gbc1);

		tabbedPane.addTab("General", tab1);
		// Tab 1 Ends

		// Tab 2 Starts
		JPanel tab2 = new JPanel(new GridBagLayout());
		GridBagConstraints gbc2 = new GridBagConstraints();
		gbc2.gridy = 0;
		gbc2.gridx = 0;
		gbc2.anchor = GridBagConstraints.WEST;

		JLabel label_errchecking = new JLabel("Error Checking: ");
		tab2.add(label_errchecking);

		gbc2.gridy = 2;
		JLabel label_info = new JLabel("This option will check the drive for file system errors");
		tab2.add(label_info, gbc2);

		gbc2.gridy = 3;
		JLabel label_img = new JLabel(new ImageIcon(
				"C:/Users/ahmad/OneDrive/Desktop/SEM 5/DFP50273 - INTEGRATIVE PROGRAMMING AND TECHNOLOGIES/flatdriver.png"));
		tab2.add(label_img, gbc2);

		gbc2.gridx = 3;
		JButton btncheck = new JButton("Check");
		tab2.add(btncheck, gbc2);

		tabbedPane.addTab("Tools", tab2);
		// Tab 2 Ends

		// Tab 3 Starts
		JPanel tab3 = new JPanel(new GridBagLayout());
		GridBagConstraints gbc3 = new GridBagConstraints();
		gbc3.gridy = 0;
		gbc3.gridx = 0;
		gbc3.anchor = GridBagConstraints.WEST;

		JLabel label_1 = new JLabel("All disk drives: ");
		tab3.add(label_1);

		gbc3.gridy = 1;
		JLabel label_title = new JLabel("Name:");
		tab3.add(label_title, gbc3);

		gbc3.gridy = 2;
		JLabel label_drive = new JLabel("JMicron Tech SCSI Disk Device");
		tab3.add(label_drive, gbc3);

		gbc3.gridy = 3;
		JLabel label_other = new JLabel("Type:");
		tab3.add(label_other, gbc3);

		gbc3.gridy = 4;
		JLabel label_type = new JLabel("Disk Drives");
		tab3.add(label_type, gbc3);

		gbc3.gridy = 5;
		JButton btnokay = new JButton("OK");
		tab3.add(btnokay, gbc3);

		gbc3.gridx = 5;
		JButton btncancel = new JButton("CANCEL");
		tab3.add(btncancel, gbc3);

		tabbedPane.addTab("Hardware", tab3);
		// Tab 3 Ends

		// Tab 4 Starts
		JPanel tab4 = new JPanel(new GridBagLayout());
		GridBagConstraints gbc4 = new GridBagConstraints();
		gbc4.gridx = 0;
		gbc4.anchor = GridBagConstraints.WEST;

		JLabel label_folder = new JLabel("What kind of folder do you want : ");
		tab4.add(label_folder);

		gbc4.gridy = 1;
		JLabel label_optimize = new JLabel("Optimize this folder for :");
		tab4.add(label_optimize, gbc4);

		gbc4.gridy = 2;
		// array of string containing cities
		String s1[] = { "General Items", "Documents", "Pictures", "Videos" };
		// create checkbox
		JComboBox c1 = new JComboBox(s1);
		tab4.add(c1, gbc4);

		gbc4.gridy = 3;
		JCheckBox cbox = new JCheckBox();
		tab4.add(cbox, gbc4);

		gbc4.gridy = 3;
		JLabel label_apply = new JLabel("                      Also apply for this template.");
		tab4.add(label_apply, gbc4);

		tabbedPane.addTab("Customize", tab4);

		gbc4.gridy = 5;
		JButton btnsave = new JButton("Save Setting");
		tab4.add(btnsave, gbc4);
		// Tab 4 Ends

		// Add the JTabbedPane to the JFrame
		frame.add(tabbedPane);

		// Make the JFrame visible
		frame.setVisible(true);
	}
}
