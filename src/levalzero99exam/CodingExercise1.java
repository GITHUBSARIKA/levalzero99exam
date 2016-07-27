package levalzero99exam;

import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

	public static void main(String[] args) {
		// 3. ask the user what color they would like the Robot to draw

		// 4. use an if/else statement to set the pen color that the user
		// requested (minimum of 2 colors)

		// 2. set the pen width to 10

		// 1. make the Robot draw a shape
		Robot hi = new Robot();

		hi.setPenWidth(10);
		
		String color = JOptionPane.showInputDialog("What color do you want?blue or neonpurple");
		
		if (color.equals("blue")) {		
			hi.setPenColor(000, 000, 238);
			hi.penDown();
			for (int i = 0; i < 4; i++) {
				hi.move(100);
				hi.turn(90);
			}}
			if (color.equals("neonpurple")) {				
				hi.setPenColor(119, 000, 255);
				hi.penDown();
				for (int i = 0; i < 4; i++) {
					hi.move(100);
					hi.turn(90);
				}
			}
		
	}

}
