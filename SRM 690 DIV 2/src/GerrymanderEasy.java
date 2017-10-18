import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class GerrymanderEasy {
	
	public double getmax(int[] A, int[] B, int K) {
		int n = A.length;
		double ans = Double.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				if (j - i + 1 >= K) {
					long sumv = 0l, sumc = 0l;
					for (int k = i; k <= j; k++) {
						sumv += A[k];
						sumc += B[k];
					}
					double lans = (double)sumc / sumv;
					ans = Math.max(ans, lans);
				}
			}
		}
		return ans;
	}
}
