package extra;

import java.awt.Color;
import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {

	public static void main(String[] args) {

		// 1. Create a new Robot
		Robot r2 = new Robot("batman");
r2.sparkle();
		r2.penDown();
		r2.miniaturize();
		// 2. Set the speed to 100
		r2.setSpeed(100);
		int colorChoice = JOptionPane.showOptionDialog(null, "hello what color", "what color", JOptionPane.INFORMATION_MESSAGE,
				JOptionPane.DEFAULT_OPTION, null, new String[] { "Red", "Green", "Blue" }, 0);

		// 3. Use if statements to check the the value of colorChoice and set the pen
		// color accordingly
		if (colorChoice == 0) {
			r2.setPenColor(255, 0, 0);
		}
		if (colorChoice == 1) {
			r2.setPenColor(0, 255, 0);
		}
		if (colorChoice == 2) {
			r2.setPenColor(0, 0, 255);
		}
		// 4. Ask the use how many polygons they want to be drawn.
String num = JOptionPane.showInputDialog(null, "how many polygons do you want batman to draw 100 - 200");
		int r2r2 = Integer.parseInt(num);
		// 5. Use the robot to draw the number of polygons the user requested.
for (int i = 0; i < r2r2; i++) {
	

		for(int ai = 0; ai < 76876786; ai++) {
r2.move(50);
r2.turn(50);
r2.move(51);
r2.turn(51);
r2.move(52);
r2.turn(52);		
r2.move(53);
r2.turn(53);		
		
		
		
		}// 6. Make it so your shapes do not overlap
}		
		// 7. Challenge: add more colors to the Option Dialog.
	
	}
}
