// Demonstrating the menu class
import java.awt.*;
import java.awt.event.*;

public class menu {
	public static void main(String[] args) {
		Frame f = new Frame();		
f.setLayout(null);
f.setTitle("Menu Sample");
		f.setSize(600,300);
		f.setLocation(10,10);
		f.setVisible(true);
		f.addWindowListener(new MyWindowListener());
		
		MenuBar mb = new MenuBar();
		
		Menu mnuFile = new Menu("File");
		Menu mnuEdit = new Menu("Edit");
		Menu mnuView = new Menu("View");
		Menu mnuHelp = new Menu("Help");

		mb.add(mnuFile);
		mb.add(mnuEdit);
		mb.add(mnuView);
		mb.add(mnuHelp);

		MenuItem mnuFile1 = new MenuItem("New");
		MenuItem mnuFile2 = new MenuItem("Open");

		MenuItem mnuFile3 = new MenuItem("Close");
		MenuItem mnuFile4 = new MenuItem("Save");
		
		mnuFile.add(mnuFile1); 
		mnuFile.add(mnuFile2);
        mnuFile.addSeparator();
		mnuFile.add(mnuFile3);
		mnuFile.add(mnuFile4);
		
		MenuItem mnuEdit1 = new MenuItem("Cut");
		MenuItem mnuEdit2 = new MenuItem("Copy");
		MenuItem mnuEdit3 = new MenuItem("Paste");
		
		mnuEdit.add(mnuEdit1);
		mnuEdit.add(mnuEdit2);
		mnuEdit.add(mnuEdit3);
			
		f.setMenuBar(mb); 
	}

	static class MyWindowListener extends WindowAdapter{
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
}
