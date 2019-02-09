package s5;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==0){
            return "";
        }
        int result = 1;
        String resultStr = s.substring(0,1);
        for (int i = 0; i < s.length(); i++) {
            int hasMoreChar = s.lastIndexOf(s.charAt(i),s.length());
            while(hasMoreChar!=i&&hasMoreChar != -1&&result < hasMoreChar+1-i){
                int  helfHasMoreChar  =0;
                if((hasMoreChar-i+1)%2 ==0){
                     helfHasMoreChar =  (hasMoreChar-i+1)/2 -1+i;
                }else{
                     helfHasMoreChar =  (hasMoreChar-i)/2-1+i;
                }
                for (int j = i; j <= helfHasMoreChar; j++) {
                    if(s.charAt(j) != s.charAt(hasMoreChar-j+i)){
                            break; 
                    }
                    if(j == helfHasMoreChar){
                        resultStr = s.substring(i, hasMoreChar+1);
                        result  = resultStr.length();
                    }
                }
                hasMoreChar = s.lastIndexOf(s.charAt(i),hasMoreChar-1);
            }
        }
        return resultStr;
    }
}