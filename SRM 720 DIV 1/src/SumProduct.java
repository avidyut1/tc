import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class SumProduct {
	long dp[][];
	long MOD = (int)1e9 + 7;
	int N = 205;
	long fact[];
	long invFact[];
	long pow10[];
	public void preComputation() {
		fact = new long[N];
		invFact = new long[N];
		pow10 = new long[N];
		fact[0] = 1L;
		for (int i = 1; i < N; i++) {
			fact[i] = (i * fact[i - 1]) % MOD;
		}
		invFact[N - 1] = binPow(fact[N - 1], MOD - 2);
		for (int i = N - 2; i >= 0; i--) {
            invFact[i] = (i + 1) * invFact[i + 1] % MOD;
            invFact[i] %= MOD;
		}
		pow10[0] = 1L;
		for (int i = 1; i < N; i++) {
			pow10[i] = 10L * pow10[i - 1];
			pow10[i] %= MOD;
		}
	}
	public long binPow(long a, long b) {
		if (a == 1 || b == 0) {
			return 1L;
		}
		if (b == 1) {
			return a % MOD;
		}
		long res = binPow(a, b / 2) % MOD;
		res = (res % MOD * res % MOD) % MOD;
		if (b % 2 != 0) {
			res = res * a;
			res %= MOD;
		}
		return res;

	}
	public long findSum(int[] amount, int blank1, int blank2) {
		preComputation();
		long ans = 0L;
		for (int i = 0; i < 10; i++) {
			if(amount[i] == 0)
				continue;
			amount[i]--;
			for (int j = 0; j < 10; j++) {
			    if (amount[j] == 0)
			    	continue;
				amount[j]--;
				long res = solve(blank1 + blank2 - 2, amount) * i * j;
				res %= MOD;
				for (int k = 0; k < blank1; k++) {
					for (int l = 0; l < blank2; l++) {
						ans = (ans + (res * pow10[l + k] % MOD) % MOD) % MOD;
						ans %= MOD;
					}
					res %= MOD;
				}
				amount[j]++;
			}
			amount[i]++;
		}
		return ans % MOD;
	}
	public long solve(int n, int a[]) {
		dp = new long[10][205];
		for (int i = 0; i < 10; i++) {
			Arrays.fill(dp[i], -1);
		}
		return (fact[n] * solve(0, n, a)) % MOD;
	}
	public long solve(int digit, int places, int a[]) {
		if (digit == 10) {
			return places == 0 ? 1: 0;
		}
		if (dp[digit][places] != -1) {
			return dp[digit][places];
		}
		long res = 0L;
		for (int i = 0; i <= a[digit] && i <= places; i++) {
			res = (res + (invFact[i] * solve(digit + 1, places - i, a) % MOD)) % MOD;
			res %= MOD;
		}
		dp[digit][places] = res;
		return res;
	}
}
