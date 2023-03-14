import java.util.Scanner;
import java.util.Stack;

public class reverse_string_using_stack {
    public static String reveString(String str){
        char[] c = new char[str.length()];
        //creatng a stack for character type
        Stack<Character> st = new Stack<>();
        //now puhing the chracter in stack using loop 
        for (int i=0;i<str.length();i++) {
            st.push(str.charAt(i));
        }
        //now poping the chrachter using loop until it is empty and store reverse in character array
        int i=0;
        while (!st.isEmpty()) {
            c[i++]=st.pop();
        }
        //return the string object
        return String.valueOf(c);
    }                       
    public static void main(String[] args) {
        Scanner nr = new Scanner(System.in);
        System.out.println("enter a string");
        String str = nr.nextLine();
       System.out.println("reverse string using stack"+reveString(str)); 
    }
}
