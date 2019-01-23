package GUI;

import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class GUI {
	/*
	 * GUI: graphical user interface
	 */
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
				
				
				
				
		//Convert a number to binary string form
		String str = Integer.toBinaryString(987);
		
		//Create a component from type label
		JLabel label = new JLabel(str, JLabel.CENTER);
		JLabel label2 = new JLabel("This is a test", JLabel.CENTER);// ---> center means put the text at the label
		//Add a panel into the frame, to divide the container into several parts
		JPanel panel = new JPanel();
		
		//Add the panel to the frame
		frame.add(panel);
		
		//Create a button
		JButton btn = new JButton("Press");
				
		//Add the button to the panel
		panel.add(btn);
		btn.setBounds(10, 10, 100, 80);
		
		//Create a text field (a single line only)
		JTextField tf = new JTextField("Hello", 20);
		
		//Add the text field to the panel
		panel.add(tf);
		tf.setBounds(150, 10, 100, 50);
		
		//Create radio buttons and the button group
		JRadioButton r1 = new JRadioButton("V1", true);
		JRadioButton r2 = new JRadioButton("V2", false);
		
		//Create a button group, 
		//so that if and only if one button in the group can be selected at any time
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		//Add the button group to the panel
		panel.add(r1);
		r1.setBounds(0, 100, 100, 20);
		panel.add(r2);
		r2.setBounds(0, 120, 100, 20);
		
		//Add the tex tarea
		JTextArea jta = new JTextArea("hello");
		panel.add(jta);
		jta.setLineWrap(true);
		jta.setBounds(100, 180, 100, 50);
		
		//Add the combo box (JComboBox(Object[] items / Vector<E> items))
		String[] choices = {"V1", "V2", "V3"};
		JComboBox<String> jcb = new JComboBox<String>(choices);
		panel.add(jcb);
		jcb.setBounds(100, 250, 100, 20);
		
		//Create a table and add it to the panel
			//data are the elements stored in a two-dimensional matrix in the table
		String[][] data = {{" ", " " ," "},{" ", " " , " "},{" ", " "," "}};
			//columns stand for the header of each column
		String[] columns = {"ID","Name","Salary"};
		
		JTable jt = new JTable(data, columns);
		JScrollPane jsp = new JScrollPane(jt);
		panel.add(jsp);
		jsp.setBounds(100, 300, 150, 90);
		jsp.setBorder(BorderFactory.createTitledBorder (BorderFactory.createEtchedBorder (),
                "Table Title",
                TitledBorder.CENTER,
                TitledBorder.TOP));
		
		//Set the layout to null (necessary)
		panel.setLayout(null);
		/*
		 *  when you add setLayout(null), 
		 *  you have to add setBounds to adjust the position of the elements
		 *  otherwise they won't be displayed
		 */
		
		/*
		//Add labels to the panel
		panel.add(label);
		
		//setBounds means set the position of the labels:
		//x,y: position of the top-left corner; width, height: size of the rect
		label.setBounds(200, 200, 80, 60);
		
		panel.add(label2);
		label2.setBounds(200, 200, 200, 400);
		*/
		
		//Visualize the frame
		frame.setVisible(true);
		
		
		
				
		
	}

}
