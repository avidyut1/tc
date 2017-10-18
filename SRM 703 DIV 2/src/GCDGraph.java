import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class GCDGraph {
	
	public String possible(int n, int k, int x, int y) {
		Vector<Integer> gcdx = new Vector<>();
		Vector<Integer> gcdy = new Vector<>();
		for (int i = 1; i <= n; i++) {
			if (gcd(x, i) > k) {
				gcdx.add(i);
			}
		}
		for (int i = 1; i <= n; i++) {
			if (gcd(y, i) > k) {
				gcdy.add(i);
			}
		}
		for (int i = 0; i < gcdx.size(); i++) {
			for (int j = 0; j < gcdy.size(); j++) {
				if (gcd(gcdx.get(i), gcdy.get(j)) > k) {
					return "Possible";
				}
			}
		}
		return "Impossible";
	}
	public int gcd(int a, int b) {
		if (a == 0 || b == 0) {
			return a + b;
		}
		return gcd(b, a % b);
	}
}
