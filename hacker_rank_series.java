import java.util.*;

public class hacker_rank_series {
    public static void main(String[] args) {
        Scanner nr = new Scanner(System.in);
        // first we want number of quires 
        int nq = nr.nextInt();
        for (int i=0;i<nq;i++) {
            int a = nr.nextInt();//first integer of each series
            int b = nr.nextInt();//second integer of each series 
            int n = nr.nextInt();//number of term in each series 
            int result = a;
            for (int j=0;j<n;j++) {
                result += (int) Math.pow(2, j)*b;
                System.out.print(result+" ");
            }
            System.out.println();
        }
        nr.close();
    }
}
