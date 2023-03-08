import java.util.Scanner;

public class LeetCode {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
    
    public static void main(String[] args) {
        Scanner nr = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = nr.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter the numbers in the array:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nr.nextInt();
        }
        System.out.println("Enter your target:");
        int target = nr.nextInt();
        LeetCode solution = new LeetCode();
        int[] result = solution.twoSum(nums, target);
        System.out.println("The positions of the array elements which add up to the target are: " + result[0] + " and " + result[1]);
    }
}
