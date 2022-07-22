//A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
//
//Given a string s, return true if it is a palindrome, or false otherwise.

public class stringpalindrome {
    public static void main(String[] args) {
        boolean result =  isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(result);
    }
    public static boolean isPalindrome(String s) {
        boolean result = true;
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]","");
        int st = 0;
        int end = s.length()-1;
        while(st<end){
            if(s.charAt(st) != s.charAt(end)){
                result = false;
                break;
            }
            else if((s.toLowerCase()).charAt(st) == (s.toLowerCase()).charAt(end)){
                st++;
                end--;
            }
        }
        return result;
    }
}
