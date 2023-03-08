import java.util.Scanner;

public class LeetCode2 {
        public static int searchInsert(int[] nums, int target) {
           int low=0;
           int high = nums.length;
           while (low<high) {
               int mid = low+(high-low)/2;
               if (target>nums[mid]) {
                   low = mid+1;
               }else{
                   high=mid;
               }
           }
        return low;
    }
    public static void main(String[] args) {
        Scanner nr = new Scanner(System.in);
        System.out.println("enter how much number you want to enter");
        int size = nr.nextInt();
        System.out.println("Enter your numbers in array");
        int [] nums = new int[size];
        for (int i = 0; i <nums.length; i++) {
              nums[i] = nr.nextInt();
        }
        System.out.println("enter target");
        int target = nr.nextInt();

        int result = searchInsert(nums,target);
        System.out.println(result);
    }
}
