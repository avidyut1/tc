import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class RepeatStringEasy {
	
	public int maximalLength(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            res = Math.max(res, lcsubs(s.substring(0, i).toCharArray(), s.substring(i).toCharArray()));
        }
        return 2* res;
    }
    public int lcsubs(char x[], char y[]) {
        int m = x.length;
        int n = y.length;
        int lcs[][] = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    lcs[i][j] = 0;
                } else if (x[i - 1] == y[j - 1]) {
                    lcs[i][j] = lcs[i - 1][j - 1] + 1;
                } else {
                    lcs[i][j] = Math.max(lcs[i - 1][j], lcs[i][j - 1]);
                }
            }
        }
        return lcs[m][n];
    }
}
