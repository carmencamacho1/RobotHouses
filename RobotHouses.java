import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class RobotHouses {
	public static void main(String[] args) {
		//1. Create a robot.  
		Robot bob = new Robot();
		//2. Have the robot start in the bottom left corner of the window.  
//		bob.miniaturize();
//		bob.setSpeed(10);
//		bob.turn(-90);
//		bob.move(300);
//		bob.turn(-90);
//		bob.move(200);
//		bob.turn(180);
		//3. Draw a house with a flat roof, of height 100 with green grass after it.  
//		bob.penDown();
//		bob.setPenColor(35, 219, 49);
//		bob.turn(90);
//		bob.move(40);
//		bob.setPenColor(14, 234, 205);
//		bob.turn(-90);
//		bob.move(100);
//		bob.turn(90);
//		bob.move(40);
//		bob.turn(90);
//		bob.move(100);
//		
		//4. Use a for loop to draw 10 houses like the one in step 3..
//for (int i = 0; i <10; i++) {
//	bob.penDown();
//	bob.setPenColor(35, 219, 49);
//	bob.turn(90);
//	bob.move(40);
//	bob.setPenColor(14, 234, 205);
//	bob.turn(-90);
//	bob.move(100);
//	bob.turn(90);
//	bob.move(40);
//	bob.turn(90);
//	bob.move(100);
//	bob.turn(180);
//	
//}
		//5. Change the code to make the height random (100 - 500). Draw 10 houses of different heights
//				Random r = new Random();
//		for (int i = 0; i <10; i++) {
//			int num = r.nextInt(400)+100;
//			bob.penDown();
//			bob.setPenColor(35, 219, 49);
//			bob.turn(90);
//			bob.move(40);
//			bob.setPenColor(14, 234, 205);
//			bob.turn(-90);
//			bob.move(num);
//			bob.turn(90);
//			bob.move(40);
//			bob.turn(90);
//			bob.move(num);
//			bob.turn(180);
//			
//		}
		//6. Make each house drawn in a different (random) color. 
		Random r = new Random();
//		for (int i = 0; i <10; i++) {
//			int num = r.nextInt(400)+100;
//			bob.penDown();
//			bob.setPenColor(35, 219, 49);
//			bob.turn(90);
//			bob.move(40);
//			bob.setRandomPenColor();
//			bob.turn(-90);
//			bob.move(num);
//			bob.turn(90);
//			bob.move(40);
//			bob.turn(90);
//			bob.move(num);
//			bob.turn(180);
//			
//		}
		//7. Set the scene to night time by setting the background to black using Robot.setWindowColor(Color c)  
		bob.setWindowColor(0, 0, 0);
		bob.miniaturize();
		bob.setSpeed(10);
		bob.turn(-90);
		bob.move(300);
		bob.turn(-90);
		bob.move(200);
		bob.turn(180);
		for (int i = 0; i <10; i++) {
			int num = r.nextInt(300)+100;
			bob.setPenWidth(5);
			if(num>200){
				bob.penDown();
				bob.setPenColor(35, 219, 49);
				bob.turn(90);
				bob.move(40);
				bob.setRandomPenColor();
				bob.turn(-90);
				bob.move(num);
				bob.turn(90);
				bob.move(40);
				bob.turn(90);
				bob.move(num);
				bob.turn(180);
			}
			else{
				bob.penDown();
				bob.setPenColor(35, 219, 49);
				bob.turn(90);
				bob.move(40);
				bob.setRandomPenColor();
				bob.turn(-90);
				bob.move(num);
				bob.turn(30);
				bob.move(30);
				bob.turn(120);
				bob.move(30);
				bob.turn(30);
				bob.move(num);
				bob.turn(180);
			}
			
		}
		//8. Give the houses peaked roofs if their height is less than 300. Keep a flat roof if the house is more than 300.  */ 
	}
}
