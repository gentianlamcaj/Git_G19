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
}


