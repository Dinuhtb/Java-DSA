class RemElement {
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2};
        int target = 2;
        int ans  = removeElement(arr, target);
        System.out.println(ans);
    }
    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
