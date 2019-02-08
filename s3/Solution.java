package s3;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            List<Character> used = new ArrayList<>();
            if (result >= s.length() - i) {
                break;
            }
            int temp =0;
            for (int j = i; j < s.length(); j++) {
                if (used.contains(s.charAt(j))) {
                    break;
                } else {
                    temp ++;
                    if (result < temp) {
                        result = temp;
                    }
                    used.add(s.charAt(j));
                }
            }
        }
        return result;
    }
}