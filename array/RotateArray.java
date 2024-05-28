import java.util.Arrays;

class RotateArraySolution {
    int[] rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
        return nums;
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    
}


public class RotateArray {
    public static void main(String[] args) {
        RotateArraySolution solution = new RotateArraySolution();
        int [] nums = {1,2,3,4,5,6,7};
        int k = 3;
        solution.rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }
    
}
