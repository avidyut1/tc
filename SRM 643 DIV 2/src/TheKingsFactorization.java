import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class TheKingsFactorization {
	
	public long[] getVector(long N, long[] primes) {
		long n = N;
        Vector<Long> v = new Vector<Long>();
		for (int i = 0; i < primes.length; i++) {
            v.add(primes[i]);
			n /= primes[i];
		}
		for (int i = 2; 2 * i * i * i <= N; i++) {
			while(n % i == 0) {
				v.add((long)i);
				n /= i;
			}
		}
		if (n > 1) {
			v.add(n);
		}
		Collections.sort(v);
		long res[] = new long[v.size()];
		for (int i = 0; i < v.size(); i++) {
			res[i] = v.get(i);
		}
		return res;
	}
}
