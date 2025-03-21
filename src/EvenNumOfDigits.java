class EvenNumOfDigits {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        int ans = findNumbers(arr);
        System.out.println(ans);
    }
    public static int findNumbers(int[] nums) {
        int count = 0 ;

        for( int i = 0 ; i < nums.length ; i++){
            if(String.valueOf(nums[i]).length() % 2 ==0)  {
                count++;
            }
        }
        return count;
    }
}