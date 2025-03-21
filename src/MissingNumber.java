class MissingNumber {
    public static void main(String[] args) {
        int[] numbers = {3,0,1};
        int ans = missingNumber(numbers);
        System.out.println(ans);
    }
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;

        for (int num : nums) {
            sum = sum - num;
        }
        return sum;
    }
}