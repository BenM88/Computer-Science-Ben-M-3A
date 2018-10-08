import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class SwingConverter implements ActionListener {
	private JPanel inputPanel = initInputPanel();
	private JTextField inputText;
	private JTextField inputText2;
	private JTextArea resultArea;
	private JTextArea resultArea2;
	private JButton enterButton;
	private JButton enterButton2;
	
	
	
	public SwingConverter() {
		javax.swing.JFrame myWindow = new JFrame("Base Converter - Created by: Ben M");
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myWindow.add(inputPanel);
		myWindow.setSize(600, 500);
		myWindow.setVisible(true);
		
		
	}
	
	
	
	
	
	
	
	
	
	private JPanel initInputPanel() {
		JPanel panel = new JPanel();
		panel.setPreferredSize(new java.awt.Dimension(600, 500));
		panel.setLayout(null);
		JLabel label = new JLabel("Enter a base-10 number: ");
		label.setBounds(50, 50, 220, 30); 
		panel.add(label);
		JLabel Spherelabel = new JLabel("Enter Radius: ");
		Spherelabel.setBounds(50, 100, 220, 30);
		panel.add(Spherelabel);
		
		JTextField text;
		text = inputText = new JTextField();
		text.setBounds(230, 50, 100, 30);
		panel.add(text);
		
		JTextField text2;
		
		text2 = inputText2 = new JTextField();
		text2.setBounds(230, 100, 100, 30);
		panel.add(text2);
		
		JButton button = new JButton("Enter");
		button.setActionCommand("Enter");
		button.setBounds(340, 50, 80, 30);
		button.setBackground(java.awt.Color.BLUE);
		button.addActionListener(this);
		panel.add(button);
		// save to the class variable to be used in other methods
		enterButton = button;
		
		JButton button2 = new JButton("Calculate");
		button2.setActionCommand("Calculate");
		button2.setBounds(340, 100, 80, 30);
		button2.setBackground(java.awt.Color.BLUE);
		button2.addActionListener(this);
		panel.add(button2);
		
		
		button = new JButton("Reset");
		button.setActionCommand("Reset");
		button.setBounds(430, 50, 80, 30);
		button.setBackground(java.awt.Color.YELLOW);
		button.addActionListener(this);
		panel.add(button);
		
		button = new JButton("Reset Rd");
		button.setActionCommand("Reset Rd");
		button.setBounds(430, 100, 80, 30);
		button.setBackground(java.awt.Color.PINK);
		button.addActionListener(this);
		panel.add(button);
		
		resultArea = new JTextArea();
		resultArea.setBounds(50, 180, 500, 200);
		resultArea.setEditable(false);
		resultArea.setBackground(java.awt.Color.GREEN);
		panel.add(resultArea);
	
				
		
		
		
		
		return panel;
	}


	






	public static void main(String[] args) throws Exception {
		new SwingConverter();
	}









	@Override
	public void actionPerformed(ActionEvent ev) {
		String command = ev.getActionCommand();
		if (command.equals("Enter")) {
				showResult();
		} else if (command.equals("Reset")) {
				reset();
		}
		else if (command.equals("Reset Rd")) {
			reset2();
		}
		else if (command.equals("Calculate")) {
			showResult2();
			
		}
		
		
		
		
	}






	private void reset2() {
	inputText2.setText("");
	resultArea2.setText("");
	inputText2.setEnabled(true);
	enterButton2.setEnabled(true);
	
	inputText2.requestFocus();
	}
	private void reset() {
		//System.out.println("reset entered");
		inputText.setText("");
		resultArea.setText("");
		
		inputText.setEnabled(true);
		enterButton.setEnabled(true);
		
		inputText.requestFocus();
		
	}


	private void showResult2() {
		//System.out.println("Show result entered");
		
		
		inputText.setEnabled(false);
		enterButton2.setEnabled(false);
		
		Integer r = getInputNumber2();
		if (r == null) {
			resultArea2.append("Invalid Number !");
			return;
		}
		
		double Volume = (4/3*(Math.PI*(Math.pow(r.intValue(), 3))));
		//int SurfaceArea = r.intValue();
		
		resultArea2.append("Volume = " + Volume + "\n");
		// resultArea2.append("Surface Area = " + Integer.toString(SurfaceArea, 2) + "\n");
		
		
		
		
		
	}






	private void showResult() {
		//System.out.println("Show result entered");
		
		String hexUpperCase;
		inputText.setEnabled(false);
		enterButton.setEnabled(false);
		
		Integer n = getInputNumber();
		if (n == null) {
			resultArea.append("Invalid Number !");
			return;
		}
		
		int baseTen = n.intValue();
		resultArea.append("Base Ten = " + baseTen + "\n");
		resultArea.append("binary = " + Integer.toString(baseTen, 2) + "\n");
		resultArea.append("octal = " + Integer.toString(baseTen, 8) + "\n");
		resultArea.append("hexadecimal = " + Integer.toString(baseTen, 16) + "\n");
		
		hexUpperCase = Integer.toString(baseTen, 16).toUpperCase();
		resultArea.append("hexadecimal = " + hexUpperCase + "\n");
		
		
	}









	private Integer getInputNumber() {
		try {
			Integer n = Integer.parseInt(inputText.getText());
			return n;
		} catch (Exception e) {
			// oops problem with number entry
			// this traps that error, and tells user the error
			// return null is to prevent a total crash, doesnt fix the problem
			// not good
			return null;
		}
		
	}
	
	private Integer getInputNumber2() {
		try {
			Integer r = Integer.parseInt(inputText.getText());
			return r;
		} catch (Exception e) {
			// oops problem with number entry
			// this traps that error, and tells user the error
			// return null is to prevent a total crash, doesnt fix the problem
			// not good
			return null;
		}
		
	}

}
