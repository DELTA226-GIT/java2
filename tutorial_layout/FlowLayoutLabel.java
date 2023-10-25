package tutorial_layout;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FlowLayoutLabel extends JFrame {
    private JLabel raiden;
    private Container container;
    private FlowLayout layout;

    public FlowLayoutLabel()
    {
        super( "FlowLayout Label" );
        layout = new FlowLayout();

        //get content pane and set its layout
        container = getContentPane();
        container.setLayout(layout);

        // set up center Label 
        raiden = new JLabel( "Center ugh" );
        layout.setAlignment( FlowLayout.CENTER );
        layout.layoutContainer( container );
        container.add( raiden );

        setSize(800,300);
        setVisible( true );
    } // end constructor FlowLayoutLabel
    
    public static void main(String args[]){
        FlowLayoutLabel application = new FlowLayoutLabel();
        application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  
    }
}// end class FlowLayoutLabel
