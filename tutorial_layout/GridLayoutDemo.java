package tutorial_layout;

// Demonstrating GridLayout.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GridLayoutDemo extends JFrame  {
   private JButton button;
   private JLabel label;
   private JTextField text;
   private JCheckBox check;
   private JRadioButton radio;
   private Container container;
   private GridLayout grid1;

   // set up GUI
   public GridLayoutDemo()
   {
      super( "GridLayout Demo" );

      // set up layouts
      grid1 = new GridLayout( 2, 3, 5, 5 );
      
      // get content pane and set its layout
      container = getContentPane();
      container.setLayout( grid1 );

      // create and add buttons
     button = new JButton("BUTTON");
      label = new JLabel("LABEL");
      text = new JTextField ("TEXTFIELD");
      check = new JCheckBox ("CHECKBOX");
      radio = new JRadioButton("OPTION",true);
     
      // place objects in BorderLayout; order not important
      container.add( button); 
      container.add( label); 
      container.add( text);  
      container.add( check);  
      container.add( radio); 

      setSize( 300, 300 );
      setVisible( true );

   } // end constructor GridLayoutDemo

   public static void main( String args[] )
   {
      GridLayoutDemo application = new GridLayoutDemo();
      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   } 

} // end class GridLayoutDemo

