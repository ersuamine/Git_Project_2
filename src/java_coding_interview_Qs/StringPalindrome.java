package java_coding_interview_Qs;

public class StringPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Java")); //false

        System.out.println(isPalindrome("kazak")); //true


    }

    public static boolean isPalindrome(String str) {
        //convert given String to lowercase
        str = str.toLowerCase();
        String result = "";

        String[] array = str.split("");
        for (int i = str.length() - 1; i >= 0; i--) {
            //get character at current index and concatenate it to result string
            result += str.charAt(i);
        }
        //compare given string with the reversed string
        //when strings are equal, that means palindrome
        return str.equals(result);
    }

}
/*
A string is said to be a palindrome if it is the same if we start reading it from left to right or right to left.

Display true when given string is palindrome
Display false when given string is not a palindrome

example:

input: str = “abba”
output: Yes

input: str = “cydeo”
output: false

 */