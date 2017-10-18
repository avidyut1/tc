import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class PowerEquationEasy {
	
	public long count(int n) {
		long ans = n * n;
		int MOD = (int)1e9 + 7;
		ans %= MOD;
		for (int i = 2; i <= n; i++) {
			ans += n;
			for (int j = 1; j <= 32; j++) {

			}
			ans %= MOD;
		}
		return ans % MOD;
	}
}
