import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class SplitIntoPairs {
	
	public int makepairs(int[] A, int X) {
		Arrays.sort(A);
		int ans = 0;
		boolean paired[] = new boolean[A.length];
		for (int i = 0; i < A.length; i++) {
            if (paired[i])
            	continue;
			paired[i] = true;
			for (int j = 0; j < A.length; j++) {
				if (i == j || paired[j]) {
					continue;
				}
				if ((long)A[i] * A[j] >= X) {
					ans++;
					paired[j] = true;
					break;
				}
			}
		}
		return ans;
	}
}
