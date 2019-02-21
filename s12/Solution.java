package s12;

public class Solution {
    public String intToRoman(int num) {
        String result = "";
        int mCount = num / 1000;
        for (int i = 0; i < mCount; i++) {
            result = result + "M";

        }
        num = num - mCount * 1000;
        if (num % 1000 != 0) {
            num = num % 1000;
            if (num >= 900) {
                result = result + "CM";
                num = num - 900;
            }
            int dCount = num / 500;
            for (int i = 0; i < dCount; i++) {
                result = result + "D";
            }
            num = num - dCount * 500;
            if (num >= 400) {
                result = result + "CD";
                num = num - 400;
            }
            int cCount = num / 100;
            for (int i = 0; i < cCount; i++) {
                result = result + "C";
            }
            if (num % 100 != 0) {
                num = num % 100;
                if (num >= 90) {
                    result = result + "XC";
                    num = num - 90;
                }
                int lCount = num / 50;
                for (int i = 0; i < lCount; i++) {
                    result = result + "L";
                }
                num = num - lCount * 50;
                if (num >= 40) {
                    result = result + "XL";
                    num = num - 40;
                }
                int xCount = num / 10;
                for (int i = 0; i < xCount; i++) {
                    result = result + "X";
                }
                if (num % 10 != 0) {
                    num = num % 10;
                    if (num >= 9) {
                        result = result + "IX";
                        num = num - 9;
                    }
                    int vCount = num / 5;
                    for (int i = 0; i < vCount; i++) {
                        result = result + "V";
                    }
                    num = num - vCount*5;
                    if (num >= 4) {
                        result = result + "IV";
                        num = num - 4;
                    }
                    int iCount = num;
                    for (int i = 0; i < iCount; i++) {
                        result = result + "I";
                    }
                }
            }
        }
        return result;

    }
}
