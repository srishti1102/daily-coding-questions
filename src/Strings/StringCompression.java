package Strings;

public class StringCompression {
    public static String compressString(String str){

        StringBuilder newString =new StringBuilder(" ");
        for(int i=0;i<str.length();i++){
            int count=1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newString.append(str.charAt(i));
            if(count>1){
                newString.append(count);
            }
        }
        return newString.toString();
    }
    public static void main(String[] args) {
        String str= "aaabbcccdd";
        System.out.println(compressString(str));
    }
}
