/**
 * Created by saidrobley on 9/22/17.
 */
public class StrPalindrom {
    public static void main(String[] args) {
        System.out.println(checkPalindrom("abba"));

    }

    private static boolean checkPalindrom(String str){
        int i = str.length() - 1;
        int j = 0;
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
