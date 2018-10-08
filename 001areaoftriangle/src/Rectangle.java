
import javax.swing.JOptionPane;



public class Rectangle {

	// class variables go here
	private double length, width;
	private double perimeter;
	private double theArea;
	private double diag;

	
	
	



	// methods go here
	public void setVarsToZero() {
		length = 0.0;
		width = 0.0;
	
		diag = 0.0;
		perimeter = 0.0;
		theArea = 0.0;
		

	} // end of setVarsToZero

	public void showVars() {
	
		
		String msg = "Length, Width = " + length + ", "
				+ width + ", " + ";  perimeter: " + perimeter
				+ "; area = " + theArea;
		
		JOptionPane.showMessageDialog(null, msg);
		
	} // end of showVars
	
	public void setSides() {
		
		 length = Double.parseDouble(JOptionPane.showInputDialog("Please enter a value for length:"));
		
		
		
		
		width = Double.parseDouble(JOptionPane.showInputDialog("Please enter a value for width:"));
		
		
	} // end of setSides

	public void calcPerimeter() {
		perimeter = (length + width)* 2;
		
	} // end of calcPerimeter

	public void calcArea() {
		theArea = length * width;
		
	} // end of calcArea

	public void calcDiag() {
		double p = Math.pow(length, 2.0) + Math.pow(width, 2.0) ;
		diag = Math.sqrt(p);

		
		String msg = "Diagonol = " + diag; 
		JOptionPane.showMessageDialog(null, msg);
	}


} // end of class