import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class CheeseSlicing {
	public int ans = 0;
	public int totalArea(int A, int B, int C, int S) {
        dfs(A, B, C, S);
		return ans;
	}
	public void dfs(int A, int B, int C, int S) {
		if (A >= B && A >= C) {
			if (A <= S) {
				return;
			}
			System.out.println("adding " + S + " " + B + " " + C) ;
			int min = Math.min(S, Math.min(B, C));
			if (min >= S)
				ans += (B * C);
			dfs(A - S, B, C, S);
		}
		else if (B >= A && B >= C) {
			if (B <= S) {
				return;
			}
			System.out.println("adding " + S + " " + A + " " + C) ;
            int min = Math.min(S, Math.min(A, C));
			if (min >= S) {
				ans += (A * C);
			}
			dfs(A, B - S, C, S);
		}
		else {
			if (C <= S) {
				return;
			}
			int min = Math.min(S, Math.min(A, B));
			if (min >= S)
				ans += (A * B);
			System.out.println("adding " + S + " " + A + " " + B) ;
			dfs(A, B, C - S, S);
		}
	}
}
