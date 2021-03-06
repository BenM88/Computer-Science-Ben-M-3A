package mousedraw;

import java.awt.Graphics2D;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class MouseDraw extends JFrame {
	
	
	Graphics2D g2D;

	public MouseDraw() {
		// frame constructor
		setTitle("Artististic Creations by Ben M! October 2018");
		setResizable(false);
		setSize(600, 400);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				exitForm(e);
			}

		});
		getContentPane().setLayout(new GridBagLayout());

	}// end of constructor

	private void exitForm(WindowEvent e) {
		g2D.dispose();
		System.exit(0);

	}

}// end of class MouseDraw
