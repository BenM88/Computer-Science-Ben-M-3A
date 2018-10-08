import javax.swing.JOptionPane;

public class cuboid {

// class variables go here
private double sideA, sideB, sideC;
private double volume;
private double surfaceArea;

// constructor goes here
public cuboid() {

}

// methods go here

public void setVarsToZero() {

sideA = 0.0;
sideB = 0.0;
sideC = 0.0;

} // end of setVarsToZero

public void setSides() {
sideA = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value of side A: "));
sideB = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value of side B: "));
sideC = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value of side C: "));
}

public void calcVolume() {
volume = (sideA * sideB * sideC);
}
public void calcSurfaceArea() {
surfaceArea = 2 * ((sideA * sideB) + (sideB * sideC) + (sideC * sideA));
}
public void showVars() {
String msg = "side A = " + sideA + ", " + "side B = " + sideB + ", " + "side C = " + sideC + ", " + "volume = " + volume + ", " + "surface area = " + surfaceArea;
JOptionPane.showMessageDialog(null, msg);
} // end of showVars

} // end of class

