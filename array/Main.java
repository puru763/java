import java.util.Arrays;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        
        for(int i=0;i<n;i++)
        {
            int j=i+1;
            
            while(j < n)
            {
                if(nums[i] + nums[j] == target)
                {
                    return new int[] {i, j};
                }
                else
                {
                    j++;
                }
            }
        }
        return new int[] {};
    }
}

public class Main {
    public static void main(String[] args) {
        TwoSum twoSumSolver = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSumSolver.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
