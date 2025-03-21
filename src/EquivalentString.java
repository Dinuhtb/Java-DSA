public class EquivalentString {
    public static void main(String[] args) {
        String[] s1 = {"ab", "c"};
        String[] s2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(s1,s2));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = String.join("", word1);
        String s2 = String.join("", word2);
        return s1.equals(s2);
    }
}
