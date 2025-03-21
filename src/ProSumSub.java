class ProSumSub {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
    }
    public static int subtractProductAndSum(int num) {
        int prod = 1;
        int sum = 0;
        while(num > 0){
            sum = sum + num %10;
            prod = prod * (num %10);
            num = num /10;
        }
        return prod-sum;
    }
}