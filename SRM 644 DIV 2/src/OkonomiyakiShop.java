import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class OkonomiyakiShop {
	
	public int count(int[] osize, int K) {
		int ans = 0;
		Arrays.sort(osize);
		int n = osize.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (Math.abs(osize[i] - osize[j]) <= K) {
					ans++;
				}
			}
		}
		return ans;
	}
}
