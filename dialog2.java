import java.awt.*;
import java.awt.event.*;

public class dialog2 {
    public static void main(String[]args){


        final Frame frame1 = new Frame("dialog2");
        frame1.setLayout(new FlowLayout());
        Button button = new Button("This is dialog example");
    
        frame1.add(button);
        frame1.setBounds(100,100,200,150);
        frame1.setVisible(true);
    }
   
}
