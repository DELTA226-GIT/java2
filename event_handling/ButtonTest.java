package event_handling;

// Creating JButtons.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonTest extends JFrame {
   private JButton plainButton, fancyButton;

   // set up GUI
   public ButtonTest()
   {
      super( "Testing Buttons" );

      // get content pane and set its layout
      Container container = getContentPane();
      container.setLayout( new FlowLayout() );

      // create buttons
      plainButton = new JButton( "Plain Button" );
      container.add( plainButton );

      fancyButton = new JButton("Fancy Button");
      container.add( fancyButton );

      // create an instance of inner class ButtonHandler
      // to use for button event handling 
      ButtonHandler handler = new ButtonHandler();
      fancyButton.addActionListener( handler );
      plainButton.addActionListener( handler );

      setSize( 275, 100 );
      setVisible( true );

   } // end ButtonTest constructor

   public static void main( String args[] )
   { 
      ButtonTest application = new ButtonTest();
      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

   // inner class for button event handling
   private class ButtonHandler implements ActionListener {

      // handle button event
      public void actionPerformed( ActionEvent event )
      {
         JOptionPane.showMessageDialog( ButtonTest.this,
            "You pressed: " + event.getActionCommand() );
      }

   } // end private inner class ButtonHandler

} // end class ButtonTest
