public class MethodsHere {
    /*
    please follow Guzel Worklow and paste your methods here at the end of the file
     */

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

}
