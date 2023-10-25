package Chapter3;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class mouselistener extends JFrame implements MouseListener{

    private JLabel lbl;

    mouselistener(){
        addMouseListener(this); //apply to frame
        JLabel lbl = new JLabel();
        add(lbl);
    }

    public static void main(String[]args){
        mouselistener a = new mouselistener();
        a.setVisible(true);
        a.setSize(400,300);
        
    }

    public void mouseClicked(MouseEvent e){
        lbl.setText("Mouse Clicked");
    }
    
    public void mouseEntered(MouseEvent e){
        lbl.setText("Mouse Entered");
    }

    public void mouseExited(MouseEvent e){
        lbl.setText("Mouse Exited");
    }

    public void mousePressed(MouseEvent e){
        lbl.setText("Mouse Pressed");
    }

    public void mouseRealesed(MouseEvent e){
        lbl.setText("Mouse Released");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mouseReleased'");
    }

    
}
