package event_handling;

// Creating radio buttons using ButtonGroup and JRadioButton.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RadioButtonTest extends JFrame {
   private JTextField field;
   private Font plainFont, boldFont, italicFont, boldItalicFont;
   private JRadioButton plainButton, boldButton, italicButton, 
      boldItalicButton;
   private ButtonGroup radioGroup;

   // create GUI and fonts
   public RadioButtonTest()
   {
      super( "RadioButton Test" );

      // get content pane and set its layout
      Container container = getContentPane();
      container.setLayout( new FlowLayout() );

      // set up JTextField
      field = new JTextField( "Watch the font style change", 25 );
      container.add( field ); 

      // create radio buttons
      plainButton = new JRadioButton( "Plain", true );
      container.add( plainButton );

      boldButton = new JRadioButton( "Bold", false );
      container.add( boldButton );

      italicButton = new JRadioButton( "Italic", false );
      container.add( italicButton );

      boldItalicButton = new JRadioButton( "Bold/Italic", false );
      container.add( boldItalicButton );

      // create logical relationship between JRadioButtons
      radioGroup = new ButtonGroup();
      radioGroup.add( plainButton );
      radioGroup.add( boldButton );
      radioGroup.add( italicButton );
      radioGroup.add( boldItalicButton );

      // create font objects
      plainFont = new Font( "Serif", Font.PLAIN, 14 );
      boldFont = new Font( "Serif", Font.BOLD, 14 );
      italicFont = new Font( "Serif", Font.ITALIC, 14 );
      boldItalicFont = new Font( "Serif", Font.BOLD + Font.ITALIC, 14 );
      field.setFont( plainFont );  // set initial font
      
      // register events for JRadioButtons
      plainButton.addItemListener( new RadioButtonHandler( plainFont ) );
      boldButton.addItemListener( new RadioButtonHandler( boldFont ) );
      italicButton.addItemListener( 
         new RadioButtonHandler( italicFont ) );
      boldItalicButton.addItemListener( 
         new RadioButtonHandler( boldItalicFont ) );

      setSize( 300, 100 );
      setVisible( true );

   } // end RadioButtonTest constructor

   public static void main( String args[] )
   {
      RadioButtonTest application = new RadioButtonTest();
      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   } 

   // private inner class to handle radio button events
   private class RadioButtonHandler implements ItemListener {
      private Font font;

      public RadioButtonHandler( Font f )
      {
         font = f;
      }
           
      // handle radio button events
      public void itemStateChanged( ItemEvent event )
      {
         field.setFont( font );
      }

   } // end private inner class RadioButtonHandler

} // end class RadioButtonTest
