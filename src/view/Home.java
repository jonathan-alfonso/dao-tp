package view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controller.HomeController;

public class Home extends JFrame {
	
	private HomeController controller;
	
	private JFrame mainJFrame;
	private JLabel lastnameJLabel, firstnameJLabel, loginJLabel, pwdJLabel;
	private JTextField loginField, lastnameField, firstnameField;
	private JPasswordField pwdField;
	private JButton clearButton, createButton;
	
	private Home() {
		// Set form properties
		mainJFrame = new JFrame("Add new user"); // Create frame + title
		mainJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close window
		mainJFrame.setLayout(new GridLayout(0, 2));
		
		
		// Create components
		//controlJPanel = new JPanel();
		//controlJPanel.setLayout(new FlowLayout());
		lastnameJLabel = new JLabel("Last name : ");
		lastnameField = new JTextField();
		firstnameJLabel = new JLabel("First name : ");
		firstnameField = new JTextField();
		loginJLabel = new JLabel("Login : ");
		loginField = new JTextField();
		pwdJLabel = new JLabel("Create password : ");
		pwdField = new JPasswordField();
		clearButton = new JButton("Clear");
		createButton = new JButton("Create");
		
		// Add components
		mainJFrame.add(lastnameJLabel);
		mainJFrame.add(lastnameField);
		mainJFrame.add(firstnameJLabel);
		mainJFrame.add(firstnameField);
		mainJFrame.add(loginJLabel);
		mainJFrame.add(loginField);
		mainJFrame.add(pwdJLabel);
		mainJFrame.add(pwdField);
		mainJFrame.add(clearButton);
		mainJFrame.add(createButton);
		
		// Set size and visibility
		mainJFrame.pack();
		mainJFrame.setVisible(true); // Display window
		
		
	}
	
	public static void main(String[] args) {
		Home home = new Home();
		
	}

}
