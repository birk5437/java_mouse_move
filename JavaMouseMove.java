import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
 
public class JavaMouseMove {
     
    public static void main(String[] args) {
         
        try {
             
            Robot robot = new Robot();
            // Creates the delay of 5 sec so that you can open notepad before
            // Robot start writting
            robot.delay(1000);
            int numberOfClicks;
            // robot.keyPress(KeyEvent.VK_H);
            // robot.keyPress(KeyEvent.VK_I);
            // robot.keyPress(KeyEvent.VK_SPACE);
            // robot.keyPress(KeyEvent.VK_B);
            // robot.keyPress(KeyEvent.VK_U);
            // robot.keyPress(KeyEvent.VK_D);
            // robot.keyPress(KeyEvent.VK_Y);
            // robot.mouseMove(667,571);
            // robot.delay(100);
            for(int i = 0; i < 10; i++){
                System.out.println("Moving mouse and stuff!");
                for (int y = 520; y < 700; y+=80){
                    robot.mouseMove(667,y);
                    if(y==600){
                        numberOfClicks=60;}else{numberOfClicks=20;}
                    // robot.delay(50);
                    for(int j = 0; j < numberOfClicks; j++){
                        robot.mousePress(InputEvent.BUTTON1_MASK);
                        robot.delay(33);
                        robot.mouseRelease(InputEvent.BUTTON1_MASK);
                    }
                }
                // robot.mousePress(1);
                // robot.delay(50);
                // robot.mouseRelease(1);
                // robot.mousePress(0);
                // robot.delay(50);
                // robot.mouseRelease(0);


                // robot.mousePress(InputEvent.BUTTON2_MASK);
                // robot.delay(50);
                // robot.mouseRelease(InputEvent.BUTTON2_MASK);
            }
             
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}
