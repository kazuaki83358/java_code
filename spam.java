import java.awt.AWTException;
import java.awt.Robot;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;
import java.util.Scanner;

public class spam {
    public static void main(String[] args) throws AWTException, InterruptedException {
        int count=1;
        Robot robot = new Robot();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your message:");
        String text = scanner.nextLine();
        StringSelection stringSelection = new StringSelection(text);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
        System.out.println("Spamming will start in 10 seconds...");
        Thread.sleep(10000);
        while (count <= 10) {
            Thread.sleep(1000);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            count++;
        }
        System.out.println("Spamming finished.");
    }
}
