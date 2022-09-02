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
        if(str.length()>1){
            if(str.substring(n,str.length()-1).contains(str.substring(0,n))){
                return true;}
        }if(str.length()==2){
            if(str.substring(0,1).contains(str.substring(n))){
                return true;}
        }else{
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

        if(a.length() == b.length()){
            append = a + b;
        }else if(a.length() > b.length()){
            int bLength = b.length();
            append = a.substring(a.length() - bLength) + b;
        }else{
            int aLength = a.length();
            append = a + b.substring(b.length() - aLength);
        }
        return append;
    }
    public int stringMatch(String a, String b) {
        int len = Math.min(a.length(), b.length());
        int count = 0;

        for (int i=0; i<len-1; i++) {
            String aSub = a.substring(i, i+2);
            String bSub = b.substring(i, i+2);
            if (aSub.equals(bSub)) {  // Use .equals() with strings
                count++;
            }
        }

        return count;
    }

}


