class LongestSubarraySolution  {
    public int maxSubArray(int[] nums) {
        int  sum=0;
        int maxi=Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++)
        {
            sum += nums[i];
            if(sum  < 0)
            {
                sum=0;
            }
            maxi= Math.max(maxi, sum);
        }
        
        return maxi;
        
    }
}



public class LongestSubarray {
    public static void main(String[] args) {
        LongestSubarraySolution solution = new LongestSubarraySolution();
        int result = solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        System.out.println("The length of the longest subarray with positive sum is: " + result);
    }
    
}
