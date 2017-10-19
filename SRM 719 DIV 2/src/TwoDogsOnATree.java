import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class TwoDogsOnATree {
	
	public int maximalXorSum(int[] parent, int[] w) {
		if (parent.length == 1) {
			return w[0];
		}
		HashSet<Integer> hs = new HashSet<>();
		int n = w.length + 1;
		int xor[] = new int[n];
		for (int i = 1; i < n; i++) {
			xor[i] = xor[parent[i - 1]] ^ w[i - 1];
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				hs.add(xor[i] ^ xor[j]);
			}
		}
		int max = 0;
		for (int res1: hs) {
		    for (int res2: hs) {
		    	max = Math.max(max, res1 ^ res2);
			}
		}
		return max;
	}
}
