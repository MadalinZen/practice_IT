package PracticeIT_Cap4_ConditionalExecution;

public class PalindromNumber {

    public static void main(String[] args) {

        System.out.println(isPalindrom(76267));

    }


    public static boolean isPalindrom(int number) {
        int palindrome = number; // copied number into variable
        int reverse = 0;

        while (palindrome != 0) {
            int tmp = palindrome % 10;
            reverse = reverse * 10 + tmp;
            palindrome = palindrome / 10;
        }

        // if original and reverse of number is equal means
        // number is palindrome in Java
        if (number == reverse) {
            return true;
        }
        return false;
    }
}
