package Chapter3;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class itemlistener extends JFrame implements ItemListener{
    
    itemlistener(){
        Checkbox chk = new Checkbox("Click me");
        add(chk);
        chk.addItemListener(this);
    }

    public static void main(String[]args){
        itemlistener a = new itemlistener();
         a.setVisible(true);
        a.setSize(400,300);
        
    }

    public void itemStateChanged(ItemEvent e){
        if(e.getStateChange()==1){
            JOptionPane.showMessageDialog(null,"Checkbox is Checked");

        }
        if(e.getStateChange()==2){
            JOptionPane.showMessageDialog(null,"Checkbox is unChecked");
        }
    }
} //endclass
