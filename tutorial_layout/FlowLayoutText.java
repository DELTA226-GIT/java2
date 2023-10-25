package tutorial_layout;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FlowLayoutText extends JFrame {
   private JTextField text;
   private Container container;
   private FlowLayout layout;
      
   public FlowLayoutText()
   {
      super( "FlowLayout Text" );
      layout = new FlowLayout();

      // get content pane and set its layout
      container = getContentPane();
      container.setLayout( layout );
      
      // set up right textbox 
      text = new JTextField( 10 );
      container.add( text );
      layout.setAlignment( FlowLayout.RIGHT );
      layout.layoutContainer( container );
  
      setSize( 800, 300 );
      setVisible( true );

   } // end constructor FlowLayoutText
  

   public static void main( String args[] )
   { 
      FlowLayoutText application = new FlowLayoutText();
      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

} // end class FlowLayoutText      
