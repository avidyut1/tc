import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class PalindromePrime {
	
	public int count(int L, int R) {
		int n = 100000;
		boolean isprime[] = new boolean[n];
		Arrays.fill(isprime, true);
		isprime[0] = isprime[1] = false;
		for (int i = 2; i < n; i++) {
			if (isprime[i]) {
				for (int j = 2 * i; j < n; j+= i) {
					isprime[j] = false;
				}
			}
		}
		int ans = 0;
		for (int i = L; i <= R; i++) {
			if (isprime[i] && ispalin(i)) {
				ans++;
			}
		}
		return ans;
	}
	public boolean ispalin(int i) {
		String s = i+"";
		int k = s.length() % 2 == 0 ? (s.length() / 2) -  1: s.length() / 2;
		int l = s.length() - 1;
		for (int j = 0; j <= k; j++) {
			if (s.charAt(j) != s.charAt(l)) {
				return false;
			}
			l--;
		}
		return true;
	}
}
