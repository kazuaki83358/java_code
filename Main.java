import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lineNumber = 0;
        while (sc.hasNext()) {
            lineNumber++;
            System.out.println(lineNumber + " " + sc.nextLine());
        }
    }
}
