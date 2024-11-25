package Strings;

public class CheckPalindrome {
    public static boolean palindrome(String name){
        int n=name.length()-1;
        for(int i=0; i<name.length()/2;i++){
            if(name.charAt(i)!=name.charAt(n-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String name="raceca";
        System.out.println(palindrome(name));
    }
}
