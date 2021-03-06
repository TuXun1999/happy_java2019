package Event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class event {
	public static void main(String[] args){
JFrame frame = new JFrame("Hello, world");
		
		//Set the size of the frame
		frame.setSize(650, 600);
		
		//Exit the program immediately closing the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Set the menu bar
		JMenuBar menuBar = new JMenuBar();
				
		//Add menu item to the menu bar; ---> connect to events
		JMenu fileMenu = new JMenu("File");
				
		fileMenu.setMnemonic(KeyEvent.VK_F);
		menuBar.add(fileMenu);
				
		JMenu fileMenu2 = new JMenu("New File");
		fileMenu.setMnemonic(KeyEvent.VK_Q);
		menuBar.add(fileMenu2);
				
				
		//add sub menu items to the menu items
		JMenuItem newMenuItem = new JMenuItem("New", KeyEvent.VK_N);
		fileMenu.add(newMenuItem);
				
		JMenuItem newMenuItem2 = new JMenuItem("Another one", KeyEvent.VK_A);
		fileMenu.add(newMenuItem2);
				
		frame.setJMenuBar(menuBar);
				
				
				
				
		
		JPanel panel = new JPanel();
		
		//Add the panel to the frame
		frame.add(panel);
		JLabel label = new JLabel("No button is pressed");
		panel.add(label);
		label.setBounds(180, 100, 200, 20);
		
		//Create a button
		JButton btn = new JButton("OK");
				
		//Add the button to the panel
		panel.add(btn);
		btn.setBounds(10, 10, 100, 80);
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				label.setText("The button OK is clicked");
			}
		});
		
		JButton btn2 = new JButton("Cancel");
		
		//Add the button to the panel
		panel.add(btn2);
		btn2.setBounds(400, 10, 100, 80);
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				label.setText("The button Cancel is clicked");
			}
		});
		
		
		
		panel.setLayout(null);
		//Visualize the frame
		frame.setVisible(true);
		
	}
}
