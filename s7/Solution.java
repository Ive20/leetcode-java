package s7;


public class Solution {
    public int reverse(int x) {
        int y = x;
        String xtemp = String.valueOf(x);
        String ytemp = "";
        int length = xtemp.length();
        boolean under0 = false;
        if (xtemp.charAt(0) == '-') {
            under0 = true;
        }
        for (int i = 0; i < length; i++) {
            if (under0 && i == length - 1) {
                continue;
            }
            ytemp = ytemp + xtemp.charAt(length - 1 - i);
        }
        try{
            y = Integer.valueOf(ytemp);
        }catch(NumberFormatException Exception){
            y=0;
        }
       
        if (under0 ){
            y = 0-y;
        }
        return y;
    }
}