import java.awt.*;
import javax.swing.*;

public class Journal extends JFrame {
	
	private final int SIZE = 400;
	
	private Container journalContainer = getContentPane();
	private JLabel journalWelcome = new JLabel("Welcome to Journal.");
	private JLabel instruct = new JLabel("Record your thoughts!");
	private JButton newEntry = new JButton("Make new journal entry.");
	private JButton getEntry = new JButton("Retrieve previous entry.");
	
	public Journal() {
		super("Journal");
		setSize(SIZE, SIZE / 2);
		journalContainer.setLayout(new FlowLayout());
		journalContainer.add(journalWelcome);
		journalContainer.add(instruct);
		journalContainer.add(newEntry);
		journalContainer.add(getEntry);
		journalContainer.setBackground(Color.green);
		}
		
	public static void main (String args[]) {
		Journal demo = new Journal();
		demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		demo.setVisible(true);
	}
	
	}
