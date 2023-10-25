// Demonstrating the uses of Frame 
import java.awt.*;
import java.awt.event.*;

public class aktiviti1
{ 
    public static void main(String[] args) {
        Frame a = new Frame("Frame Saya");
        a.setVisible(true);
        a.setSize(400,300);
        a.setLayout(null);
        a.addWindowListener(new MyWindowListener ());               
    }

static class MyWindowListener extends WindowAdapter{
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}
}
