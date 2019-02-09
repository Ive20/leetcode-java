package s8;

public class Solution {
    public int myAtoi(String str) {
        if (str == "") {
            return 0;
        }
        int result = 0;
        int strLen = str.length();
        String resultStr = "";
        boolean first = true;
        for (int i = 0; i < strLen; i++) {
            char temp = str.charAt(i);
            if (temp == ' ') {
                if (first) {
                    continue;
                } else {
                    break;
                }
            } else if (temp == '-') {
                if (first) {
                    resultStr = "-";
                    first = false;
                } else {
                    break;
                }
            } else if (temp == '+') {
                if (first) {
                    resultStr = "+";
                    first = false;
                } else {
                    break;
                }
            } else if (Character.isDigit(temp)) {
                resultStr = resultStr + temp;
                first = false;
            } else {
                if (first) {
                    return 0;
                } else {
                    break;
                }
            }
        }
        if (resultStr == "") {
            return 0;
        }
        if (resultStr == "-") {
            return 0;
        }
        if (resultStr == "+") {
            return 0;
        }
        try {
            result = Integer.valueOf(resultStr);
        } catch (NumberFormatException Exception) {
            if (resultStr.charAt(0) == '-') {
                result = -2147483648;
            } else {
                result = 2147483647;
            }
        }

        return result;
    }
}