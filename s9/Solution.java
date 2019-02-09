package s9;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }else {
            String temps = String.valueOf(x);
            int len = temps.length();
            int halfLen = len/2;
            for(int i = 0;i<halfLen;i++){
                if(temps.charAt(i)!=temps.charAt(len-i-1)){
                     return false;   
                }
            }
        }
        return true;
    }
}