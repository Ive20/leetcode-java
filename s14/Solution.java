package s14;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        String reuslt = "";

        for (String str : strs) {
            if (str.equals("")) {
                return "";
            }
            if (reuslt.equals("")) {
                reuslt = str;
            } else {

                for (int i = 0; i < reuslt.length() && i < str.length(); i++) {
                    if (reuslt.charAt(i) != str.charAt(i)) {
                        reuslt = reuslt.substring(0, i);
                        if (i == 0) {
                            return "";
                        }
                        break;
                    }
                    if (i == str.length() - 1) {
                        reuslt = str;
                    }

                }
            }
        }
        return reuslt;
    }
}
