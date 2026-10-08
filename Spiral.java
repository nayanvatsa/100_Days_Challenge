import java.util.ArrayList;
public class Spiral {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        ArrayList<Integer> result = spiralTransverse(arr);
        System.out.println(result);
    }

    public static ArrayList<Integer> spiralTransverse(int[][] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int m = arr.length;
        if (m == 0) {
            return ans;
        }
        int n = arr[0].length;
        int fr = 0, lr = m - 1, fc = 0, lc = n - 1;
        while (fr <= lr && fc <= lc) {
            for (int j = fc; j <= lc; j++) {
                ans.add(arr[fr][j]);
            }
            fr++;
            for (int i = fr; i <= lr; i++) {
                ans.add(arr[i][lc]);
            }
            lc--;
            if (fr <= lr) {
                for (int j = lc; j >= fc; j--) {
                    ans.add(arr[lr][j]);
                }
                lr--;
            }
            if (fc <= lc) {
                for (int i = lr; i >= fr; i--) {
                    ans.add(arr[i][fc]);
                }
                fc++;
            }
        }
        return ans;
    }
}
