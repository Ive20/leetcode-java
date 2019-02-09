import s11.Solution;

/**
 * Run
 */
public class Run {

    public static void main(String[] args) {
        int[] s = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        Solution sol = new Solution();
        int r = sol.maxArea(s);
        System.out.println(r);
    }
}
