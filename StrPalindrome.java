
public class StrPalindrome {
    public static void main(String[] args) {
        System.out.println(checkPalindrome("ab ba"));

    }

    private static boolean checkPalindrome(String str){
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
