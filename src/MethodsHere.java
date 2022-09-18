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
Given three ints, a b c, return true if one of them is 10 or more less than one of the others.


lessBy10(1, 7, 11) → true
lessBy10(1, 7, 10) → false
lessBy10(11, 1, 7) → true
 */
public boolean lessBy10(int a, int b, int c) {
    return (Math.abs(a-b)>=10 || Math.abs(b-c)>=10 || Math.abs(a-c)>=10);
}


    //Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.

    public boolean sameStarChar(String str) {
        int count1 = 0;
        int count2 = 0;
        for(int i = 1; i < str.length()-1; i++){
            if(str.charAt(i) == '*'){
                count1++;
                if(str.charAt(i-1) == str.charAt(i+1))
                    count2++;
            }
        }
        if(count1 == count2)
            return true;
        return false;
    }

    /*
    Given a non-empty string and an int N, return the string made starting with char 0,
    and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.

    everyNth("Miracle", 2) → "Mrce"
    everyNth("abcdefg", 2) → "aceg"
    everyNth("abcdefg", 3) → "adg"
     */

    public String everyNth(String str, int n) {
        String result = "";

        for (int i = 0; i < str.length(); i += n) {
            result += str.charAt(i);
        }

        return result;
    }

    /*
    Given a string and a non-negative int n, return a larger string that is n copies of the original string.

    stringTimes("Hi", 2) → "HiHi"
    stringTimes("Hi", 3) → "HiHiHi"
    stringTimes("Hi", 1) → "Hi"
     */
    public String stringTimes(String str, int n) {
        String result = "";

        for (int i = 0; i < n; i++) {
            result += str;
        }

        return result;
    }


}



