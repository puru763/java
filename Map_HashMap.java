import java.util.HashMap;
import java.util.Map;

public class Map_HashMap {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> arr = new HashMap<>();
        
        for (int i : nums) {
            arr.put(i, arr.getOrDefault(i, 0) + 1);
            if (arr.get(i) > nums.length / 2) {
                return i;
            }
        }
        
        return 0;
    }

    public static void main(String[] args) {
        Map_HashMap map_HashMap = new Map_HashMap();
        int[] nums = {2,2,1,1,1,2,2};
        int result = map_HashMap.majorityElement(nums);
        System.out.println("The majority element is: " + result);
    }
}
