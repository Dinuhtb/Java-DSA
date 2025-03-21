import java.util.Arrays;

class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,4,3,5,7,8};
        int target = 4;

        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }
}
