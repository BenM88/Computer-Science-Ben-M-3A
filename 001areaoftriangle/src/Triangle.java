import java.util.Scanner;
import javax.swing.JOptionPane;



public class Triangle {

	// class variables go here
	private double sideA, sideB, sideC;
	private double perimeter;
	private double theArea;
	
	// Scanner keyboard = new Scanner(System.in);
	

	// constructor goes here
	public Triangle() {
		

	}

	// methods go here
	public void setVarsToZero() {
		sideA = 0.0;
		sideB = 0.0;
		sideC = 0.0;
		perimeter = 0.0;
		theArea = 0.0;
		

	} // end of setVarsToZero

	public void showVars() {
	
		
		String msg = "Side A, B, C = " + sideA + ", "
				+ sideB + ", " + sideC + "; perimeter: " + perimeter
				+ "; area = " + theArea;
		
		JOptionPane.showMessageDialog(null, msg);
		
	} // end of showVars
	
	public void setSides() {
		//System.out.println("Please enter a value for side A:");
		//sideA = keyboard.nextDouble();
		boolean b = true;
		while (b) {
			try {
				sideA = Double.parseDouble(JOptionPane.showInputDialog("please enter the value for side A"));
				b = false;
				
			}catch (Exception e ) {
				JOptionPane.showMessageDialog(null, "Please Enter a Number");
			}
		}
		
		//System.out.println("Please enter a value for side B:");
		//sideB = keyboard.nextDouble();
		
		sideB = Double.parseDouble(JOptionPane.showInputDialog("Please enter a value for side B:"));
		
		//System.out.println("Please enter a value for side C:");
		//sideC = keyboard.nextDouble();
		
		sideC = Double.parseDouble(JOptionPane.showInputDialog("Please enter a value for side C:"));
		
	} // end of setSides

	public void calcPerimeter() {
		perimeter = sideA + sideB + sideC;
		
	} // end of calcPerimeter

	public void calcArea() {
		double p = 0.0;
		p = (sideA + sideB + sideC)/2.0;
		theArea = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
		
	} // end of calcArea

	public void calcAngles() {
		double cosA = 0.0, Acos = 0.0, Adeg = 0.0, cosB = 0.0, Bcos = 0.0, Bdeg = 0.0, 
				cosC = 0.0, Ccos = 0.0, Cdeg = 0.0 ;
		// angle A
		cosA = (Math.pow(sideB, 2.0) + Math.pow(sideC, 2.0) - Math.pow(sideA, 2.0))/ 
				( 2.0 * sideB * sideC);
		// System.out.println("cosA = " + cosA);
		Acos = Math.acos(cosA);
		 
		Adeg = Math.toDegrees(Acos);
		 System.out.println("Angle of A = " + Adeg);
		
		// angle B
		cosB = (Math.pow(sideC, 2.0) + Math.pow(sideA, 2.0) - Math.pow(sideB, 2.0))/ 
				( 2.0 * sideC * sideA);
		// System.out.println("cosB = " + cosB);
		Bcos = Math.acos(cosB);
		 
		Bdeg = Math.toDegrees(Bcos);
		 System.out.println("Angle of B = " + Bdeg);
		
		// angle C
		cosC = (Math.pow(sideA, 2.0) + Math.pow(sideB, 2.0) - Math.pow(sideC, 2.0))/ 
				( 2.0 * sideA * sideB);
		// System.out.println("cosC = " + cosC);
		Ccos = Math.acos(cosC);
		  
		 
		Cdeg = Math.toDegrees(Ccos);
		System.out.println("Angle of C = " + Cdeg);
		
		String msg = "arcCos A, B, C = " + Acos + ", "
				+ Bcos + ", " + Ccos;
		msg = "Angle a, b, c: " +Adeg + Bdeg +Cdeg;
		JOptionPane.showMessageDialog(null, msg);
	}


} // end of class
