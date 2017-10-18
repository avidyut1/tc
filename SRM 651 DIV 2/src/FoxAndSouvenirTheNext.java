import java.util.*;
import java.math.*;
import static java.lang.Math.*;

//TODO
public class FoxAndSouvenirTheNext {
	
	public String ableToSplit(int[] value) {
		int sum = 0;
        int n = value.length;
		Arrays.sort(value);
        for (int i = 0; i < n; i++) {
            sum += value[i];
        }
        if (sum % 2 != 0) {
            return "Impossible";
        }
        if (value.length % 2 != 0) {
			return "Impossible";
		}
		boolean dp[][] = new boolean[sum + 1][n + 1];
        for (int i = 0; i < n; i++) {
            dp[value[i]][1] = true;
        }
        for (int i = 0; i <= sum; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= j; k++) {
                    if (i - value[k - 1] >= 0)
                        dp[i][k] = dp[i][k] || dp[i - value[k - 1]][j - k];
                }
            }
        }
        if (dp[sum/2][n/2]) {
            return "Possible";
        }
        return "Impossible";
	}
}
