import java.util.Scanner;

public class palindrome_number {
    public static boolean palindrome(int x){
        String str = Integer.toString(x);
        String rev =  new StringBuffer(str).reverse().toString();
        return rev.equals(str);

    }
    public static void main(String[] args) {
        Scanner nr = new Scanner(System.in);
        System.out.println("enter a number");
        int number = nr.nextInt();
        boolean ans = palindrome(number);
        System.out.println(ans);
    }
}
