import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class CountryGroup {
	
	public int solve(int[] a) {
		int count[] = new int[101];
		for (int i = 0; i < a.length; i++) {
			count[a[i]]++;
		}
		int ans = 0;
		for (int i = 1; i < 101; i++) {
			if (count[i] % i == 0) {
				ans += count[i] / i;
			}
			else{
				return -1;
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 1) continue;
			int j;
			for (j = i; j < Math.min(a.length, i + a[i]); j++) {
				if (a[j] != a[i]) {
					return -1;
				}
			}
			i = j - 1;
		}
		return ans;
	}
}
