public class MethodsHere {
    /*
    please follow Guzel Worklow and paste your methods here at the end of the file
     */


    /*
      Given a string, consider the prefix string made of the first N chars of the string. Does that prefix string
    appear somewhere else in the string? Assume that the string is not empty and that N is in the range 1..str.length().
    prefixAgain("abXYabc", 1) → true
    prefixAgain("abXYabc", 2) → true
    prefixAgain("abXYabc", 3) → false
     */

    // Here is my solution for the question

    public static boolean prefixAgain(String str, int n) {
        if (str.length() > 1) {
            if (str.substring(n, str.length() - 1).contains(str.substring(0, n))) {
                return true;
            }
        }
        if (str.length() == 2) {
            if (str.substring(0, 1).contains(str.substring(n))) {
                return true;
            }
        } else {
            return false;
        }
        return false;

    }//method end here

    /*  Beyza:
            String - 1: minCat
            Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.
                        Ex: minCat("Hello", "Hi") → "loHi"
     */
    public String minCat(String a, String b) {

        String append = "";

        if (a.length() == b.length()) {
            append = a + b;
        } else if (a.length() > b.length()) {
            int bLength = b.length();
            append = a.substring(a.length() - bLength) + b;
        } else {
            int aLength = a.length();
            append = a + b.substring(b.length() - aLength);
        }
        return append;
    }

    public int stringMatch(String a, String b) {
        int len = Math.min(a.length(), b.length());
        int count = 0;

        for (int i = 0; i < len - 1; i++) {
            String aSub = a.substring(i, i + 2);
            String bSub = b.substring(i, i + 2);
            if (aSub.equals(bSub)) {  // Use .equals() with strings
                count++;
            }
        }

        return count;
    }

    //Deniz-Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.
    public int blackjack(int a, int b) {
        if (a <= 21 && (a > b || b > 21))
            return a;
        if (b <= 21 && (b > a || a > 21))
            return b;
        return 0;


    }


    // some changes here


// Zoubair: random code for practice

 /*   public static void main(String[] args) {
        String s = "java";
        //          0123
        System.out.println("First character " + s.charAt(0));

        System.out.println("Second character " + s.charAt(1));
        System.out.println("Third character " + s.charAt(2));

        System.out.println("Fourth character " + s.charAt(3));
        // System.out.println("Invalid  character " + s.charAt(100)); is not a valid index in our string


    }  */

    /*
    Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".


stringBits("Hello") → "Hlo"
stringBits("Hi") → "H"
stringBits("Heeololeo") → "Hello"
     */

    public String stringMadeOfEveryOtherChar (String str){
        String result="";
        for (int i=0; i<str.length(); i=i+2){
            result+=""+str.charAt(i);
        }
        return result;
    }

    /*
    Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".

    frontAgain("edited") → true
    frontAgain("edit") → false
    frontAgain("ed") → true
     */

    public boolean frontAgain(String str) {

        if (str.length() < 2) {
            return false;
        }

        String front = str.substring(0, 2);
        String end = str.substring(str.length() - 2);
        return front.equals(end);


    }

    /*
        Beyza:
            Given a string, return a string where for every char in the original, there are two chars.
    */
    public String doubleChar(String str) {

        String result="";

        for(int i = 0; i < str.length(); i++){
            char letter = str.charAt(i);
            result += "" + letter + letter;
        }

        return result;
    }

    /*
    Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
sum28([2, 3, 2, 2, 4, 2]) → true
sum28([2, 3, 2, 2, 4, 2, 2]) → false
sum28([1, 2, 3, 4]) → false
     */

    public boolean sum28(int[] nums) {
        int sum=0;
        for (int i=0; i<nums.length; i++){
            if (nums[i]==2){
                sum+=nums[i];
            }
        }
        return (sum==8);
    }

}



