package tutorial_layout;

import java.awt.* ;
import java.awt.event.*;
import javax.swing.*;
  
public class GUIDia extends JFrame 
{
  JLabel     lData1  = new JLabel("Data Item 1");
  JTextField txData1 = new JTextField( 7 );
  JPanel     Panel1  = new JPanel();
   
  JLabel     	lData2  = new JLabel("Data Item 2");
  JTextField 	txData2 = new JTextField( 7 );
  JPanel     	Panel2  = new JPanel();
   
  JLabel     	lData3 	 = new JLabel("Data Item 3");
  JTextField 	txData3 = new JTextField( 7 );
  JPanel     	Panel3 	 = new JPanel();
   
  JLabel     	lData4  	= new JLabel("Data Item 4");
  JTextField 	txData4 = new JTextField( 7 );
  JPanel     	Panel4 	= new JPanel();
   
  JLabel     	lData5 	 = new JLabel("Data Item 5");
  JTextField 	txData5 = new JTextField( 7 );
  JPanel     	Panel5  = new JPanel();
   
  JLabel     	lData6  	= new JLabel("Data Item 6");
  JTextField 	txData6 = new JTextField( 7 );
  JPanel     	Panel6  = new JPanel();
   
  JPanel     	dataPan = new JPanel();
   	
  JButton    	butMorn = new JButton("Morning");
  JButton    	butNoon = new JButton("Noon");
  JButton    	butNite = new JButton("Night");
   
  JPanel     	leftPanel  = new JPanel();
  JPanel     	rightPanel = new JPanel();
  JPanel     	butPan     = new JPanel();
    
  public GUIDia()  
  { 
    super( "Morning Noon Night" );
	
   
    Panel1.add( lData1 ); Panel1.add( txData1 );
    Panel2.add( lData2 ); Panel2.add( txData2 );
    Panel3.add( lData3 ); Panel3.add( txData3 );
    Panel4.add( lData4 ); Panel4.add( txData4 );
    Panel5.add( lData5 ); Panel5.add( txData5 );
    Panel6.add( lData6 ); Panel6.add( txData6 );
   
    butPan.setLayout(
        new BoxLayout( butPan, BoxLayout.X_AXIS ) ); 
    butPan.add( butMorn );
    butPan.add( butNoon );
    butPan.add( butNite );
  
    leftPanel.setLayout(
        new BoxLayout( leftPanel, BoxLayout.Y_AXIS ) ); 
    leftPanel.add( Panel1 );  
    leftPanel.add( Panel2 ); 
    leftPanel.add( Panel3 ); 
   
    rightPanel.setLayout(
        new BoxLayout( rightPanel, BoxLayout.Y_AXIS ) ); 
    rightPanel.add( Panel4 );  
    rightPanel.add( Panel5 ); 
    rightPanel.add( Panel6 ); 
   
    dataPan.setLayout(
        new BoxLayout( dataPan, BoxLayout.X_AXIS ) ); 
    dataPan.add( leftPanel);
    dataPan.add( rightPanel);
  
    getContentPane().setLayout(
        new BoxLayout( getContentPane(), BoxLayout.Y_AXIS ) ); 
    getContentPane().add( dataPan );
    getContentPane().add( butPan );
   
   setSize( 400, 250 );    
    setVisible( true );    
  }
    
     
  public static void main ( String[] args )
  {
    GUIDia mnn  = new GUIDia() ;
  
   mnn.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        
  }
}
