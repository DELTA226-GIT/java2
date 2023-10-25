// Demonstrating how to add GUI components onto frame and the setBounds() method
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleGUI 
{ 
    SimpleGUI () // create a constructor
    {
        // set frame properties
Frame a = new Frame();
        a.setVisible(true);
        a.setSize(500, 500);
        a.setTitle("Components Sample");
        a.setLayout(null);
        a.addWindowListener(new MyWindowListener ());
        
        // create and set the components properties
        Button bt = new Button("OK");
        bt.setBounds(20, 50, 50, 40);
        
        Label lb = new Label ("Enter your name:");
        lb.setBounds(20, 100, 100, 20);
        
        TextField tf = new TextField("<type name here>");
        tf.setBounds(20, 130, 100, 20);
        
        TextArea ta = new TextArea("<type address here>");
        ta.setBounds(20, 160, 100, 80);
        
        Checkbox cb1 = new Checkbox("Bold");
        Checkbox cb2 = new Checkbox("Italic");
        cb1.setBounds(20, 250, 100, 20);
        cb2.setBounds(130, 250, 100, 20);
        
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox cb3 = new Checkbox("New", cbg, true);
        Checkbox cb4 = new Checkbox("Open", cbg, false);
        cb3.setBounds(20, 280, 100, 20);
        cb4.setBounds(130, 280, 100, 20);
        
        Choice ch = new Choice();
        ch.add("badminton");
        ch.add("bolasepak");
        ch.setBounds(20, 310, 100, 20);

        // to add components on the frame
        a.add(bt);
        a.add(lb);
        a.add(tf);
        a.add(ta);
        a.add(cb1);
        a.add(cb2);
        a.add(cb3);
        a.add(cb4);
        a.add(ch);
    }

    public static void main(String[] args) {
        new SimpleGUI ();              
    }

static class MyWindowListener extends WindowAdapter{
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}
}	

