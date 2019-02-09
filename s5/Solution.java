package s5;

import java.util.ArrayList;

public class Solution {
    public String convert(String s, int numRows) {
        String result = "";
        if (numRows == 1) {
            return s;
        }
        ArrayList<String> temp = new ArrayList<String>();
        for (int i = 0; i < numRows; i++) {
            temp.add(new String());
        }
        for (int i = 0; i < s.length(); i = i + numRows * 2 - 2) {
            for (int j = i; (j < s.length() && j < i + numRows * 2 - 2); j++) {
                if ((j - i) < numRows) {
                    temp.set(j - i, temp.get(j - i) + s.charAt(j));
                } else {
                    temp.set(numRows * 2 - (j - i) - 2, temp.get(numRows * 2 - (j - i) - 2) + s.charAt(j));
                }
            }
        }
        for (int i = 0; i < temp.size(); i++) {
            result = result + temp.get(i);
        }
        return result;
    }
}