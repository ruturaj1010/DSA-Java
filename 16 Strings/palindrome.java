public class palindrome {
    public static void checkPalindrome(String str) {
        for(int i=0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length()-i-1)) {
                System.out.println("Given string is NOT palindrome.");
                return;
            }
        }
        System.out.println("String IS A palindrome.");
    }
    public static void main(String[] args) {
        String str = "madam";

        checkPalindrome(str);
    }
}
