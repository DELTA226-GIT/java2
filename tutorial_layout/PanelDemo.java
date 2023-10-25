package tutorial_layout;

// Using a JPanel to help lay out components.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PanelDemo extends JFrame {
   private JPanel buttonPanel;
   private JButton buttons[];


   // set up GUI
   public PanelDemo()
   {
      super( "Panel Demo" );

      // get content pane
      Container container = getContentPane();

      // create buttons array
      buttons = new JButton[ 5 ];

      // set up panel and set its layout
      buttonPanel = new JPanel();
      buttonPanel.setLayout( new GridLayout( 1, buttons.length ) );

      // create and add buttons
      for ( int count = 0; count < buttons.length; count++ ) {
         buttons[ count ] = new JButton( "Button " + ( count + 1 ) );
         buttonPanel.add( buttons[ count ] );
      }

      container.add( buttonPanel, BorderLayout.SOUTH );

      setSize( 425, 150 );
      setVisible( true );

   } // end constructor PanelDemo

   public static void main( String args[] )
   {
      PanelDemo application = new PanelDemo();
      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

} // end class PanelDemo
