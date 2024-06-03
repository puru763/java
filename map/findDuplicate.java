import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class findDuplicateSolution {

    public static int[] duplicate(int[] arr) {
        Map<Integer, Integer> num = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (num.containsKey(arr[i])) {
                num.put(arr[i], num.get(arr[i]) + 1);
            } else {
                num.put(arr[i], 1);
            }
        }
        int[] duplicates = new int[num.size()];
        int j = 0;
        for (Map.Entry<Integer, Integer> entry : num.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates[j++] = entry.getKey();
            }
        }
        int[] result = new int[j];
        System.arraycopy(duplicates, 0, result, 0, j);
        return result;
    }
}

class findDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = findDuplicateSolution.duplicate(arr);

        System.out.println("The duplicate elements are : ");
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}