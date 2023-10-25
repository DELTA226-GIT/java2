package tutorial_layout;

// Demonstrating BorderLayout.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BorderLayoutDemo extends JFrame  {
   private JButton button;
   private JLabel label;
   private JTextField text;
   private JCheckBox check;
   private JRadioButton radio;
   private BorderLayout layout;
  
   public BorderLayoutDemo()
   {
      super( "BorderLayout Demo" );
      layout = new BorderLayout( 5, 5 ); // 5 pixel gaps

      // get content pane and set its layout
      Container container = getContentPane();
      container.setLayout( layout );

      // instantiate button objects
      button = new JButton("NORTH");
      label = new JLabel("SOUTH");
      text = new JTextField ("WEST");
      check = new JCheckBox ("CENTER");
      radio = new JRadioButton("EAST",true);

      // place objects in BorderLayout
      container.add( button, BorderLayout.NORTH ); 
      container.add( label, BorderLayout.SOUTH ); 
      container.add( text, BorderLayout.WEST );  
      container.add( check, BorderLayout.CENTER );  
      container.add( radio, BorderLayout.EAST ); 

      setSize( 300, 300);
      setVisible( true );

   } // end constructor BorderLayoutDemo
public static void main( String args[] )
   { 
      BorderLayoutDemo application = new BorderLayoutDemo();
      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

} // end class BorderLayoutDemo

