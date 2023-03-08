import java.util.HashMap;
import java.util.Scanner;

class solution{
    public static int roman(String str){
        str = str.toUpperCase();
     if (str==null || str.length()==0) {
        return 0;
     }
     HashMap <Character,Integer> map = new HashMap<>();
     map.put('I', 1);
     map.put('V', 5);
     map.put('X', 10);
     map.put('L', 50);
     map.put('C', 100);
     map.put('D', 500);
     map.put('M', 1000);
    
     int result=0;
     for (int i=0;i<str.length();i++) {
          char c = str.charAt(i);
          int value = map.get(c);
          if (i<str.length()-1&&map.get(str.charAt(i+1))>value) {
            result -=value;
          }else{
            result +=value;
          }
     }
     return result;
    }
}

public class Roman_To_Integer {
    public static void main(String[] args) {
        Scanner nr = new Scanner(System.in);
        System.out.println("Enter a roman number");
        String str = nr.nextLine();
        int num = solution.roman(str);
        System.out.println(num);
    }
}
