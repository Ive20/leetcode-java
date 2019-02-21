import s14.Solution;

/**
 * Run
 */
public class Run {

    public static void main(String[] args) {
        String s[] = { "abab", "aba", "" };
        Solution sol = new Solution();
        var r = sol.longestCommonPrefix(s);
        System.out.println(r);
    }
}
