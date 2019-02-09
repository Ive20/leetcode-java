package s11;

public class Solution {
    public int maxArea(int[] height) {
        int reuslt = 0;
        int len = height.length;
        for (int i = 0; i < len; i++) {
            if (reuslt >= height[i] * (len - i)) {
                continue;
            }
            for (int j = i + 1; j < len; j++) {
                int min = 0;
                if (height[i] >= height[j]) {
                    min = height[j];
                } else {
                    min = height[i];
                }
                if (reuslt < min * (j - i )) { 
                    reuslt =   min * (j - i );
                }
            }
        }
        return reuslt;
    }
}
