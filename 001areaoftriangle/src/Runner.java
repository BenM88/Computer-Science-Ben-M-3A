import javax.swing.JOptionPane;

public class Runner {

	public static void main(String[] args) {

		// Instantiate each class

		Triangle myTriangle = new Triangle();
		Rectangle myRectangle = new Rectangle();
		Circle myCircle = new Circle();
		sphere mySphere = new sphere();
		cuboid myCuboid = new cuboid();
		
		String welc = "Welcome to my Java Project! Created by: Ben M";
		JOptionPane.showMessageDialog(null, welc);
		int goAgain = 1;

		while (goAgain == 1) {

			String msg = "Please enter your selection: Triangle, Circle, Rectangle, Cuboid, Sphere";
			String answer = JOptionPane.showInputDialog(msg);
			JOptionPane.showMessageDialog(null, answer);

			// when comparing strings == is unreliable
			// Instead use string class methods
			if (answer.equals("Triangle") || (answer.equals("triangle"))) {
				JOptionPane.showMessageDialog(null, "YES! We're in Triangle");
				myTriangle.setVarsToZero();

				myTriangle.setSides();

				myTriangle.calcPerimeter();

				myTriangle.calcArea();
				myTriangle.calcAngles();
				myTriangle.showVars();

			} else if (answer.equals("Circle") || (answer.equals("circle"))) {
				JOptionPane.showMessageDialog(null, "YES! We're in Circle");
				myCircle.setVarsToZero();

				myCircle.setRadius();

				myCircle.calcCircumference();

				myCircle.calcArea();
				
				myCircle.showVars();

			} else if (answer.equals("Rectangle") || (answer.equals("rectangle"))) {
				JOptionPane.showMessageDialog(null, "YES! We're in Rectangle");
				myRectangle.setVarsToZero();

				myRectangle.setSides();

				myRectangle.calcPerimeter();

				myRectangle.calcArea();
				myRectangle.calcDiag();
				myRectangle.showVars();

			} else if (answer.equals("Cuboid") || (answer.equals("cuboid"))) {
				JOptionPane.showMessageDialog(null, "YES! We're in Cuboid");
				myCuboid.setVarsToZero();

				myCuboid.setSides();

				myCuboid.calcVolume();

				myCuboid.calcSurfaceArea();
				
				myCuboid.showVars();

			} else if (answer.equals("Sphere") || (answer.equals("sphere"))) {
				JOptionPane.showMessageDialog(null, "YES! We're in Sphere");
				mySphere.setVarsToZero();

				mySphere.setRadius();

				mySphere.calcVolume();

				mySphere.calcSurfaceArea();
				
				mySphere.showVars();

			} else {
				JOptionPane.showMessageDialog(null, "Yikes! I know not what you ask!");

			}

			msg = "Would you like to go again (Y/N)";
			answer = JOptionPane.showInputDialog(msg);

			JOptionPane.showMessageDialog(null, answer);

			if (answer.equals("Y") || answer.equals("y") || answer.equals("Yes") || answer.equals("yes")) {
				goAgain = 1;
			} else {
				goAgain = 0;
				JOptionPane.showMessageDialog(null, "Thank you! Come again!");
			}
		} // end of while
	}

} // end of main
