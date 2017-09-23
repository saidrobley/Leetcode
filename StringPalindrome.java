/**
 * Created by saidrobley on 9/23/17.
 */
public class StringPalindrome {

    public static void main(String[] args) {
        System.out.println(checkPalindrome("ab ba"));

    }

    private static boolean checkPalindrome(String str){
        int i = str.length() - 1; // the end of the string
        int j = 0; // the beginning of the string
        while(true){
            if(str.charAt(i) == str.charAt(j)){
                i--;
                j++;
            } else{
                return false;
            }

            if(i == j || j > i){
                return true;
            }
        }
    }


}
