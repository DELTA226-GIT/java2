package tutorial_layout;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FlowLayoutButton extends JFrame{
    private JButton leftButton,centerButton,rightButton;
    private Container container;
    private FlowLayout layout;

    public FlowLayoutButton()
    {
        super("FlowLayoutButton");
        layout=new FlowLayout();

        //get content pane and set its layout
        container = getContentPane();
        container.setLayout( layout );

      // set up leftButton and register listener
      leftButton = new JButton( "Left" );
      layout.setAlignment( FlowLayout.LEFT );
      layout.layoutContainer( container );
      container.add( leftButton );
      
      setSize( 800, 300 );
      setVisible( true );

    } // end constructor flowLayoutButton

    public static void main (String args[]){
        FlowLayoutButton application = new FlowLayoutButton();
      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

    }
    
} // end class FlowLayoutButton
