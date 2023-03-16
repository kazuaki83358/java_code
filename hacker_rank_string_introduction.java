import java.util.Scanner;
public class hacker_rank_string_introduction {
    public static void main(String[] args) {
        Scanner nr = new Scanner(System.in);
        String A = nr.nextLine();
        String B = nr.nextLine();
        int sum = A.length()+B.length();
        System.out.println(sum);
        if (A.length()>B.length()) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        String resut = A.substring(0, 1).toUpperCase()+A.substring(1)+" "+B.substring(0, 1).toUpperCase()+B.substring(1);
        System.out.println(resut);
    }
    
}
