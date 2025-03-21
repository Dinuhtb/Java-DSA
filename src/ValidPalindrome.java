public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("a cac a"));
    }
    public static boolean isPalindrome(String s) {
        String st = s.replaceAll("[^a-zA-Z0-9]","");
        char [] c = st.toLowerCase().toCharArray();
        for(int i=0,j=c.length-1;i<=j;i++,j--){
            if(c[i]!=c[j]){
                return false;
            }
        }
        return true;
    }
}
