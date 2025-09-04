package chapter7.JavaSwingGUI;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

//Java Swing is a technology provided by
//Java Creators to help developers create
//Window Based Application using Java Language.
//This is possible by libraries provided from 
//Java Swing technology.

public class TestSwing {
	
	
//A simple concrete class can be used to create 
	//Window based applications by
	//1. extending "JFrame"
	//2. Creating an object of JFrame inside main class
	
	public static void main(String[] args) {
		
		//Java Swing proposes different Layouts like:
		//1. Absolute Layout - Room For Freedom
		//2. Border Layout - North, south, east, west, center
		//No room for freedom in border layout
		//3. Grid Layout , and many more
		
		//Components of JAVA Swing:
		//1. JLabel- Used for writing and showing text to user
		//Not used often for clickable 
		//2. JButton - Used for passing data , showing some clickable
		//results 
		//3. JTextfield - Used for getting textual data from user
		
		
		JFrame jf = new JFrame();
		
		JButton jb = new JButton("Click here!");
		
		jb.setBounds(200, 200, 100, 100);
		//jb.setBounds(x,y,width,height)
		

		
		jf.setVisible(true);//Visibility of frame 
		jf.setSize(500,500);//Resolution based size of frame
		jf.setLayout(null);
		jf.add(jb); //Button object "jb" needs to be added to frame
		
//For event handling in any components of JavaSwing like JButton,
// we need to use 'Listener Interfaces'
//Listener Interfaces handles different events in Java Swing
		
//We will use Action Listener for event of clicking the JButton		
jb.addActionListener( );

//ActionPerformed helps developers to add events to a Certain action
//like, if we want to show to the console an output of
//button is pressed, we do it inside the actionPerformed method.

//JOptionPane helps to show dialog boxes for data output.
		
		
	}
}
