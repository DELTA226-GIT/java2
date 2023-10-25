package bab2;

import javax.swing.*;

public class jscrollbar {
    
    jscrollbar(){
        JFrame f = new JFrame("java scrollbar");
    JScrollBar s = new JScrollBar();
    s.setBounds(100,100,50,100);
    f.add(s);
    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);
    }

    public static void main(String args[]) {
        new jscrollbar();
    }
}
