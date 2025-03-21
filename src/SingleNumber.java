public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,4,7,6,7,6};
        int ans = singleNumber(arr);
        System.out.println(ans);
    }
    public static int singleNumber(int[] nums) {
        int single  = 0;
        for (int i = 0; i < nums.length; i++) {
            single ^= nums[i];
        }
        return single;
    }
}