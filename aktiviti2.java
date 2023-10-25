// Demonstrating the uses of constructor
import java.awt.*;
import java.awt.event.*;

public class aktiviti2
{
    aktiviti2( ) // create a constructor
    {
        Frame a = new Frame("Frame Saya");
        a.setVisible(true);
        a.setSize(400,300);
        a.setLayout(null);
        a.addWindowListener(new MyWindowListener ());
    }

    public static void main(String[] args) {
        new aktiviti2();               
    }

static class MyWindowListener extends WindowAdapter{
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}
}
