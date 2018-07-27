public class Palindrome {
    public static boolean isPalindrome(String word) {

        word = word.toLowerCase();
        String reverseWord = new StringBuilder(word).reverse().toString();
        if (word.equals(reverseWord)) return true; else return false;
    }

    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Level"));
    }
}
